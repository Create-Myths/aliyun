/**
 * Created by Helen on 13-12-26.
 */

/*负载均衡规则创建弹窗控制器*/
controllers.controller('loadRuleCreateCtrl',
    ['loadServices','balancerItem', 'hostList','ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function (loadServices, balancerItem, hostList,ErrorServices,
                  $scope, $modalInstance, $route,$rootScope,$timeout) {

            //过滤器
            $scope.filterOptions = {
                filterText: ''
            };

            //步骤状态初始化
            $scope.steps = [{active: true},{active: false}];

            //解决ng-grid不显示
            $scope.steps[1].active = true;
            $('#showshowGrid').addClass('showshowFar');
            $scope.showgrid = function(){
                $('#showshowGrid').removeClass('showshowFar');
            };

            $scope.hostList = hostList;
            //console.log($scope.hostList);
            $scope.balancerItem = balancerItem;
            $scope.newBalancerRule1 = {};//接口中还不接受但页面中要实现效果的放在这个里面，不影响接口的调用
            $scope.newBalancerRule1.region = '华东双线';

            $scope.newBalancerRule = {};
            $scope.newBalancerRule.bport = 80;
            $scope.newBalancerRule.port = 80;
            $scope.newBalancerRule.kepp_alive = 1;
            $scope.newBalancerRule.heath_check = 1;
            $scope.newBalancerRule.role_type = 1;
            $scope.newBalancerRule.balancer_id = $scope.balancerItem.id;


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

            $scope.ok = function () {

                //console.log($scope.newBalancerRule);
                $modalInstance.close();

                //主机列表
                var iplist = '';
                for(var i = 0; i < $scope.mySelections.length; i++){
                    var ip = $scope.mySelections[i].innerIP;
                    iplist += ip + ',';
                }
                $scope.newBalancerRule.pool = iplist.substr(0, iplist.length-1);

                $rootScope.alerts = [];
                loadServices.createRule($scope.newBalancerRule)
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
