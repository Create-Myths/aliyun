/**
 * Created by cohen on 13-12-22.
 * 列表
 */
controllers.controller('dnsParseCtrl',
    ['dnsParseServices', 'ErrorServices',
        '$scope', '$modal','$routeParams','$route',
        function(dnsParseServices, ErrorServices,
                 $scope, $modal,$routeParams,$route) {

            //分页配置
            pageConfigurationDnsParse(dnsParseServices, $scope, ErrorServices,$routeParams.id);

            $scope.domain_id = $routeParams.id;
            $scope.domain = $routeParams.name;

            $scope.description = dnsParseServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.rowTemplate = 'view/dns/nggrid_parse_row.html';
            $scope.gridOptions.checkboxCellTemplate ='view/dns/nggrid_checkbox.html'
            $scope.gridOptions.columnDefs = [
                {field:'domain_id', displayName:'',visible: false},
                {field:'name', displayName:'主机记录'},
                {field:'type', displayName:'记录类型'},
                {field:'line', displayName:'线路类型'},
                {field:'value', displayName:'记录值'},
                {field:'mx', displayName:'MX优先级'},
                {field:'ttl', displayName:'TTL'},
                {field:'enabled', displayName:'DNS状态',cellTemplate: 'view/dns/nggrid_colum_status.html'}];

            //初始化按钮状态
            $scope.pauseBtn = false;
            $scope.rebootBtn = false;
            $scope.deleteBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

                if($scope.mySelections.length == 0){
                    $scope.pauseBtn = false;
                    $scope.rebootBtn = false;
                    $scope.deleteBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.pauseBtn = true;
                    $scope.rebootBtn = true;
                    $scope.deleteBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.pauseBtn = true;
                    $scope.rebootBtn = true;
                    $scope.deleteBtn = true;
                }

                //判断状态
                for(var i = 0; i < $scope.mySelections.length; i++){
                    if($scope.mySelections[i].enabled == 0){//已停止
                        $scope.pauseBtn = false;
                    }
                }

            }


            //添加解析
            $scope.add = function () {
                var modalInstance = $modal.open({
                    templateUrl: 'view/dns/dns_parse_form.html',
                    controller: 'dnsAddCtrl',
                    resolve: {
                        domainItem: function () {
                            return {domain_id: $scope.domain_id, domain: $scope.domain};
                        }
                    }
                });
            };

            //删除
            $scope.deleteitem = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        },
                        domainItem: function () {
                            return {domain_id: $scope.domain_id, domain: $scope.domain};
                        }
                    }
                });
            };

            //重启
            $scope.reboot = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsRebootCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        },
                        domainItem: function () {
                            return {domain_id: $scope.domain_id, domain: $scope.domain};
                        }
                    }
                });
            };

            //暂停
            $scope.pause = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsPauseCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        },
                        domainItem: function () {
                           // console.log($scope.domain_id);

                            return {domain_id: $scope.domain_id, domain: $scope.domain};
                        }
                    }
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };
        }]);

