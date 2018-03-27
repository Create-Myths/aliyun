/**
 * Created by Helen on 13-12-25.
 * 删除
 */

controllers.controller('diskDeleteCtrl',
    ['diskServices', 'items', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(diskServices, items, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.modalConfirm = {
                title: '删除',
                textLine1: '删除硬盘会导致硬盘数据全部被彻底删除！',
                textLine2: '您确定要删除云硬盘吗?'
            };


            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    diskServices.deleteitem(items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                //ErrorServices.openSuccessModal(data.itemName + '：删除成功');
                                $rootScope.alerts.push({type:'success', msg: data.itemName + '：删除成功'});
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

