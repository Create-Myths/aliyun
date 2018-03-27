/**
 * Created by Helen on 13-12-24.
 */
/**
 * Created by Helen on 13-12-18.
 */

/*错误系统*/
services.factory('ErrorServices', ['$modal', function($modal){

    var items = {};

    var commonSuccessMsg = '操作成功';
    var commonFailureMsg = '操作失败';
    var commonSystemErrorMsg = '系统错误，请稍后再试';

    var commonSuccessTpl = 'view/common/modal_msg.html';
    var commonFailureTpl = 'view/common/modal_msg.html';
    var commonSystemErrorTpl = 'view/common/modal_msg.html';

    items.openSuccessModal = function(msg){
        if(!msg){
            msg = commonSuccessMsg;
        }

        $modal.open({
            templateUrl: commonSuccessTpl,
            controller: 'MsgCtrl',
            resolve: {
                msg: function () {
                    return msg;
                }
            }
        });
    };

    items.openFailureModal = function(msg){
        if(!msg){
            msg = commonFailureMsg;
        }

        $modal.open({
            templateUrl: commonFailureTpl,
            controller: 'MsgCtrl',
            resolve: {
                msg: function () {
                    return msg;
                }
            }
        });
    };

    items.openSystemErrorModal = function(msg){
        if(!msg){
            msg = commonSystemErrorMsg;
        }

        $modal.open({
            templateUrl: commonSystemErrorTpl,
            controller: 'MsgCtrl',
            resolve: {
                msg: function () {
                    return msg;
                }
            }
        });
    };

    return items;
}]);

