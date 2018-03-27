
/*添加域名*/
controllers.controller('dnsDomainAddCtrl',
    ['dnsDomainServices', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(dnsDomainServices,  ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.operationType = "添加";
            $scope.newDnsDomain = {};

            $scope.ok = function () {
                //console.log($scope.disk);
                $modalInstance.close();

                //$scope.dataList.push($scope.newDnsDomain);
                $rootScope.alerts = [];
                dnsDomainServices.add($scope.newDnsDomain)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '添加成功'});
                            $route.reload();
                        }else{
                            //ErrorServices.openFailureModal(data.errormsg);
                            $rootScope.alerts.push({type:'error', msg: data.param.status.message});
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
