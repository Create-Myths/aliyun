/**
 * Created by Helen on 13-12-25.
 * 关系数据库列表控制器
 */

controllers.controller('dbListCtrl',
    ["databaseServices", 'ErrorServices',
        '$scope', '$modal','$window',
        function(databaseServices, ErrorServices,
                 $scope, $modal,$window) {

            focusNav();

            //分页配置
            pageConfiguration(databaseServices, $scope, ErrorServices);

            $scope.description = databaseServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'db_name', displayName:'DB实例名称'},
                /*{field:'db_type', displayName:'配置型号'},*/
                {field:'db_type', displayName:'DB类别',cellTemplate:'view/db/nggrid_colum_type.html'},
                {field:'status', displayName:'状态',cellTemplate: 'view/db/nggrid_colum_status.html'},
                {field:'ip', displayName:'IP'},
                /*{field:'e', displayName:'属性'},
                 {field:'e', displayName:'配置文件'},*/
                {field:'valid_time', displayName:'剩余有效期'}];


            //初始化按钮状态
            $scope.startBtn = false;
            $scope.closeBtn = false;
            $scope.deleteBtn = false;
            $scope.nloginBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

                if($scope.mySelections.length == 0){
                    $scope.startBtn = false;
                    $scope.closeBtn = false;
                    $scope.deleteBtn = false;
                    $scope.nloginBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.startBtn = true;
                    $scope.closeBtn = true;
                    $scope.deleteBtn = true;
                    $scope.nloginBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.startBtn = true;
                    $scope.closeBtn = true;
                    $scope.deleteBtn = true;
                    $scope.nloginBtn = false;
                }

                //判断状态
                for(var i = 0; i < $scope.mySelections.length; i++){
                    if($scope.mySelections[i].status == 0){//已停止
                        $scope.closeBtn = false;
                    }
                    if($scope.mySelections[i].status == 1){//运行中
                        $scope.startBtn = false;
                    }
                }
            }

            //登录
            $scope.nlogin = function(){
                if($scope.mySelections.length == 0){return;}

                //$scope.db_id = $scope.mySelections[0].id;
                document.getElementById('db_id').value = $scope.mySelections[0].id;
                document.getElementById('loginform').submit();

                /*$modal.open({
                    templateUrl: 'view/db/modal_login.html',
                    controller: 'dbLoginCtrl',
                    resolve: {
                        url: function(){
                            return databaseServices.login({db_id: $scope.mySelections[0].id});
                        }
                    }
                });*/
            };


            //创建
            $scope.create = function(){

                //console.log("create");
                var modalInstance = $modal.open({
                    templateUrl: 'view/db/modal_create_db.html',
                    controller: 'dbCreateCtrl'
                });
            };

            //启动
            $scope.start = function(){
                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dbStartCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //关机
            $scope.close = function(){
                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dbCloseCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

           /* //重启
            $scope.reboot = function(){
                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dbRebootCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        }
                    }
                });
            };*/

            //删除
            $scope.deleteitem = function(){
                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dbDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };

        }]);

