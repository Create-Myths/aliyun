/**
 * Created by Helen on 13-12-27.
 * 主页控制器
 */

controllers.controller('homeCtrl', ['userServices','$scope','$route', '$modal','$location','$window',
    function(userServices,$scope,$route,$modal,$location,$window) {

        focusNav();
        //放在这里可以先加载页面，后填充动态值，放在resolve里先准备好页面的所有内容再显示

        //统计信息
        userServices.queryTotal().then(
            function(data){
                $scope.totallist = data;
            }
        );

        //用户信息
        userServices.queryDetail().then(
            function(data){
                $scope.user = data;
            }
        );

        $scope.createHost = function(){
            $location.path('/host');
        };

        $scope.support = function(){

            $modal.open({
                templateUrl: 'view/home/modal_support.html',
                controller: 'supportCtrl'
            });
        };


}]);
