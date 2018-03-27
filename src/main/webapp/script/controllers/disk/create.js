/**
 * Created by Helen on 13-12-25.
 * 创建
 */

controllers.controller('diskCreateCtrl',
    ['diskServices', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(diskServices, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.operationType = "创建";

            //初始值
            $scope.newDisk = {};
            commonDiskRange.min = 10;//重新设置默认最小值
            commonDiskOptions.min = 10;//重新设置默认最小值
            $scope.newDisk.size = commonDiskRange.min;

            //滑动条
            $scope.diskRange = commonDiskRange;
            $scope.diskOptions = commonDiskOptions;


            $scope.judgeDisk = function(){
                if($scope.newDisk.size >  commonDiskRange.max){
                    $scope.newDisk.size = commonDiskRange.max;
                }
                if($scope.newDisk.size <  commonDiskRange.min){
                    $scope.newDisk.size = commonDiskRange.min;
                }
            };

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                diskServices.create($scope.newDisk)
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