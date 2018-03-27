/**
 * Created by Helen on 13-12-25.
 * 云防护创建弹窗控制器
 */

controllers.controller('protecCreateCtrl',
    ['firewallServices', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(firewallServices, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.operationType = '创建';
            $scope.newFirewall = {};

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                firewallServices.create($scope.newFirewall)
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
