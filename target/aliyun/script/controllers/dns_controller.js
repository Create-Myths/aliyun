/**
 * Created by cohen on 13-12-22.
 */
controllers.controller('dnsCtrl',
    ['dnsServices', '$scope', '$modal','$location',
        function(dnsServices, $scope, $modal,$location) {

        $scope.description = dnsServices.getDescription();

        $scope.login = function(){
            $location.path('#/dns_domain');
        };


}]);


