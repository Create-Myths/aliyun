/**
 * Created by Helen on 13-12-18.
 */


services.factory('userServices', ['$http', '$q', function($http, $q){
    var host = 'http://my.g.suncloud.cn/api/index.php?r=user/';
    var items = {};

   //修改密码
    items.changePassword = function(item){
        var delay = $q.defer();
        var url = host + 'changepassword';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;

    };

    //修改用户资料
    items.update = function(item){
        var delay = $q.defer();
        var url = host + 'update';

        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;

    };

    //获取用户资料
    items.queryDetail = function(){
        var delay = $q.defer();
        var url = host + 'Getuserinfo';
        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //统计用户信息
    items.queryTotal = function(){
        var delay = $q.defer();
        var url = host + 'Getusertotal';
        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    return items;


}]);
