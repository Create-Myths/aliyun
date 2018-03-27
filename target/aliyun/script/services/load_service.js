/**
 * Created by Helen on 13-12-18.
 */


services.factory('loadServices',['$http', '$q', function($http, $q){

            var host = 'http://localhost:8080/';
            var items = {};

            items.getDescription = function(){
                return '负载均衡器可以将来自多个公网地址的访问流量分发到多台主机上，并支持自动检测并隔离不可用的主机，' +
                    '从而提高业务的服务能力和可用性。同时，你还可以随时通过添加或删减主机来调整你的服务能力，而且这些操作' +
                    '不会影响业务的正常访问。';
            };

            //查询列表
            items.query = function(){

                var delay = $q.defer();
                var url = host + 'GetBalancerList.json';
                $http.get(url).
                    success(function(data, status, headers, config) {
                        delay.resolve(data.param.BalancerList);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject(data);
                    });
                return delay.promise;
            };

            items.queryRuleList = function(id){

                var delay = $q.defer();
                var url = host + 'getbalancerrolelist.json';
                var data = {id: id};
                $http.post(url, data).
                    success(function(data, status, headers, config) {
                        delay.resolve(data.param.BalancerRoleList);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject(data);
                    });

                return delay.promise;
            };

            //删除
            items.deleteitem = function(item){

                var delay = $q.defer();
                var url = host + 'DeleteBalancer.json';
                $http.post(url, {id: item.id}).
                    success(function(data, status, headers, config) {
                        data.itemName = item.name;
                        delay.resolve(data);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject(item.name + "：删除出错");
                    });
                return delay.promise;
                //return true;
                // return false;
            };


            //删除规则
            items.deleteRule = function(item){

                var delay = $q.defer();
                var url = host + 'DeleteBalancerRole';
                $http.post(url, {id: item.id}).
                    success(function(data, status, headers, config) {
                        data.itemName = item.id;
                        delay.resolve(data);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject("负载均衡id-" + item.id + "：删除出错");
                    });
                return delay.promise;
            };


            //创建负载均衡和规则
            items.create = function(item){

                var delay = $q.defer();
                var url = host + 'CreateBalancerAndRole.json';

                $http.post(url, item).
                    success(function(data, status, headers, config) {
                        delay.resolve(data);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject(data);
                    });
                return delay.promise;
            };


            //创建
            items.createRule = function(item){

                var delay = $q.defer();
                var url = host + 'CreateBalancerRole.json';

                $.post(url, item).
                    success(function(data, status, headers, config) {
                        var dataObject = angular.fromJson(data);
                        delay.resolve(dataObject);
                    }).
                    error(function(data, status, headers, config) {
                        delay.reject("创建负载均衡规则出错");
                    });
                return delay.promise;
            };

            return items;
        }]);
