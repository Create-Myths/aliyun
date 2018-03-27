/**
 * Created by Http on 13-12-24.
 * 重启
 */

controllers.controller('hostRebootCtrl',
    ['hostServices', 'item', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(hostServices, item, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.item = item;

            if($scope.item.state == 0){
                $scope.modalConfirm = {title: '重启', textLine1: '关机状态的主机不能进行重启！'};
                $scope.ok = function () {
                    $modalInstance.close();
                };
            }else{

                $scope.modalConfirm = {title: '重启', textLine1: '您确定重启吗？'};
                $scope.ok = function () {
                    $modalInstance.close();

                    $rootScope.alerts = [];
                    hostServices.start($scope.item)
                        .then(
                            function(data){
                                if(data.result === "true"){
                                    //ErrorServices.openSuccessModal("重启成功");
                                    $rootScope.alerts.push({type:'success', msg: '重启成功'});
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
                 }



            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);
