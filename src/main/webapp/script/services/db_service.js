/**
 * Created by Helen on 13-12-18.
 */


services.factory('databaseServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return '关系型数据库服务（Relational Database Service，简称RDS）是一种稳定可靠、可弹性伸缩的在线' +
            '数据库服务。RDS采用即开即用方式，兼容MySQL、SQL Server两种关系型数据库。RDS与云服务器搭配使用I/O性能' +
            '倍增，内网互通避免网络瓶颈。';
    };

    //查询列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'getdblist.json';
        //var url = 'script/jsontest/db_list.json';

        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.dbs);
            }).error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;

    };

    //启动
    items.start = function(item){

        var delay = $q.defer();
        var url = host + 'start';
        $http.post(url, {db_id: item.id}).success(function(data, status, headers, config) {
                data.itemName = item.db_name;
                delay.resolve(data);
            }).error(function(data, status, headers, config) {
                delay.reject(item.db_name + "：启动数据库失败");
            });
        return delay.promise;
    };

    //停止
    items.shutdown = function(item){

        var delay = $q.defer();
        var url = host + 'stop';
        $http.post(url, {db_id: item.id}).success(function(data, status, headers, config) {
                data.itemName = item.db_name;
                delay.resolve(data);
            }).error(function(data, status, headers, config) {
                delay.reject(item.db_name + "：停止数据库失败");
            });
        return delay.promise;
    };

    //删除
    items.deleteitem = function(item){

        var delay = $q.defer();
        var url = host + 'DeleteDb.json';
        $http.post(url, {db_id: item.id}).success(function(data, status, headers, config) {
                data.itemName = item.db_name;
                delay.resolve(data);
            }).error(function(data, status, headers, config) {
                delay.reject(item.db_name + "：删除失败");
            });
        return delay.promise;
    };

    //创建
    items.create = function(item){
        var delay = $q.defer();
        var url = host + 'CreateDB.json';
        $http.post(url, item).success(function(data, status, headers, config) {
                delay.resolve(data);
            }).error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;

    };


    //登录
    items.login = function(item){
        var delay = $q.defer();
        var url = host + 'LoginPhpmyadmin' + '&db_id=' + item.db_id;
        delay.resolve(url);
        return delay.promise;
    };

    return items;
}]);
