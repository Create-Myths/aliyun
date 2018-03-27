/**
 * Created by Helen on 13-12-18.
 */
/*云主机列表控制器*/
controllers.controller('hostListCtrl',
    ['hostServices', 'ErrorServices',
        '$scope', '$modal','$route', '$timeout',
        function(hostServices, ErrorServices,
                 $scope, $modal,$route, $timeout) {

            focusNav();

            var refreshID,
                creatingList = {},
                poweroffList = {};
            /*hostServices.query().then(function(data){
                $scope.dataList = data;
                for (var i = 0; i < $scope.dataList.length; i++) {
                    if($scope.dataList[i].state == '-1'){
                        creatingList[$scope.dataList[i].id] = $scope.dataList[i];
                    }
                };
                if (isNotEmpty(creatingList) || isNotEmpty(poweroffList)) {
                    setRefreshInterval();
                }
            },function(data){
                ErrorServices.openSystemErrorModal();
            });*/

            $scope.filterOptions = commonGridOptions.filterOptions;
            $scope.pagingOptions = commonGridOptions.pagingOptions;
            $scope.getPagedDataAsync = function (pageSize, page, searchText) {
                hostServices.query().then(function(data){
                    if (searchText) {
                        var ft = searchText.toLowerCase();
                        data = data.filter(function(item) {
                            return JSON.stringify(item).toLowerCase().indexOf(ft) != -1;
                        });
                    }

                    var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
                    $scope.dataList = pagedData;
                    $scope.totalServerItems = data.length;
                    if (!$scope.$$phase) {
                        $scope.$apply();
                    }

                    for (var i = 0; i < $scope.dataList.length; i++) {
                        if($scope.dataList[i].state == '-1'){
                            creatingList[$scope.dataList[i].id] = $scope.dataList[i];
                        }
                    };
                    if (isNotEmpty(creatingList) || isNotEmpty(poweroffList)) {
                        setRefreshInterval();
                    }

                },function(data){
                    ErrorServices.openSystemErrorModal();
                });
            };
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
            $scope.$watch('pagingOptions', function (newVal, oldVal) {
                if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
                    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage,$scope.filterOptions.filterText);
                }
            }, true);
            $scope.$watch('filterOptions', function (newVal, oldVal) {
                if (newVal !== oldVal) {
                    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
                }
            }, true);



            // 刷新创建中的主机状态
            function refreshState(){
                hostServices.query().then(function(data){
                    for (var i = 0; i < data.length; i++) {
                        if ( creatingList[data[i].id] && data[i].state!='-1' ) {
                            creatingList[data[i].id].state = data[i].state;
                            delete creatingList[data[i].id];
                        };

                        if ( poweroffList[data[i].id] && data[i].state!='1' ) {
                            // poweroffList[data[i].id].state = data[i].state;
                            delete poweroffList[data[i].id];
                            $scope.refresh();
                            // $scope.dataList = data;
                        };
                    };
                    if (isEmpty(creatingList) && isEmpty(poweroffList)) {
                        //console.log($scope.dataList);
                        clearRefreshInterval();
                    };
                });
            }

            // 设置间隔获取状态
            function setRefreshInterval(){
                if (refreshID) return false;
                refreshID = setInterval(refreshState, 1000*10);
            }

            // 清除间隔获取状态
            function clearRefreshInterval(){
                clearInterval(refreshID);
            }

            // 判断对象是否为空
            function isEmpty(obj){
                for (var name in obj){
                    return false;
                }
                return true;
            }

            function isNotEmpty(obj){
                for (var name in obj){
                    return true;
                }
                return false;
            }

            $scope.description = hostServices.getDescription();
            $scope.mySelections = [];

            $scope.gridOptions = commonGridOptions;
            $scope.gridOptions.selectedItems = $scope.mySelections;
            $scope.gridOptions.columnDefs = [
                {field:'id', displayName:'', visible: false},
                {field:'hostName', displayName:'云服务器名称'},
                {field:'innerIP', displayName:'内网IP'},
                {field:'outerIP', displayName:'外网IP'},
                {field:'state', displayName:'状态',cellTemplate: 'view/host/nggrid_colum_state.html'},
                {field:'die_time', displayName:'到期时间'},
                {field:'firewall', displayName:'云防护',cellTemplate: 'view/host/nggrid_colum_protection.html'}];

            //初始化按钮状态
            $scope.startBtn = false;
            $scope.shutdownBtn = false;
            $scope.poweroffBtn = false;
            $scope.rebootBtn = false;
            $scope.loginBtn = false;

            $scope.gridOptions.afterSelectionChange = function(rowItem, event){

                if($scope.mySelections.length == 0){
                    $scope.startBtn = false;
                    $scope.shutdownBtn = false;
                    $scope.poweroffBtn = false;
                    $scope.rebootBtn = false;
                    $scope.loginBtn = false;
                }
                if($scope.mySelections.length == 1){
                    $scope.startBtn = true;
                    $scope.shutdownBtn = true;
                    $scope.poweroffBtn = true;
                    $scope.rebootBtn = true;
                    $scope.loginBtn = true;
                }
                if($scope.mySelections.length > 1){
                    $scope.startBtn = true;
                    $scope.shutdownBtn = true;
                    $scope.poweroffBtn = true;
                    $scope.rebootBtn = false;
                    $scope.loginBtn = false;
                }

                //判断状态
                for(var i = 0; i < $scope.mySelections.length; i++){
                    if($scope.mySelections[i].state == 0){//已停止
                        $scope.shutdownBtn = false;
                        $scope.rebootBtn = false;
                    }
                    if($scope.mySelections[i].state == 1){//正常运行
                        $scope.startBtn = false;
                    }
                }

            }


            //创建
            $scope.create = function(){
                $modal.open({
                    templateUrl: 'view/host/modal_create_host.html',
                    controller: 'hostCreateCtrl',
                    resolve: {
                        osList: function(hostServices){
                            return hostServices.queryOsList();
                        }
                    }
                });
            };

            //开机
            $scope.start = function(){
                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'hostStartCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });
            };



            //断电
            $scope.poweroff = function(showText){

                if($scope.mySelections.length == 0){return;}
                var option = {
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'hostPoweroffCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        },
                        showText: function(){
                            return "您确定断电吗？";
                        }
                    }
                };

                if (showText) {
                    option.resolve.showText = function(){
                        return "关机失败，要使用断电吗？";
                    };
                };

                var modalInstance = $modal.open(option);

                modalInstance.result.then(function(){

                    for(var j = 0; j < $scope.mySelections.length; j++){
                        if ($scope.mySelections[j].state == '1') {
                            for (var i = 0; i < $scope.dataList.length; i++) {
                                if( $scope.dataList[i].id == $scope.mySelections[j].id ){
                                    poweroffList[$scope.dataList[i].id] = $scope.dataList[i];
                                }
                            }
                        }
                    }
                    if (isEmpty(poweroffList)) {
                        setRefreshInterval();
                    }
                }, function(){});
            };


            //关机
            $scope.shutdown = function(){

                if($scope.mySelections.length == 0){return;}

                var modalInstance = $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'hostShutdownCtrl',
                    resolve: {
                        items: function () {
                            return $scope.mySelections;
                        }
                    }
                });

                modalInstance.result.then(function(){
                    $scope.poweroff('关机失败');
                }, function(){});
            };

            //重启
            $scope.reboot = function(){

                if($scope.mySelections.length == 0){return;}

                $modal.open({
                    templateUrl: 'view/common/modal_confirm.html',
                    controller: 'hostRebootCtrl',
                    resolve: {
                        item: function () {
                            return $scope.mySelections[0];
                        }
                    }
                });
            };

            //应急登录
            $scope.login = function(){

                if($scope.mySelections.length == 0){return;}

                hostServices.queryVncUrl({hostId: $scope.mySelections[0].id}).then(function(data){
                    if(data.result === "true"){
                        $scope.url = data.param.url;

                        //如果开机则打开窗口
                        $modal.open({
                            templateUrl: 'view/host/modal_login.html',
                            controller: 'hostLoginCtrl',
                            resolve: {
                                url: function(){
                                    return $scope.url;
                                },
                                hostId: function(){
                                    return $scope.mySelections[0].id;
                                }
                            }
                        });

                    }else{
                        //否则提示开机
                        ErrorServices.openFailureModal(data.errormsg);
                    }
                },function(data){
                    ErrorServices.openSystemErrorModal();
                });
            };

            //页面刷新
            $scope.refresh = function(){
                $route.reload();
            };
        }]);



