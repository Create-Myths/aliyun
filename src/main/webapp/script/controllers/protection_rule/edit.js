/**
 * Created by Helen on 13-12-26.
 */

/*云防护规则编辑弹窗控制器*/
controllers.controller('protecrRuleEditCtrl',
    ['firewallServices', 'firewallItem', 'ruleItem', 'ipList', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(firewallServices, firewallItem, ruleItem, ipList, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.operationType = '编辑';
            $scope.firewall = firewallItem;
            $scope.ipList = ipList;

            $scope.ruleItem = ruleItem;
            //console.log($scope.ruleItem);

            if($scope.ruleItem.start_dport){
                $scope.ruleItem.start_dport = parseInt($scope.ruleItem.start_dport);
            }
            if($scope.ruleItem.end_dport){
                $scope.ruleItem.end_dport = parseInt($scope.ruleItem.end_dport);
            }



            $scope.newRule = angular.copy(ruleItem);//存储新值
            $scope.newRule.rule_id = ruleItem.id;
            $scope.newRule.id = firewallItem.id;
            //console.log($scope.newRule);
            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                firewallServices.saveRule($scope.newRule)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '修改成功'});
                            $route.reload();
                        }else{
                            //ErrorServices.openFailureModal(data.errormsg);
                            $rootScope.alerts.push({type:'error', msg: data.errormsg});
                        }

                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);
                    },function(data){
                        //ErrorServices.openSystemErrorModal();
                        $rootScope.alerts.push({type:'error', msg: '系统错误'});
                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);
                    });
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);
