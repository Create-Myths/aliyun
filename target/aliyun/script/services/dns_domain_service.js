/**
 * Created by cohen on 13-12-22.
 */
/*DNS列表控制器*/
services.factory('dnsDomainServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return  '域名系统（Domain Name System）。在Internet上域名与IP地址' +
            '之间是一一对应的，域名虽然便于人们记忆，但机器之间只能互相认识IP地址，' +
            '它们之间的转换工作称为域名解析，域名解析需要由专门的域名解析系统来完成，' +
            'DNS就是进行域名解析的系统。 ';
    }

    //获取列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'ListDomain.json';
        $http.post(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.domains);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //删除域名
    items.deleteitem = function(item){

        var delay = $q.defer();
        var url = host + 'DelDomain.json';
        $http.post(url, {domain_id:item.id,  domain:item.name}).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：删除出错");
            });
        return delay.promise;
    };

    //重启域名
    items.reboot = function(item){

        var delay = $q.defer();
        var url = host + 'RecoverDomain';

        $http.post(url, {domain_id:item.id,  domain:item.name}).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：重启失败");
            });
        return delay.promise;
    };

    //暂停DNS域名
    items.pause = function(item){
        var delay = $q.defer();
        var url = host + 'PauseDomain';
        $http.post(url, {domain_id:item.id,  domain:item.name}).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
                delay.reject(item.name + "：重启失败");
            });
        return delay.promise;
    };


    //添加域名
    items.add = function(item){
        var delay = $q.defer();
        var url = host + 'AddDomain.json';

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

}])