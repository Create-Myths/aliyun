/**
 * Created by Helen on 13-12-25.
 * 扩容
 */
controllers.controller('diskExtendCtrl',
    ['diskServices', 'item', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(diskServices, item, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            //console.log("打开");
            $scope.disk = item;//动态变化的值，会直接影响到列表
            $scope.newdisk = {};//存储新值
            $scope.newdisk.id = item.id;

            commonDiskRange.min = parseInt($scope.disk.diskSize);//重新设置默认最小值
            commonDiskOptions.min = parseInt($scope.disk.diskSize);//重新设置默认最小值
            //文本框
            $scope.newdisk.diskSize = commonDiskRange.min;

            //滑动条
            $scope.diskRange = commonDiskRange;
            $scope.diskOptions = commonDiskOptions;


            $scope.judgeDisk = function(){
                if($scope.newdisk.diskSize >  commonDiskRange.max){
                    $scope.newdisk.diskSize = commonDiskRange.max;
                }
                if($scope.newdisk.diskSize <  commonDiskRange.min){
                    $scope.newdisk.diskSize = commonDiskRange.min;
                }
            };

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                diskServices.extend($scope.newdisk)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '扩容成功'});

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


