/**
 * Created by Helen on 13-12-24.
 * 应急登录
 */
controllers.controller('hostLoginCtrl',
    ['hostServices', 'ErrorServices', 'hostId', 'url', '$scope', '$modalInstance',
        function(hostServices, ErrorServices, hostId, url, $scope, $modalInstance) {

            $scope.url = url;

            hostServices.queryVncParam({hostId: hostId}).then(function(data){
                $scope.loginparam = data;
            },function(data){
                ErrorServices.openSystemErrorModal();
            });

            $scope.ok = function () {
                $modalInstance.close();


            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);