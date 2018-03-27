/**
 * Created by cohen on 13-12-22.
 * 添加DNS解析
 */
controllers.controller('dnsAddCtrl',
    ['dnsParseServices', 'ErrorServices','domainItem',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(dnsParseServices, ErrorServices,domainItem,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            $scope.domainItem = domainItem;
            $scope.operationType = "添加";
            $scope.newDnsParse = {};
            $scope.newDnsParse.domain_id = domainItem.domain_id;
            $scope.ismax = false;

            $scope.setMx = function(){
                //console.log("setmax");
                if($scope.newDnsParse.record_type == 'MX'){
                    $scope.ismax = true;
                }else{
                    $scope.ismax = false;
                }
            }

            $scope.ok = function () {
                $modalInstance.close();

                //$scope.dataList.push($scope.newDns);
                $rootScope.alerts = [];
                dnsParseServices.add($scope.newDnsParse)
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '添加成功'});
                            $route.reload();
                        }else{

                            if(data.param){
                                //ErrorServices.openFailureModal(data.param.status.message);
                                $rootScope.alerts.push({type:'error', msg: data.param.status.message});
                            }else{
                                //ErrorServices.openFailureModal("信息格式不正确，请重新输入");
                                $rootScope.alerts.push({type:'error', msg: '信息格式不正确，请重新输入'});
                            }

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
