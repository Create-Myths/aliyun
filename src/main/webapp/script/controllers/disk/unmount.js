/**
 * Created by Helen on 13-12-25.
 * 卸载
 */

controllers.controller('diskUnlinkCtrl',
    ['diskServices', 'item', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(diskServices, item, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.disk = item;//原始值

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                diskServices.unlink({diskId:  $scope.disk.id})
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '卸载成功'});

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