/**
 * Created by Helen on 13-12-25.
 * 云内存列表控制器
 */
controllers.controller('memoryListCtrl',    ['memServices', 'ErrorServices', '$scope', '$modal',
    function(memServices, ErrorServices, $scope, $modal) {

        focusNav();

        //分页配置
        pageConfiguration(memServices, $scope, ErrorServices);

        $scope.description = memServices.getDescription();
        $scope.mySelections = [];

        $scope.gridOptions = commonGridOptions;
        $scope.gridOptions.selectedItems = $scope.mySelections;
        $scope.gridOptions.columnDefs = [
            {field:'id', displayName:'', visible: false},
            {field:'space_name', displayName:'内存空间名称'/*,cellTemplate: 'view/memory/nggrid_colum_name.html'*/},
            {field:'type', displayName:'类型',cellTemplate: 'view/memory/nggrid_colum_type.html'},
            {field:'size', displayName:'空间大小'},
            /*{field:'d', displayName:'使用率(API中没有)',cellTemplate: 'view/memory/nggrid_colum_rate.html'},
             {field:'e', displayName:'实例数量(API中没有)'},
            {field:'ip', displayName:'IP'},
            {field:'port', displayName:'端口'},*/
            {field:'ip_pool', displayName:'来源IP'/*,cellTemplate: 'view/memory/nggrid_colum_ip_pool.html'*/},
            {field:'create_time', displayName:'创建时间'},
            {field:'left_time', displayName:'剩余有效期',cellTemplate: 'view/memory/nggrid_colum_lefttime.html'}];


        //初始化按钮状态
        $scope.extendBtn = false;
        $scope.deleteBtn = false;

        $scope.gridOptions.afterSelectionChange = function(rowItem, event){

            if($scope.mySelections.length == 0){
                $scope.extendBtn = false;
                $scope.deleteBtn = false;
            }
            if($scope.mySelections.length == 1){
                $scope.extendBtn = true;
                $scope.deleteBtn = true;
            }
            if($scope.mySelections.length > 1){
                $scope.extendBtn = false;
                $scope.deleteBtn = true;
            }
        }

        //创建
        $scope.create = function(){
            var modalInstance = $modal.open({
                templateUrl: 'view/memory/modal_create_memory.html',
                controller: 'memoryCreateCtrl'
            });
        };

        //删除
        $scope.deleteitem = function(){
            if($scope.mySelections.length == 0){return;}

            $modal.open({
                templateUrl: 'view/common/modal_confirm.html',
                controller: 'memoryDeleteCtrl',
                resolve: {
                    items: function () {
                        return $scope.mySelections;
                    }
                }
            });
        };

        //扩容
        $scope.extend = function(){
            if($scope.mySelections.length == 0){return;}
            var modalInstance = $modal.open({
                templateUrl: 'view/memory/modal_extend_memory.html',
                controller: 'memoryExtendCtrl',
                resolve: {
                    item: function () {

                        return $scope.mySelections[0];
                    }
                }
            });
        };

        //页面刷新
        $scope.refresh = function(){
            $route.reload();
        };
    }]);

