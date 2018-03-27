/**
 * Created by cohen on 13-12-25.
 * 删除域名
 */


controllers.controller('dnsDomainDeleteCtrl',
    ['dnsDomainServices','items', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(dnsDomainServices, items, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.modalConfirm = {
                title: '删除域名',
                textLine1: '您确定要删除域名以及该域名下的所有记录吗？'
            };


            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    dnsDomainServices.deleteitem(items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                //ErrorServices.openSuccessModal(data.itemName + '：删除成功');
                                $rootScope.alerts.push({type:'success', msg: data.itemName + '：删除成功'});
                            }else{
                                //ErrorServices.openFailureModal(data.itemName + '：' + data.param.status.message);
                                $rootScope.alerts.push({type:'error', msg: data.itemName + '：' + data.param.status.message});
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
