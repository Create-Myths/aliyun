/**
 * Created by Administrator on 13-12-25.
 */

/*创建*/
controllers.controller('dbCreateCtrl',
    ['databaseServices', 'ErrorServices','userServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(databaseServices, ErrorServices,userServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            //步骤状态初始化
            $scope.steps = [{active: true},{active: false},{active:false}];


            //初始值
            $scope.newDB = {};
          //  $scope.newDB1 = {};//接口中还不接受内存，这个对象临时存储内存，用来实现前台展示效果，不影响接口的调用
            commonMemoryRange.min = 1;//重新设置默认最小值
            commonMemoryOptions.min = 1;//重新设置默认最小值
            $scope.newDB.mem = commonMemoryRange.min;


            commonDiskRange.min = 10;//重新设置默认最小值
            commonDiskOptions.min = 10;//重新设置默认最小值
            $scope.newDB.disk = commonDiskRange.min;
            $scope.newDB.db_type = 1;//备注：目前也只有1个类型 1--mysql
            $scope.newDB.pay_type = 1;//备注：区分是月付还是年付 目前一律按月付（前段要求既能按月付，又能按年付，接口中只能按月付，这是个假的，为了传值）
            $scope.newDB.region_id = 1;//备注：目前还无数据中心这个概念。传1即可

            //滑动条
            $scope.diskRange = commonDiskRange;
            $scope.diskOptions = commonDiskOptions;
            $scope.memoryRange = commonMemoryRange;
            $scope.memoryOptions = commonMemoryOptions;
            $scope.dbType = 100; //默认自定义


            $scope.selectType = function(type){
                switch (type) {
                    case 11:
                        $scope.newDB.mem = 2;
                        $scope.newDB.disk = 10;
                        break;
                    case 12:
                        $scope.newDB.mem = 4;
                        $scope.newDB.disk = 20;
                        break;
                    case 21:
                        $scope.newDB.mem = 16;
                        $scope.newDB.disk = 80;
                        break;
                    case 22:
                        $scope.newDB.mem = 32;
                        $scope.newDB.disk = 160;
                        break;
                    case 31:
                        $scope.newDB.mem = 64;
                        $scope.newDB.disk = 320;
                        break;
                }
            };

            //台数
            $scope.newDB.count = 1;
            //购买方式
            $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
            $scope.newDB.buyType = 2;
            $scope.newDB.maturity_month = 1;
            $scope.changeType = function(){

                if($scope.newDB.buyType == '1'){
                    $scope.datelist = [1,2,3,4,5];

                }else if($scope.newDB.buyType == '2'){
                    $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
                }
            };

            caculate = function(){
                var month;
                if($scope.newDB.buyType == 1){
                    month = 12 * $scope.newDB.maturity_month;
                }else if($scope.newDB.buyType == 2){
                    month = $scope.newDB.maturity_month;
                }
                $scope.total = disk_calc(1, month, $scope.newDB.disk) + mem_calc(1,month,$scope.newDB.mem);
            }
            $scope.$watch('newDB.disk',caculate);
            $scope.$watch('newDB.mem',caculate);
            $scope.$watch('newDB.buyType',caculate);
            $scope.$watch('newDB.maturity_month',caculate);

            //获取登录用户：初始化管理员名
            userServices.queryDetail().then(function(data){

                //接口中maturity_month只能接受月份,所以这里要转一下
                if($scope.newDB.buyType == 1){//按年
                    $scope.newDB.maturity_month = $scope.newDB.maturity_month * 12;
                }

                $scope.newDB.admin_name = data.username;
            },function(data){
                ErrorServices.openSystemErrorModal();
            });


            $scope.judgeMem = function(){

                if($scope.newDB.mem >  commonMemoryRange.max){
                    $scope.newDB.mem = commonMemoryRange.max;
                }
                if($scope.newDB.mem <  commonMemoryRange.min){
                    $scope.newDB.mem = commonMemoryRange.min;
                }
            };

            $scope.judgeDisk = function(){
                if($scope.newDB.disk >  commonDiskRange.max){
                    $scope.newDB.disk = commonDiskRange.max;
                }
                if($scope.newDB.disk <  commonDiskRange.min){
                    $scope.newDB.disk = commonDiskRange.min;
                }
            }


            $scope.ok = function () {
                $modalInstance.close();
                //console.log($scope.newDB);

                $rootScope.alerts = [];
                databaseServices.create($scope.newDB)
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
