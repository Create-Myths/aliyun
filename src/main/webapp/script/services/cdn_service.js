/**
 * Created by cohen on 13-12-22.
 */
/*DNS列表控制器*/
services.factory('cdnServices', ['$http', '$q', function($http, $q){
    var host = 'http://my.g.suncloud.cn/api/index.php?r=cdn/';
    var items = {};

    items.getDescription = function(){
        return   'CDN的全称是Content Delivery Network，即内容分发网络，' +
            '是位于网络层与应用层之间的网络应用，其目的是通过在现有的Internet' +
            '中增加一层新的网络架构，通过智能的中心管理系统，使用广泛分布的服务' +
            '器群来改善Internet上的服务质量，提高网站服务的承载能力及网站运行的' +
            '安全性，改善用户访问的响应质量。从技术上全面解决由于网络带宽小、用户' +
            '访问量大、网点分布不均等问题，提高用户访问网站的响应速度。';
    };

    //查询硬盘列表
    items.syncUser = function(){
        var url = host + 'syncUser';
        $http.post(url).
            success(function(data, status, headers, config) {
                return data;
            }).
            error(function(data, status, headers, config) {
                return data;
            });
    };

    return items;

}])