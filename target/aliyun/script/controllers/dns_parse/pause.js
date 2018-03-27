
/*暂停DNS解析*/
controllers.controller('dnsPauseCtrl',
    ['dnsParseServices', 'items', 'ErrorServices','domainItem',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(dnsParseServices, items, ErrorServices,domainItem,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {


            $scope.domainItem = domainItem;
            $scope.modalConfirm = {
                title: '暂停解析',
                textLine1: '您确定要暂停解析吗？'
            };
            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    dnsParseServices.pause(domainItem, items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                //ErrorServices.openSuccessModal(data.itemName + '：暂停成功');
                                $rootScope.alerts.push({type:'success', msg: data.itemName + '：暂停成功'});
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