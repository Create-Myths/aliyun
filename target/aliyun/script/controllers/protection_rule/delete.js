/**
 * Created by Helen on 13-12-26.
 */

/*云防护删除弹窗控制器*/
controllers.controller('protecRuleDeleteCtrl',
    ["firewallServices",  'firewallItem', 'rules', 'ErrorServices',
         '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(firewallServices, firewallItem,  rules, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {
            $scope.modalConfirm = {
                title: '删除云防护规则',
                textLine1: '您确定要删除该云防护规则吗？'
            };

            //$scope.firewall = firewallItem;

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = rules.length;
                for(var i = 0; i < rules.length; i++){

                    firewallServices.deleteRule(rules[i])
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
