/**
 * Created by Helen on 13-12-18.
 */

/*错误系统控制器*/
controllers.controller( 'MsgCtrl',[ 'msg', '$scope','$modalInstance',
    function(msg, $scope, $modalInstance) {

        $scope.msg = msg;

        $scope.cancel = function () {
            $modalInstance.dismiss();
        };
}]);

