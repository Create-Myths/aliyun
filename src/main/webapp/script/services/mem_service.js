/**
 * Created by Helen on 13-12-18.
 */


services.factory('memServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return '云内存存储是一种支持数据持久化的内存存储服务，使用Memcache协议进行访问，具备高性能和高可用' +
            '的特点，使用户无需自行搭建及管理memcache服务，减少研发和运维成本。';
    }

    //查询列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'GetMemList.json';
        //var url = 'script/jsontest/memory_list.json';

        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.memlist);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //创建内存
    items.create = function(item){
        //console.log(item);
        var delay = $q.defer();
        var url = host + 'CreateMem.json';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };


    //删除
    items.deleteitem = function(item){

        var delay = $q.defer();
        var url = host + 'DeleteMem.json';
        $http.post(url, {mem_id: item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.space_name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.space_name + "：删除失败");
            });
        return delay.promise;
    };

    //扩容
    items.extend = function(item){

        var delay = $q.defer();
        var url = host + 'DilateMem.json';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    return items;
}]);
