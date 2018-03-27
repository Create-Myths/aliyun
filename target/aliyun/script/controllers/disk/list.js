/**
 * Created by Helen on 13-12-25.
 * 列表
 */

controllers.controller('diskListCtrl',
    ['diskServices', 'hostServices', 'ErrorServices',
        '$scope', '$modal','$route',
        function(diskServices, hostServices, ErrorServices,
                 $scope, $modal,$route) {

            focusNav();

            //分页配置
            pageConfiguration(diskServices, $scope, ErrorServices);


            $scope.filterOptions = {
                filterText: ''
            };

            $scope.description = diskServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.filterOptions = $scope.filterOptions;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'diskName', displayName:'硬盘名称'},
                {field:'diskSize', displayName:'容量'},
                {field:'mntHost', displayName:'挂载主机',cellTemplate: 'view/disk/nggrid_colum_mn.html'},
                {field:'state', displayName:'状态',cellTemplate: 'view/disk/nggrid_colum_status.html'},
                {field:'create_time', displayName:'创建时间'}];

            //初始化按钮状态 , {field:'die_time', displayName:'剩余有效期'}
            $scope.linkBtn = false;
            $scope.unlinkBtn = false;
            $scope.deleteBtn = false;
            $scope.extendBtn = false;
            $scope.cloneBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

                if($scope.mySelections.length == 0){
                    $scope.linkBtn = false;
                    $scope.unlinkBtn = false;
                    $scope.deleteBtn = false;
                    $scope.extendBtn = false;
                    $scope.cloneBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.linkBtn = true;
                    $scope.unlinkBtn = true;
                    $scope.deleteBtn = true;
                    $scope.extendBtn = true;
                    $scope.cloneBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.linkBtn = false;
                    $scope.unlinkBtn = false;
                    $scope.deleteBtn = true;
                    $scope.extendBtn = false;
                    $scope.cloneBtn = false;
                }

                //判断状态
            }


            //创建
            $scope.create = function(){
                var modalInstance = $modal.open({
                    templateUrl: 'view/disk/modal_form_disk.html',
                    controller: 'diskCreateCtrl'
                });
            };

            //删除
            $scope.deleteitem = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'diskDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //挂载
            $scope.link = function(){
                if($scope.mySelections.length == 0){return;}
                var modalInstance;
                modalInstance = $modal.open({
                    templateUrl: 'view/disk/modal_link.html',
                    controller: 'diskLinkCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        },
                        hostList: function () {
                            return hostServices.query();
                        }
                    }
                });
            };

            //卸载
            $scope.unlink = function(){
                if($scope.mySelections.length == 0){return;}
                var modalInstance = $modal.open({
                    templateUrl: 'view/disk/modal_unlink.html',
                    controller: 'diskUnlinkCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        }
                    }
                });
            };

            //扩容
            $scope.extend = function(){
                if($scope.mySelections.length == 0){return;}

                //console.log("点击");
                var modalInstance = $modal.open({
                    templateUrl: 'view/disk/modal_extend.html',
                    controller: 'diskExtendCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        }
                    }
                });
            };

            //克隆
            $scope.clone = function(){
                if($scope.mySelections.length == 0){return;}
                var modalInstance = $modal.open({
                    templateUrl: 'view/disk/modal_clone.html',
                    controller: 'diskCloneCtrl',
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
