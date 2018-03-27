/**
 * Created by Helen on 13-12-14.
 */
var filters = angular.module("suncloud.filters", []);

filters.filter('hostCloudprotectionFilter', function() {
    return function(input) {
       if(input == 1){
            return "已开启";
        }else if(input == 0){
            return "已关闭";
        }
    };
});




