/**
 * Created by Helen on 13-12-26.
 */
/*负载均衡列表控制器*/
controllers.controller('loadListCtrl',
    ['loadServices', 'hostServices','ErrorServices',
        '$scope', '$modal','$route',
        function(loadServices, hostServices,ErrorServices,
                 $scope, $modal,$route) {

            focusNav();

            //分页配置
            pageConfiguration(loadServices, $scope, ErrorServices);

            $scope.description = loadServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.data= 'dataList';
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'name', displayName:'负载均衡名称',cellTemplate: 'view/load/nggrid_load_colum_name.html'},
                /*{field:'b', displayName:'带宽（Mb）'},*/
                {field:'out_ip', displayName:'公网IP'},
                {field:'create_time', displayName:'运行时间'},
                {field:'state', displayName:'状态',cellTemplate: 'view/load/nggrid_load_colum_status.html'}];


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

                var modalInstance = $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'loadDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //创建负载均衡
            $scope.create = function(){
                var modalInstance = $modal.open({
                    templateUrl: 'view/load/modal_create_load.html',
                    controller: 'loadCreateCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        },
                        hostList: function(){
                            return hostServices.query();
                        }
                    }
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };
        }]);

