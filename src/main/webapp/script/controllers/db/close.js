/**
 * Created by Administrator on 13-12-25.
 */

/*关机*/
controllers.controller('dbCloseCtrl',
    ["databaseServices", 'items', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(databaseServices, items,ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.modalConfirm = {
                title: '关闭',
                textLine1: '你确定关闭云数据库吗？'
            };

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    databaseServices.shutdown(items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                //ErrorServices.openSuccessModal(data.itemName + '：关闭成功');
                                $rootScope.alerts.push({type:'success', msg: data.itemName + '：关闭成功'});
                            }else{
                                //ErrorServices.openFailureModal(data.itemName + '：' + data.errormsg);
                                $rootScope.alerts.push({type:'error', msg: data.itemName + '：' + data.errormsg});
                            }
                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }

                            $timeout(function(){
                                $rootScope.alerts.splice(0, 1);
                            },alertLifeTime);

                        },function(data){
                            //ErrorServices.openSystemErrorModal(data);
                            $rootScope.alerts.push({type:'error', msg: data});

                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }

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
