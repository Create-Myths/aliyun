/**
 * Created by Helen on 13-12-15.
 */
var directives = angular.module("suncloud.directives", []);

directives.directive('match', [function () {
    return {
        require: 'ngModel',
        link: function (scope, elem, attrs, ctrl) {

            scope.$watch('[' + attrs.ngModel + ', ' + attrs.match + ']', function(value){

                /*console.log(value[0]);
                console.log(value[1]);*/
                ctrl.$setValidity('match', value[0] === value[1] );
            }, true);

        }
    }
}]);

directives.directive('ngEnter', function () {
    return function (scope, element, attrs) {
        element.bind("keydown keypress blur", function (event) {
            if(event.which === 13 || event.which === 0) {
                scope.$apply(function (){
                    scope.$eval(attrs.ngEnter);
                });

                event.preventDefault();
            }
        });
    };
});

directives.directive('enter', function () {
    return function (scope, element, attrs) {
        element.bind("keydown keypress", function (event) {
            if(event.which === 13) {
                scope.$apply(function (){
                    scope.$eval(attrs.enter);
                });

                event.preventDefault();
            }
        });
    };
});

/*

directives.directive('pwcheck', [function () {
    return {
        require: 'ngModel',
        link: function (scope, element, attrs, controller) {
            var firstPassword = '#' + attrs.pwCheck;
            console.log("element0:" + element[0]);
            element.add(firstPassword).on('keyup', function () {
                scope.$apply(function () {
                    var v = element.val()===$(firstPassword).val();
                    //ctrl.$setValidity('pwmatch', v);
                    controller.$setValidity('pwcheck', v);
                });
            });
        }
    }
}]);
*/
