/**
 * Created by Helen on 13-12-24.
 * 关机
 */
controllers.controller('hostShutdownCtrl',
    ['hostServices', 'items', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(hostServices, items, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.modalConfirm = {title: '关机', textLine1: '您确定关机吗？'};
            $scope.ok = function () {
                $modalInstance.close();

                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    hostServices.shutdown(items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                ErrorServices.openSuccessModal(data.itemName + '：关机成功');
                            }else{
                                ErrorServices.openFailureModal(data.itemName + '：' + data.errormsg);
                            }
                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }
                        },function(data){
                            ErrorServices.openSystemErrorModal(data);
                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }
                        });
                }
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);
