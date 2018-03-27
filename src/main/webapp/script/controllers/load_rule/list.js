/**
 * Created by Helen on 13-12-26.
 */

/*负载均衡跳转页（规则）控制器*/
controllers.controller('loadRuleCtrl',
    ['loadServices', 'hostServices', 'ErrorServices',
        '$scope', '$modal','$routeParams','$route',
        function(loadServices,hostServices, ErrorServices,
                 $scope, $modal, $routeParams,$route) {

            //分页配置
            pageConfigurationLoadRule(loadServices, $scope, ErrorServices,$routeParams.id);

            $scope.description = loadServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;

            $scope.balancerName = $routeParams.name;
            $scope.balancerId = $routeParams.id;

            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'balancer_id', displayName:'', visible: false},
                {field: 'port', displayName: '负载均衡监听端口'},
                /*{field: 'port', displayName: '主机监听端口'},*/
                {field: 'state', displayName: '状态',
                    cellTemplate: 'view/load/nggrid_load_rule_colum_status.html'},
                {field: 'pool', displayName: '主机池'},
                {field: 'role_type', displayName: '转发规则',
                    cellTemplate: 'view/load/nggrid_rule_role_type.html'},
                {field: 'keep_alive', displayName: '会话保持',
                    cellTemplate: 'view/load/nggrid_rule_kepp_alive.html'},
                {field: 'health_check', displayName: '健康检查',
                    cellTemplate: 'view/load/nggrid_rule_heath_check.html'}];

            //初始化按钮状态
            $scope.deleteBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

                if($scope.mySelections.length == 0){
                    $scope.deleteBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.deleteBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.deleteBtn = true;
                }
            };


            //删除负载均衡
            $scope.deleteitem = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'loadRuleDeleteCtrl',
                    resolve: {
                        balancerItem: function () {
                            return {id: $scope.balancerId, name: $scope.balancerName};
                        },
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //创建负载均衡规则
            $scope.create = function () {
                var modalInstance = $modal.open({
                    templateUrl: 'view/load/modal_form_load_rule.html',
                    controller: 'loadRuleCreateCtrl',
                    resolve: {
                        balancerItem: function () {
                            return {id: $scope.balancerId, name: $scope.balancerName};
                        },
                        hostList: function(){
                            return hostServices.query();
                        }
                    }
                });
            };

            //编辑负载均衡规则
            $scope.edit = function () {
                var modalInstance = $modal.open({
                    templateUrl: 'view/load/modal_form_load_rule.html',
                    controller: 'loadRuleEditCtrl',
                    resolve: {
                        balancerItem: function () {
                            return {id: $scope.balancerId, name: $scope.balancerName};
                        },
                        ruleItem: function () {
                            return $scope.mySelections[0];
                        }
                    }
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };
        }
    ]
);

