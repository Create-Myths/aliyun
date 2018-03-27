/**
 * Created by Helen on 13-12-18.
 */


services.factory('hostServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return '我们您提供一种随时获取的、弹性的计算能力，这种计算能力的体现就是主机 。主机就是一台配置好了' +
            '的服务器，它有您期望的硬件配置、操作系统和网络配置。通常情况下，您的请求可以在10秒到60秒的时间之内完成，' +
            '所以您完全可以动态地、按需使用计算能力。';
    }

    //查询主机列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'gethostlist.json';
        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;
    };

    //创建
    items.create = function(item){
       var delay = $q.defer();
        var url = host + 'CreateHost.json';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //启动云主机
    items.start = function(item){
        var delay = $q.defer();
        var url = host + 'starthost.json';
        $http.post(url, {hostId: item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.hostName;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.hostName + "：重启失败");
            });
        return delay.promise;
    };

    //关闭云主机
    items.shutdown = function(item){
        var delay = $q.defer();
        var url = host + 'shutdown.json';
        $http.post(url, {hostId: item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.hostName;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.hostName + "：关机失败");
            });
        return delay.promise;
    };

    //断电
    items.poweroff = function(item){
        var delay = $q.defer();
        var url = host + 'poweroff';
        $http.post(url, {hostId: item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.hostName;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.hostName + "：断电失败");
            });
        return delay.promise;
    };

    //获取操作系统列表
    items.queryOsList = function(){
       var delay = $q.defer();
        var url = host + 'GetOsList.json';
        //var url = 'script/jsontest/os_list.json';
        $http.get(url).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //获取VNC登录URL
    items.queryVncUrl = function(item){
        var delay = $q.defer();
        var url = host + 'GetVncUrl';
        //var url = 'script/jsontest/os_list.json';
        $http.post(url,item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //获取VNC登录参数
    items.queryVncParam = function(item){
        var delay = $q.defer();
        var url = host + 'GetVncParams';

        $http.post(url,item).
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
