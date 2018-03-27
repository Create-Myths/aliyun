/**
 * Created by Helen on 13-12-25.
 * 云内存创建弹窗控制器
 */

controllers.controller('memoryCreateCtrl',
    ['memServices', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(memServices, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            //初始值
           // $scope.newMem1 = {};//接口中还不接受但页面中要实现效果的放在这个里面，不影响接口的调用

            //初始值
            $scope.newMem = {};
            commonMemoryRange.min = 1;//重新设置默认最小值
            commonMemoryOptions.min = 1;//重新设置默认最小值
            $scope.newMem.size = commonMemoryRange.min;
            $scope.newMem.type = 1;
            $scope.newMem.treaty = 'memcache';

            $scope.memoryRange = commonMemoryRange;
            $scope.memoryOptions = commonMemoryOptions;


            //台数
            $scope.newMem.count = 1;

            //购买方式
            $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
            $scope.newMem.buyType = 2;
            $scope.newMem.maturity_month = 1;
            $scope.changeType = function(){

                if($scope.newMem.buyType == '1'){
                    $scope.datelist = [1,2,3,4,5];

                }else if($scope.newMem.buyType == '2'){
                    $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
                }
            };

            caculate = function(){
                var month;
                if($scope.newMem.buyType == 1){
                    month = 12 * $scope.newMem.maturity_month;
                }else if($scope.newMem.buyType == 2){
                    month = $scope.newMem.maturity_month;
                }
                $scope.total = mem_calc(1,month,$scope.newMem.size);
            };

            $scope.$watch('newMem.size',caculate);
            $scope.$watch('newMem.buyType',caculate);
            $scope.$watch('newMem.maturity_month',caculate);


            $scope.judgeMem = function(){

                if($scope.newMem.size >  commonMemoryRange.max){
                    $scope.newMem.size = commonMemoryRange.max;
                }
                if($scope.newMem.size <  commonMemoryRange.min){
                    $scope.newMem.size = commonMemoryRange.min;
                }
            };


            $scope.ok = function () {

                $modalInstance.close();

                //接口中maturity_month只能接受月份,所以这里要转一下
                if($scope.newMem.buyType == 1){//按年
                    $scope.newMem.maturity_month = $scope.newMem.maturity_month * 12;
                }

                $rootScope.alerts = [];
                memServices.create($scope.newMem)
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
