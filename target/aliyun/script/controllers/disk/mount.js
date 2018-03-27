/**
 * Created by Administrator on 13-12-25.
 * 挂载
 */

controllers.controller('diskLinkCtrl',
    ['diskServices', 'item', 'hostList', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(diskServices, item, hostList, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.selectHost = {};
            $scope.hostList = hostList;

            $scope.disk = item;
            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                diskServices.link($scope.selectHost.id, item.id)
                .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '挂载成功'});

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