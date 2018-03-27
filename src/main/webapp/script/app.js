/**
 * Created by Helen on 13-12-14.
 */

//应用程序模块配置
var suncloudApp = angular.module('suncloud.app', [
    'ngRoute',
    'suncloud.controllers',
    'suncloud.filters',
    'suncloud.services',
    'suncloud.directives',
    'ui.bootstrap',
    'ngGrid',
    'ui.slider'
]);
var controllers = angular.module('suncloud.controllers',[]);
var services = angular.module('suncloud.services', ['ngResource']);

services.constant('baseUrl', './api/index.php');


//应用程序路由和控制器配置
suncloudApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/home', {
                templateUrl: 'view/home/home.html',
                controller: 'homeCtrl'
            }).
            when('/cdn', {
                // templateUrl: 'view/cdn/cdn.jsp',
                templateUrl: '/activiti/task.json',
                controller: 'cdnCtrl'
            }).
            when('/monitor', {
                templateUrl: 'view/monitor/monitor.html',
                controller: 'monitorCtrl'
            }).
            when('/personal', {
                templateUrl: 'view/personal/personal_detail.html',
                controller: 'personalDetailCtrl',
                resolve: {
                    data: function(userServices){
                        return userServices.queryDetail();
                    }
                }
            }).
            when('/personal_edit', {
                templateUrl: 'view/personal/personal_edit.html',
                controller: 'personalEditCtrl',
                resolve: {
                    data: function(userServices){
                        return userServices.queryDetail();
                    }
                }
            }). when('/host', {
                controller: 'hostListCtrl',
                templateUrl: 'view/host/host_list.html'
            }).
            when('/disk', {
                templateUrl: 'view/disk/disk_list.html',
                controller: 'diskListCtrl'
            }).when('/db', {
                templateUrl: 'view/db/db_list.html',
                controller: 'dbListCtrl'
            }).
            when('/load', {
                templateUrl: 'view/load/load_list.html',
                controller: 'loadListCtrl'
            }).
            when('/load_rule/:id/:name', {
                templateUrl: 'view/load/load_rule.html',
                controller: 'loadRuleCtrl'
            }).
            when('/memory', {
                templateUrl: 'view/memory/memory_list.html',
                controller: 'memoryListCtrl'
            }).
            when('/memory_in', {
                templateUrl: 'view/memory/memory_in.html',
                controller: 'memoryInCtrl'
            }).
            when('/protection', {
                templateUrl: 'view/protection/protection_list.html',
                controller: 'protecListCtrl'
            }).
            when('/protection_rule/:id/:name', {
                templateUrl: 'view/protection/protection_rule.html',
                controller: 'protecRuleCtrl'
            }).
            when('/dns', {
                templateUrl: 'view/dns/dns.html',
                controller: 'dnsCtrl'
            }).
            when('/dns_parse/:id/:name',{
                templateUrl:'view/dns/dns_parse.html',
                controller:'dnsParseCtrl'
            }).
            when('/dns_domain',{
                templateUrl:'view/dns/dns_domain.html',
                controller:'dnsDomainCtrl'
            }).
            when('/hello',{
                templateUrl:'view/test.html',
                controller:'includeCtrl'
            }).
            otherwise({
                redirectTo: '/home'
            });
    }])
    .config(function($httpProvider) {
            $httpProvider.defaults.transformRequest = function(data){

                if(data === undefined){
                    return data;
                }
                return $.param(data);
            };
            $httpProvider.defaults.headers.post['Content-Type']= 'application/x-www-form-urlencoded;charset=UTF-8';
        });
