/**
 * Created by Helen on 13-12-25.
 * 云内存扩容弹窗控制器
 */
controllers.controller('memoryExtendCtrl',
    ["memServices", 'item', 'ErrorServices',
        '$scope', '$modalInstance','$route','$rootScope','$timeout',
        function(memServices, item, ErrorServices,
                 $scope, $modalInstance,$route,$rootScope,$timeout) {

            //console.log(item);
            //item.size = parseInt(item.size);//转成int，这样才能在表单的number类型的区域中自动显示出来
            //item.size = 10;
            $scope.mem = item;//动态变化的值，会直接影响到列表
            //console.log($scope.orientationMem);
            $scope.newMem = {};//存储新值

            commonMemoryRange.min = parseInt($scope.mem.size);//重新设置默认最小值
            commonMemoryOptions.min = parseInt($scope.mem.size);//重新设置默认最小值
            //文本框
            $scope.newMem.size = commonMemoryRange.min;
            //滑动条
            $scope.memoryRange = commonMemoryRange;
            $scope.memoryOptions = commonMemoryOptions;

            $scope.judgeMem = function(){

                if($scope.newMem.size >  commonMemoryRange.max){
                    $scope.newMem.size = commonMemoryRange.max;
                }
                if($scope.newMem.size <  commonMemoryRange.min){
                    $scope.newMem.size = commonMemoryRange.min;
                }
            };

            $scope.ok = function () {
                $modalInstance.close();
               // console.log("ok");

                $rootScope.alerts = [];
                memServices.extend({mem_id: $scope.mem.id, diate_size: $scope.newMem.size})
                    .then(
                    function(data){
                        if(data.result === "true"){
                            //ErrorServices.openSuccessModal();
                            $rootScope.alerts.push({type:'success', msg: '扩容成功'});
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
