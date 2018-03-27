/**
 * Created by cohen on 13-12-22.
 * 域名列表
 */
controllers.controller('dnsDomainCtrl',
    ['dnsDomainServices', 'ErrorServices',
        '$scope', '$modal','$route',
        function(dnsDomainServices, ErrorServices,
                 $scope, $modal,$route) {

            focusNav();

            //分页配置
            pageConfiguration(dnsDomainServices, $scope, ErrorServices);

            $scope.description = dnsDomainServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'name', displayName:'域名记录'},
                {field:'status', displayName:'状态',cellTemplate: 'view/dns/nggrid_domain_colum_status.html'}];

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
                    if($scope.mySelections[i].status == 'pause'){//已停止
                        $scope.pauseBtn = false;
                    }
                }
            }


            //添加解析
            $scope.add = function () {
                var modalInstance = $modal.open({
                    templateUrl: 'view/dns/dns_domain_form.html',
                    controller: 'dnsDomainAddCtrl'
                });
            };

            //删除域名
            $scope.deleteitem = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsDomainDeleteCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //重启
            $scope.reboot = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsDomainRecoverCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };

            //暂停
            $scope.pause = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'dnsDomainPauseCtrl',
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
