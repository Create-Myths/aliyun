/**
 * Created by Helen on 13-12-16.
 */

/*云防护列表控制器*/// protectionListCtrl这个名字没办法加载？？关键字？？
controllers.controller('protecListCtrl',
    ['firewallServices', 'ErrorServices', '$scope', '$modal','$route',
        function(firewallServices, ErrorServices, $scope, $modal,$route) {

            focusNav();

            //分页配置
            pageConfiguration(firewallServices, $scope, ErrorServices);

            $scope.description = firewallServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'ID',cellTemplate: 'view/protection/protection_colum_name.html'},
                {field:'name', displayName:'名称'},
                {field:'createtime', displayName:'创建时间'}];

            //初始化按钮状态
            $scope.editBtn = false;
            $scope.deleteBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

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
            }

            //创建云防护
            $scope.create = function(){
                var modalInstance = $modal.open({
                    templateUrl: 'view/protection/modal_form_protection.html',
                    controller: 'protecCreateCtrl'
                });
            };

            //删除云防护
            $scope.deleteitem = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'protecDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //修改云防护
            $scope.edit = function(){
                if($scope.mySelections.length == 0){return;}

                var modalInstance = $modal.open({
                    templateUrl: 'view/protection/modal_form_protection.html',
                    controller: 'protecEditCtrl',
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

