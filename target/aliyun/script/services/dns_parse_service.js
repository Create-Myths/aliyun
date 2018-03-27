/**
 * Created by cohen on 13-12-22.
 */
/*DNS列表控制器*/
services.factory('dnsParseServices', ['$http', '$q', function($http, $q){
    var host = 'http://my.g.suncloud.cn/api/index.php?r=DNSRecord/';
    var items = {};

    items.getDescription = function(){
        return  '域名系统（Domain Name System）。在Internet上域名与IP地址' +
            '之间是一一对应的，域名虽然便于人们记忆，但机器之间只能互相认识IP地址，' +
            '它们之间的转换工作称为域名解析，域名解析需要由专门的域名解析系统来完成，' +
            'DNS就是进行域名解析的系统。 ';
    }

    //获取列表
    items.query = function(id){//OK
        var delay = $q.defer();
        var url = host + 'ListDNSRecord';
        $http.post(url,{domain_id: id}).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.records);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;
    };

    //添加解析
    items.add = function(item){
        var delay = $q.defer();
        var url = host + 'AddDNSRecord';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                //console.log(data);
                /*if((typeof data) == 'string'){
                    var data = angular.fromJson(data);
                }
                console.log(data);*/
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //删除解析
    items.deleteitem = function(domainItem, item){

        var delay = $q.defer();
        var url = host + 'DelDNSRecord';
        var data = {domain_id: domainItem.domain_id,record_id: item.id};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：删除失败");
            });
        return delay.promise;
    };

    //重启解析
    items.reboot = function(domainItem,item){

        var delay = $q.defer();
        var url = host + 'RecoverDNSRecord';
        var data = {domain_id: domainItem.domain_id, record_id: item.id};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：重启失败");
            });
        return delay.promise;
    };

    //暂停DNS解析
    items.pause = function(domainItem,item){

        var delay = $q.defer();
        var url = host + 'PauseDNSRecord';
        var data = {domain_id: domainItem.domain_id, record_id: item.id};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：暂停失败");
            });
        return delay.promise;
    };

    return items;

}])