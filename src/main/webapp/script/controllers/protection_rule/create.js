/**
 * Created by Helen on 13-12-26.
 * 云防护规则创建弹窗控制器
 */

controllers.controller('protecrRuleCreateCtrl',
    ['firewallServices', 'firewallItem', 'ErrorServices','ipList',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(firewallServices, firewallItem, ErrorServices,ipList,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.operationType = '创建';
            $scope.firewall = firewallItem;


            $scope.ipList = ipList;

            $scope.newRule = {};
            $scope.newRule.id = firewallItem.id;
            $scope.newRule.direct = 'INPUT';
            $scope.newRule.action = 'ACCEPT';
            $scope.newRule.proto_type = 1;
            $scope.newRule.start_dport = '';
            $scope.newRule.start_dport = '';
            $scope.newRule.end_dport = '';
            $scope.newRule.source = '';
            $scope.newRule.dest = '';

            $scope.quiklySetting = function(type){

                switch (type) {
                    case 'ping':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '3';
                        $scope.newRule.start_dport = '';
                        break;
                    case 'ssh':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '1';
                        $scope.newRule.start_dport = 22;
                        break;
                    case 'http':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '1';
                        $scope.newRule.start_dport = 80;
                        break;
                    case 'https':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '1';
                        $scope.newRule.start_dport = 443;
                        break;
                    case 'openvpn':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '2';
                        $scope.newRule.start_dport = 1194;
                        break;
                    case 'desktop':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '1';
                        $scope.newRule.start_dport = 3389;
                        break;
                    case 'gre':
                        $scope.newRule.priority = 2;
                        $scope.newRule.direct = 'INPUT';
                        $scope.newRule.action = 'ACCEPT';
                        $scope.newRule.proto_type = '4';
                        $scope.newRule.start_dport = '';
                        break;
                }
            }

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                firewallServices.saveRule($scope.newRule)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '创建成功'});
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
