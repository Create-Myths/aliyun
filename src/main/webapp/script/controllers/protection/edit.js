/**
 * Created by Helen on 13-12-25.
 * 云防护修改弹窗控制器
 */

controllers.controller('protecEditCtrl',
    ["firewallServices", 'item','ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(firewallServices, item, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.operationType = '修改';
            $scope.firewall = item;
            $scope.newFirewall = angular.copy(item);//存储新值

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                firewallServices.update($scope.newFirewall)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '修改成功'});
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