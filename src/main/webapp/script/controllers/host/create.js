/**
 * Created by Helen on 13-12-24.
 */
controllers.controller('hostCreateCtrl',
    ['hostServices', 'osList', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(hostServices, osList, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {
            //步骤状态初始化
            $scope.steps = [{active: true},{active: false},{active:false}];

            //初始值
            $scope.newHost = {};//接口中还不接受但页面中要实现效果的放在这个里面，不影响接口的调用
            $scope.newHost.region = '华东双线';
            $scope.newHost.line = '无网络';
            $scope.newHost.speedType = '独享';

            // $scope.newHost = {};
            commonDiskRange.min = 0;//重新设置默认最小值
            commonDiskOptions.min = 0;//重新设置默认最小值
            //文本框
            $scope.newHost.dataDiskSize = commonDiskRange.min;
            //滑动条
            $scope.diskRange = commonDiskRange;
            $scope.diskOptions = commonDiskOptions;

            commonMemoryRange.min = 2;//重新设置默认最小值
            commonMemoryOptions.min = 2;//重新设置默认最小值
            //文本框
            $scope.newHost.ram = commonMemoryRange.min;
            //滑动条
            $scope.memoryRange = commonMemoryRange;
            // $scope.memoryOptions = commonMemoryOptions;

            commonCPURange.min = 1;//重新设置默认最小值
            // commonCPUOptions.min = 1;//重新设置默认最小值
            //文本框
            // $scope.newHost.cpu = commonCPURange.min;
            //滑动条
            $scope.CPURange = commonCPURange;
            // $scope.CPUOptions = commonCPUOptions;

            /* ---------------cpu--------------- */
            var cpuList = [1,2,4,6,8,10,12,16,20,24,32];
            $scope.newHost.cpu = cpuList[0];
            // $scope.cpusliderValue = 0;
            $scope.CPUOptions = {
                orientation: 'horizontal',
                min: 0,
                max: 10,
                step: 1,
                range: 'min',
                slide: function(ev, ui){
                    $scope.newHost.cpu = cpuList[ui.value];
                    $scope.$apply();
                }
            };
            $scope.memoryOptions = {
                orientation: 'horizontal',
                min: commonMemoryRange.min,
                max: commonMemoryRange.max,
                step: 1,
                range: 'min',
                slide: function(ev, ui){
                    $scope.newHost.ram = ui.value;
                    $scope.$apply();
                }
            };
            $scope.diskOptions = {
                orientation: 'horizontal',
                min: commonDiskRange.min,
                max: commonDiskRange.max,
                step: 1,
                range: 'min',
                slide: function(ev, ui){
                    $scope.newHost.dataDiskSize = ui.value;
                    $scope.$apply();
                }
            };

            $scope.changeCPUSlider = function(){
                var cpuValue = parseInt($scope.newHost.cpu);
                if ($scope.newHost.cpu == undefined) {
                    cpuValue = cpuList[0];
                };

                var value, index;
                if ((index = cpuList.indexOf(cpuValue)) != -1){
                    value = index;
                } else if (cpuValue < cpuList[0]) {
                    value = 0;
                } else if (cpuValue > cpuList[cpuList.length-1]){
                    value = cpuList.length-1;
                } else {
                    for (var i = 0; i < cpuList.length; i++) {
                        if ( cpuValue < cpuList[i] ) {
                            value = i - 1;
                            break;
                        }
                    };
                }
                $scope.cpusliderValue = value;
                $scope.newHost.cpu = cpuList[value];
                // $scope.$apply();
            }; 

            $scope.changeMemSlider = function(){
                var memValue = parseInt($scope.newHost.ram);
                if ($scope.newHost.ram == undefined || memValue < commonMemoryRange.min) {
                    $scope.newHost.ram = commonMemoryRange.min;
                } else if (memValue > commonMemoryRange.max) {
                    $scope.newHost.ram = commonMemoryRange.max;
                };
                $scope.ramsliderValue = $scope.newHost.ram;
                // $scope.$apply();
            };

            $scope.changeDiskSlider = function(){
                var diskValue = parseInt($scope.newHost.dataDiskSize);
                if ($scope.newHost.dataDiskSize == undefined || diskValue < commonDiskRange.min) {
                    $scope.newHost.dataDiskSize = commonDiskRange.min;
                } else if (diskValue > commonDiskRange.max) {
                    $scope.newHost.dataDiskSize = commonDiskRange.max;
                };
                $scope.disksliderValue = $scope.newHost.dataDiskSize;
                // $scope.$apply();
            };


            commonSpeedRange.min = 6;//重新设置默认最小值
            commonSpeedOptions.min = 6;//重新设置默认最小值
            //文本框
            $scope.newHost.bandwidth = commonSpeedRange.min;
            //滑动条
            $scope.speedRange = commonSpeedRange;
            $scope.speedOptions = commonSpeedOptions;

            $scope.hostType = 100; //默认自定义

            //操作系统
            $scope.osList = osList;
            $scope.osType = 1; //默认自定义
            $scope.newHost.os = $scope.osList.windows[0].id; //默认自定义
            $scope.newHost.admin_account = 'administrator';
            $scope.selectWin = function(){
                $scope.newHost.admin_account = 'administrator';
            };
            $scope.selectLinux = function(){
                $scope.newHost.admin_account = 'root';
            };

            //台数
            $scope.newHost.count = 1;

            //购买方式
            $scope.datelist = [1,2,3,4,5,6,7,8,9,10];
            $scope.newHost.buyType = 2;
            $scope.newHost.buyCount = 1;
            $scope.changeType = function(){

                if($scope.newHost.buyType == '1'){
                    $scope.datelist = [1,2,3,4,5];//接口中当buyType是1的时候，buyCount接受年份值

                }else if($scope.newHost.buyType == '2'){
                    $scope.datelist = [1,2,3,4,5,6,7,8,9,10];
                }
            };

            $scope.selectType = function(type){
                switch (type) {
                    case 11:
                        $scope.newHost.cpu = 4;
                        $scope.newHost.ram = 2;
                        $scope.newHost.dataDiskSize = 250;
                        break;
                    case 12:
                        $scope.newHost.cpu = 4;
                        $scope.newHost.ram = 4;
                        $scope.newHost.dataDiskSize = 500;
                        break;
                    case 13:
                        $scope.newHost.cpu = 4;
                        $scope.newHost.ram = 8;
                        $scope.newHost.dataDiskSize = 1024;
                        break;
                    case 100:
                        $scope.newHost.cpu = commonCPURange.min;
                        $scope.newHost.ram = commonMemoryRange.min;
                        $scope.newHost.dataDiskSize = commonDiskRange.min;
                        break;
                }
                $scope.cpusliderValue = $scope.newHost.cpu;
                $scope.ramsliderValue = $scope.newHost.ram;
                $scope.disksliderValue = $scope.newHost.dataDiskSize;
                $scope.$apply();

            };

            $scope.speedOptions = {
                orientation: 'horizontal',
                min: commonSpeedRange.min,
                max: commonSpeedRange.max,
                step: 1,
                range: 'min',
                slide: function(ev, ui){
                    $scope.newHost.bandwidth = ui.value;
                    $scope.$apply();
                }
            };
            $scope.changeBandwidthSlider = function() {
                var bandwidthValue = parseInt($scope.newHost.bandwidth);
                if ($scope.newHost.bandwidth == undefined || bandwidthValue < commonSpeedRange.min) {
                    $scope.newHost.bandwidth = commonSpeedRange.min;
                } else if (bandwidthValue > commonSpeedRange.max) {
                    $scope.newHost.bandwidth = commonSpeedRange.max;
                };
                $scope.bandwidthsliderValue = $scope.newHost.bandwidth;
                $scope.speedOptions.value = $scope.bandwidthsliderValue;
                // $scope.$apply(function(){
                //     var a=arguments;
                //     $scope.bandwidthsliderValue = $scope.newHost.bandwidth;
                // });
            };



            var caculate = function(){

                var month;
                if($scope.newHost.buyType == 1){
                    month = 12 * $scope.newHost.buyCount;
                }else if($scope.newHost.buyType == 2){
                    month = $scope.newHost.buyCount;
                }

                $scope.total = cloudhost_priceCalc(
                    1,month,$scope.newHost.line,$scope.newHost.buyType,
                    ($scope.newHost.cpu - commonCPURange.min),
                    ($scope.newHost.ram - commonMemoryRange.min),
                    ($scope.newHost.dataDiskSize - commonDiskRange.min),
                    ($scope.newHost.bandwidth - commonSpeedRange.min));

                $scope.total = $scope.total.toFixed(2);
            };
            $scope.$watch('newHost.line',caculate);
            $scope.$watch('newHost.cpu',caculate);
            $scope.$watch('newHost.ram',caculate);
            $scope.$watch('newHost.dataDiskSize',caculate);
            $scope.$watch('newHost.bandwidth',caculate);
            $scope.$watch('newHost.buyType',caculate);
            $scope.$watch('newHost.buyCount',caculate);


            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                hostServices.create($scope.newHost)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '创建成功'});

                            $route.reload();
                        }else{
                            //ErrorServices.openFailureModal(data.errormsg);
                            $rootScope.alerts.push({type:'error', msg: data.errormsg});
                        }

                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);

                    },function(data){
                        //ErrorServices.openSystemErrorModal();
                        $rootScope.alerts.push({type:'error', msg: '系统错误'});

                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);
                    });
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);
