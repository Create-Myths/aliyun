/**
 * Created by Helen on 13-12-17.
 */

/*个人中心显示用户资料*/
controllers.controller('personalDetailCtrl',
    ['userServices','data','$scope', '$modal', function(userServices,data, $scope, $modal) {

        $scope.user = data;
        //修改密码
        $scope.changePassword = function(){
            var modalInstance = $modal.open({
                templateUrl: 'view/personal/modal_change_password.html',
                controller: 'personalChangePasswordCtrl',
                resolve: {
                    username: function(){
                        return data.username;
                    }
                }
            });
        };
    }]);




/*个人中心修改用户资料*/
controllers.controller('personalEditCtrl',
    ['userServices', 'data', 'ErrorServices', '$scope','$location',
        function(userServices, data, ErrorServices, $scope, $location) {

            $scope.user = data;
            $scope.newUser = angular.copy(data);
            $scope.ok = function () {
                userServices.update($scope.newUser)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            ErrorServices.openSuccessModal();
                            $location.path('/personal');
                        }else{
                            ErrorServices.openFailureModal(data.errormsg);
                        }
                    },function(data){
                        ErrorServices.openSystemErrorModal();
                    });
            };

        }]);




/*个人中心修改用户密码*/
controllers.controller('personalChangePasswordCtrl',
    ['userServices', 'ErrorServices', '$scope', '$modalInstance', 'username',
        function(userServices, ErrorServices, $scope, $modalInstance, username) {

            $scope.user = {};
            $scope.username = username;

            $scope.ok = function () {
                $modalInstance.close();
                userServices.changePassword($scope.user)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            ErrorServices.openSuccessModal();
                            //$route.reload();//不用刷新
                        }else{
                            ErrorServices.openFailureModal(data.errormsg);
                        }
                    },function(data){
                        ErrorServices.openSystemErrorModal();
                    });

            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);