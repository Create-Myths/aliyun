/**
 * Created by Helen on 13-12-26.
 * 云防护跳转页（规则）控制器
 */
controllers.controller('protecRuleCtrl',
    ['firewallServices', 'ErrorServices',
        '$scope', '$modal','$routeParams', '$route',
        function(firewallServices, ErrorServices,
                 $scope, $modal, $routeParams, $route) {


            firewallServices.queryInputRuleList($routeParams.id).then(function(data){
                $scope.dataListInput = data;
            },function(data){
                //ErrorServices.openSystemErrorModal();
            });
            firewallServices.queryOutputRuleList($routeParams.id).then(function(data){
                $scope.dataListOutput = data;
            },function(data){
               // ErrorServices.openSystemErrorModal();
            });

            $scope.description = firewallServices.getDescription();
            $scope.firewall = {id: $routeParams.id, name: $routeParams.name};


            var commonGridOptions1 = {
                showSelectionCheckbox: true,//行前checkbox
                multiSelect: true,//单选模式
                selectWithCheckboxOnly: true,//true屏蔽行选择，只使用checkbox
                /*keepLastSelected: false,*/
                enableColumnResize:true,
                headerRowHeight: '24',
                rowHeight: '40'
            };

            var commonGridOptions2 = {
                showSelectionCheckbox: true,//行前checkbox
                multiSelect: true,//单选模式
                selectWithCheckboxOnly: true,//true屏蔽行选择，只使用checkbox
                /*keepLastSelected: false,*/
                enableColumnResize:true,
                headerRowHeight: '24',
                rowHeight: '40'};

            $scope.mySelectionsInput = [];
            $scope.gridOptionsInput = commonGridOptions1;
            $scope.gridOptionsInput.data = 'dataListInput';
            $scope.gridOptionsInput.selectedItems =  $scope.mySelectionsInput;
            $scope.gridOptionsInput.columnDefs = [
                {field:'id', displayName:'', visible:false},
                {field:'rule_name', displayName:'名称'},
                {field:'priority', displayName:'优先级'},
                {field:'protocol', displayName:'协议'},
                {field:'action', displayName:'行为',
                     cellTemplate: '<div class="ngCellText">'
                        +'<span ng-if="row.getProperty(col.field) == \'ACCEPT\'" >接受</span>'
                        +'<span ng-if="row.getProperty(col.field) == \'DROP\'" >拒绝</span>'
                        +'</div>'},
                {field:'start_dport', displayName:'起始端口 | 结束端口',
                    cellTemplate: '<div class="ngCellText">' +
                        '{{row.getProperty(col.field)}} | {{row.getProperty(\'end_dport\')}}' +
                        '</div>'},
                {field:'source', displayName:'源IP'},
                {field:'dest', displayName:'目标IP'}];

            $scope.mySelectionsOutput = [];
            $scope.gridOptionsOutput = commonGridOptions2;
            $scope.gridOptionsOutput.data = 'dataListOutput';
            $scope.gridOptionsOutput.selectedItems =  $scope.mySelectionsOutput;
            $scope.gridOptionsOutput.columnDefs = [
                {field:'id', displayName:'', visible:false},
                {field:'rule_name', displayName:'名称'},
                {field:'priority', displayName:'优先级'},
                {field:'protocol', displayName:'协议'},
                {field:'action', displayName:'行为',
                    cellTemplate: '<div class="ngCellText">'
                +'<span ng-if="row.getProperty(col.field) == \'ACCEPT\'" >接受</span>'
                +'<span ng-if="row.getProperty(col.field) == \'DROP\'" >拒绝</span>'
                +'</div>'},
                {field:'start_dport', displayName:'起始端口 | 结束端口',
                    cellTemplate: '<div class="ngCellText">' +
                        '{{row.getProperty(col.field)}} | {{row.getProperty(\'end_dport\')}}' +
                        '</div>'},
                {field:'source', displayName:'源IP'},
                {field:'dest', displayName:'目标IP'}];


            $scope.editBtn = false;
            $scope.deleteBtn = false;
            $scope.gridOptionsInput.afterSelectionChange = function(rowItem, event){


                //console.log($scope.mySelections);
                //合并数组（上行和下行的选择合并）
                $scope.mySelections = $scope.mySelectionsOutput.concat($scope.mySelectionsInput);

                if($scope.mySelections.length == 0){
                    $scope.editBtn = false;
                    $scope.deleteBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.editBtn = true;
                    $scope.deleteBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.editBtn = false;
                    $scope.deleteBtn = true;
                }
            };

            $scope.gridOptionsOutput.afterSelectionChange = function(rowItem, event){

                //console.log($scope.mySelections);
                //合并数组（上行和下行的选择合并）
                $scope.mySelections = $scope.mySelectionsOutput.concat($scope.mySelectionsInput);

                if($scope.mySelections.length == 0){
                    $scope.editBtn = false;
                    $scope.deleteBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.editBtn = true;
                    $scope.deleteBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.editBtn = false;
                    $scope.deleteBtn = true;
                }
            };


            //删除云防护规则
            $scope.deleteitem = function(){
                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'protecRuleDeleteCtrl',
                    resolve: {
                        firewallItem: function () {
                            return $scope.firewall;
                        },
                        rules: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //创建云防护规则
            $scope.create = function(){
                var modalInstance = $modal.open({
                    templateUrl: 'view/protection/modal_form_protection_rule.html',
                    controller: 'protecrRuleCreateCtrl',
                    resolve: {
                        firewallItem: function () {
                            return $scope.firewall;
                        },
                        ipList: function (firewallServices) {
                            return firewallServices.queryInnerIp();
                        }
                    }
                });
            }

            //编辑云防护规则
            $scope.edit = function(){
                var modalInstance = $modal.open({
                    templateUrl: 'view/protection/modal_form_protection_rule.html',
                    controller: 'protecrRuleEditCtrl',
                    resolve: {
                        firewallItem: function () {
                            return $scope.firewall;
                        },
                        ruleItem: function () {

                            var temp = $scope.mySelections[0];
                            temp.priority = parseInt(temp.priority);
                            //返回的数据不规范，只能转一下了！！
                            switch (temp.protocol) {
                                case 'tcp':
                                    temp.proto_type = '1';
                                    break;
                                case 'udp':
                                    temp.proto_type = '2';
                                    break;
                                case 'icmp':
                                    temp.proto_type = '3';
                                    break;
                                case 'gre':
                                    temp.proto_type = '4';
                                    break;
                            }
                            //console.log(temp);
                            return temp;
                        },
                        ipList: function () {
                            return firewallServices.queryInnerIp();
                        }
                    }
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };

        }]);
