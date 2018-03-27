/**
 * Created by Helen on 13-12-26.
 */

/*负载均衡规则编辑弹窗控制器*/
controllers.controller('loadRuleEditCtrl',
    ['loadServices','balancerItem','ruleItem', '$scope', '$modalInstance',
        function (loadServices, balancerItem, ruleItem, $scope, $modalInstance) {

            $scope.operationType = '创建';
            $scope.balancerItem = balancerItem;
            $scope.balancerRule = ruleItem;

            $scope.newBalancerRule = angular.copy(ruleItem);
            $scope.newBalancerRule.balancer_id = $scope.balancerItem.id;

            $scope.ok = function () {

                //console.log($scope.newBalancerRule);
                $modalInstance.close();
                loadServices.createRule($scope.newBalancerRule).then(function(){
                    refreshPage('#/load_rule/'+balancerItem.id+'/'+balancerItem.name);
                });
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);

