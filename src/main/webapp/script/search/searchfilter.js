/**
 * Created by Helen on 13-12-23.
 */
var app = angular.module('mySearchFilter',['myApp.servise','myApp.controllers']);
var services = angular.module('myApp.servise',[]);
var controllers = angular.module('myApp.controllers',[]);
services.factory('filterService', function() {
    return {
        activeFilters: {},
        searchText:''
    };
});
controllers.controller('FilterCtrl', ['$scope', 'filterService', function($scope, filterService) {
    $scope.filterService = filterService;

    console.log($scope.filterService);
}]);

/*test*/
controllers.controller('ListCtrl',['$scope', 'filterService',function($scope, filterService) {
    $scope.filterService = filterService;
    $scope.hostList = [
        {"id":"1",
            "hostName":"test",
            "innerIP":"10.11.10.9",
            "outerIP":"175.11.10.9",
            "state":"1",
            "die_time":"2014-12-17 15:29:43",
            "memo":"",
            "firewall":1
        },
        {
            "id":"5",
            "hostName":"test",
            "innerIP":"10.11.10.13",
            "outerIP":"175.11.10.13",
            "state":"1",
            "die_time":"2014-12-19 09:42:41",
            "memo":"",
            "firewall":0
        },
        {
            "id":"6",
            "hostName":"test",
            "innerIP":"10.11.10.14",
            "outerIP":"175.11.10.14","state":"1",
            "die_time":"2014-12-19 10:23:27",
            "memo":"","firewall":0
        }];
}])

