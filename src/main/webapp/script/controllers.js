/**
 * Created by Helen on 13-12-14.
 */

/*ng-grid通用属性*/
/*var ngGridPro = {};*/


/*CDN控制器*/
controllers.controller('cdnCtrl', ['cdnServices','$scope', function(cdnServices,$scope) {

    $scope.description = cdnServices.getDescription();

    //同步用户信息
    cdnServices.syncUser();
}]);

/*DNS控制器*/
controllers.controller('dnsCtrl', ['$scope', function($scope) {
    $scope.text = '域名系统（Domain Name System）。在Internet上域名与IP地址' +
        '之间是一一对应的，域名虽然便于人们记忆，但机器之间只能互相认识IP地址，' +
        '它们之间的转换工作称为域名解析，域名解析需要由专门的域名解析系统来完成，' +
        'DNS就是进行域名解析的系统。 ';
}]);

/*监控宝控制器*/
controllers.controller('monitorCtrl', ['$scope', function($scope) {
    $scope.text = '监控宝可以帮助您更加及时有效的了解您的网站运转是否正常，服务器性能指标是否合理，' +
        '应用层服务是否稳定。';
}]);









