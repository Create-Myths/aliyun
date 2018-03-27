/**
 * Created by Helen on 13-12-18.
 */


services.factory('diskServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return '硬盘 (Volume) 为主机提供块存储设备，它独立于主机的生命周期而存在，可以被连接到任意运行中的' +
            '主机上。注意，硬盘附加到主机上后，您还需要登陆到您的主机的操作系统中去加载该硬盘。当然，也可以从主机上' +
            '卸载硬盘、并转至其他主机。注意，请先在您的主机的操作系统中卸载硬盘，然后再在游戏云系统中卸载。';
    };

    //查询硬盘列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'GetDiskList.json';
        // var url = 'script/jsontest/disk_list.json';
        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };


    //创建云硬盘
    items.create = function(item){
        var delay = $q.defer();
        var url = host + 'CreateDisk.json';
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
        var url = host + 'DeleteDisk.json';
        $http.post(url, {diskId: item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.diskName;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.diskName + "：删除失败");
            });
        return delay.promise;
    };

    //克隆
    items.clone = function(item){

        var delay = $q.defer();
        var url = host + 'CloneDisk';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
        //return true;
        // return false;
    };

    //卸载
    items.unlink = function(item){

        var delay = $q.defer();
        var url = host + 'UmountDisk.json';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };


    //挂载
    items.link = function(hostId,diskId){

        var delay = $q.defer();
        var url = host + 'MountDisk.json';
        $http.post(url, {diskId: diskId, hostId: hostId}).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
        //return true;
        // return false;
    };

    //扩容
    items.extend = function(item){
        var delay = $q.defer();
        var url = host + 'ResizeDisk';
        $http.post(url, {diskId: item.id, size: item.diskSize}).
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
