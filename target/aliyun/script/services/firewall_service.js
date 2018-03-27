/**
 * Created by Helen on 13-12-18.
 */


services.factory('firewallServices', ['$http', '$q', function($http, $q){
    var host = 'http://localhost:8080/';
    var items = {};

    items.getDescription = function(){
        return '为了加强位于基础网络 vxnet-0 中的主机或路由器的安全性，可以在主机或路由器之前放置一个云防护。' +
            '游戏云系统为每个用户提供了一个云防护，当然，您也可以新建更多的弄云防护。初始状态下，每个云防护都不包含' +
            '任何规则，即，任何端口都是封闭的，您需要建立规则以打开相应的端口。';
    }

    //查询列表
    items.query = function(){
        var delay = $q.defer();
        var url = host + 'getFirewallList.json';
        //var url ='script/jsontest/firewall_list.json';
        var data = {offset: 0};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.info);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //创建
    items.create = function(item){
        var delay = $q.defer();
        var url = host + 'createCloudProtect.json';
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
        var url = host + 'deleteFire.json';

        $http.post(url, {id:item.id}).
            success(function(data, status, headers, config) {
                data.itemName = item.name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.name + "：删除出错");
            });
        return delay.promise;
    };

    //修改
    items.update = function(item){
        var delay = $q.defer();
        var url = host + 'firewallName.json';
        $http.post(url, item).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;

    };

    //获取规则列表：上行
    items.queryOutputRuleList = function(id){

        var delay = $q.defer();
        var url = host + 'GetFirewallParamsList';
        var data = {id: id, direct: 'OUTPUT'};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.info);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;
    };

    //获取规则列表：下行
    items.queryInputRuleList = function(id){

        var delay = $q.defer();
        var url = host + 'GetFirewallParamsList';
        var data = {id: id, direct: 'INPUT'};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.info);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;
    };

    //获取innerip
    items.queryInnerIp = function(){
        var delay = $q.defer();
        var url = host + 'getInnerIp';
        $http.get(url).
            success(function(data, status, headers, config) {
                delay.resolve(data.param.info);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });
        return delay.promise;
    };

    //创建规则\更新规则
    items.saveRule = function(item){
        var delay = $q.defer();
        var url = host + 'createFire';

        var data = item;
        $http.post(url, data).
            success(function(data, status, headers, config) {
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(data);
            });

        return delay.promise;

    };

    //删除规则
    items.deleteRule = function(item){
        var delay = $q.defer();
        var url = host + 'deleteFireParams';

        var data = {rule_id:item.id};
        $http.post(url, data).
            success(function(data, status, headers, config) {
                data.itemName = item.rule_name;
                delay.resolve(data);
            }).
            error(function(data, status, headers, config) {
                delay.reject(item.rule_name + "：删除失败");
            });

        return delay.promise;

    };


    return items;
}]);
