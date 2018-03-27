/**
 * Created by Helen on 13-12-26.
 */

/*负载均衡创建弹窗控制器*/
controllers.controller('loadCreateCtrl',
    ['loadServices', 'hostList','ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(loadServices,hostList,ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            //过滤器
            $scope.filterOptions = {
                filterText: ''
            };

            //步骤状态初始化
            $scope.steps = [{active: true},{active: false},{active:false},{active: false}];

            //解决ng-grid不显示
            $scope.steps[2].active = true;
            $('#showshowGrid').addClass('showshowFar');
            $scope.showgrid = function(){
                $('#showshowGrid').removeClass('showshowFar');
            };


            $scope.hostList = hostList;
            //console.log($scope.hostList);
            //初始值
            $scope.newBalancer1 = {};//接口中还不接受但页面中要实现效果的放在这个里面，不影响接口的调用
            $scope.newBalancer1.line = '电信';//线路
            $scope.newBalancer1.region = '华东双线';
            //购买方式
            $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
            $scope.newBalancer1.buyType = 2;
            $scope.newBalancer1.buyCount = 1;
            $scope.changeType = function(){

                if($scope.newBalancer1.buyType == '1'){
                    $scope.datelist = [1,2,3,4,5];

                }else if($scope.newBalancer1.buyType == '2'){
                    $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
                }
            };


            //真正要传递的值
            $scope.newBalancer = {};
            $scope.newBalancer.line = '电信';//线路
            $scope.newBalancer.region = '华东双线';
            //购买方式
            $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
            $scope.newBalancer.buyType = 2;
            $scope.newBalancer.buyCount = 1;
            $scope.changeType = function(){

                if($scope.newBalancer.buyType == '1'){
                    $scope.datelist = [1,2,3,4,5];

                }else if($scope.newBalancer.buyType == '2'){
                    $scope.datelist = [1,2,3,4,5,6,7,8,9,10,11,12];
                }
            };
            commonSpeedRange.min = 1;//重新设置默认最小值
            commonSpeedOptions.min = 1;//重新设置默认最小值
            $scope.newBalancer.bindwidth = commonSpeedRange.min;
            $scope.newBalancer.bport = 80;
            $scope.newBalancer.port = 80;
            $scope.newBalancer.kepp_alive = 1;
            $scope.newBalancer.heath_check = 1;
            $scope.newBalancer.role_type = 1;

            //带宽
            $scope.speedRange = commonSpeedRange;
            $scope.speedOptions = commonSpeedOptions;

            $scope.mySelections = [];
            $scope.gridOptions = {
                data: 'hostList',
                showSelectionCheckbox: true,
                selectedItems:  $scope.mySelections,
                columnDefs: [
                    { field: "hostName", displayName:"服务名称"},
                    { field: "innerIP", displayName:"内网IP"},
                    { field: "state", displayName:"状态",
                        cellTemplate:"view/host/nggrid_colum_state.html"}]};

            $scope.gridOptions.filterOptions = $scope.filterOptions;

            caculate = function(){
                var month;
                if($scope.newBalancer1.buyType == 1){
                    month = 12 * $scope.newBalancer1.buyCount;
                }else if($scope.newBalancer1.buyType == 2){
                    month = $scope.newBalancer1.buyCount;
                }
                $scope.total = load_calc($scope.newBalancer1.line, $scope.newBalancer.BindWidth, month);
            }
            $scope.$watch('newBalancer.BindWidth',caculate);
            $scope.$watch('newBalancer1.buyType',caculate);
            $scope.$watch('newBalancer1.buyCount',caculate);



            $scope.judgeSpped = function(){

                if($scope.newBalancer.BindWidth >  commonSpeedRange.max){
                    $scope.newBalancer.BindWidth = commonSpeedRange.max;
                }
                if($scope.newBalancer.BindWidth <  commonSpeedRange.min){
                    $scope.newBalancer.BindWidth = commonSpeedRange.min;
                }
            };


            $scope.ok = function () {

                $modalInstance.close();

                //主机列表
                var iplist = '';
                for(var i = 0; i < $scope.mySelections.length; i++){
                    var ip = $scope.mySelections[i].innerIP;
                    iplist += ip + ',';
                }
                $scope.newBalancer.pool = iplist.substr(0, iplist.length-1);

                $rootScope.alerts = [];
                loadServices.create($scope.newBalancer)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '创建成功'});
                            $route.reload();
                        }else{
                            //ErrorServices.openFailureModal(data.errormsg);
                            $rootScope.alerts.push({type:'error', msg: data.errormsg});
                        }

                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);

                    },function(data){
                        //ErrorServices.openSystemErrorModal();
                        $rootScope.alerts.push({type:'error', msg: '系统错误'});

                        $timeout(function(){
                            $rootScope.alerts.splice(0, 1);
                        },alertLifeTime);

                    });
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);


