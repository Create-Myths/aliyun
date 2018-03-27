/**
 * Created by Helen on 13-12-24.
 * 断电
 */
controllers.controller('hostPoweroffCtrl',
    ['hostServices', 'items', 'showText', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(hostServices, items, showText, ErrorServices,
                 $scope, $modalInstance, $route,$rootScope,$timeout) {

            $scope.modalConfirm = {title: '断电', textLine1: showText};

            $scope.ok = function () {
                $modalInstance.close();

                $rootScope.alerts = [];
                var counter = items.length;
                for(var i = 0; i < items.length; i++){
                    hostServices.poweroff(items[i])
                        .then(
                        function(data){
                            if(data.result === 'true'){
                                //ErrorServices.openSuccessModal(data.itemName + '：断电成功');
                                $rootScope.alerts.push({type:'success', msg: data.itemName + '：断电成功'});

                            }else{
                                //ErrorServices.openFailureModal(data.itemName + '：' + data.errormsg);
                                $rootScope.alerts.push({type:'error', msg: data.itemName + '：' + data.errormsg});
                            }
                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }

                            $timeout(function(){
                                $rootScope.alerts.splice(0, 1);
                            },alertLifeTime);

                        },function(data){
                            //ErrorServices.openSystemErrorModal(data);
                            $rootScope.alerts.push({type:'error', msg: data});

                            counter--;
                            if(counter == 0){
                                $route.reload();
                            }

                            $timeout(function(){
                                $rootScope.alerts.splice(0, 1);
                            },alertLifeTime);

                        });
                }
            };
            $scope.cancel = function () {
                $modalInstance.dismiss();
            };
        }]);

