/**
 * Created by Helen on 13-12-25.
 */


/**
 * Created by Helen on 13-12-24.
 * 应急登录
 */
controllers.controller('dbLoginCtrl',
    ['databaseServices','url',
        '$scope', '$modalInstance',
        function(databaseServices,url,
                 $scope, $modalInstance) {

            $scope.url = url;

            $scope.ok = function () {
                $modalInstance.close();
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);