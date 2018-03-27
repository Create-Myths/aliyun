/**
 * Created by cohen on 13-12-22.
 */
/*DNS列表控制器*/
services.factory('dnsServices', ['$http', '$q', function($http, $q){
    var host = 'http://my.g.suncloud.cn/api/index.php?r=DNSRecord/';
    var items = {};

    items.getDescription = function(){
        return  '域名系统（Domain Name System）。在Internet上域名与IP地址' +
            '之间是一一对应的，域名虽然便于人们记忆，但机器之间只能互相认识IP地址，' +
            '它们之间的转换工作称为域名解析，域名解析需要由专门的域名解析系统来完成，' +
            'DNS就是进行域名解析的系统。 ';
    }

    return items;

}])