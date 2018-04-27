var login_app = angular.module('loginApp', []);

login_app.controller('loginCtrl', function ($scope) {

    $scope.validate = function () {
        document.getElementById("submit").click();
    }
});

//
// var login_app = angular.module('loginApp', []);
//
// login_app.controller('LoginCtrl', function ($scope, $timeout) {
//     $timeout(function () {
//         $scope.user = {}
//     });
//
//     $scope.class = {
//         email: "",
//         password: ""
//     };
//
//     $scope.valid = {
//         email: true,
//         password: true
//     };
//
//     $scope.validate = function () {
//         if ($scope.check('email') && $scope.check('password')) {
//             document.getElementById("submit").click();
//         }
//     };
//
//     $scope.check = function (key) {
//         $scope.class[key] = "";
//         $scope.valid[key] = true;
//         if (!$scope.user[key] || $scope.user[key] === '') {
//             $scope.class[key] = "login-input-invalid";
//             $scope.valid[key] = false;
//             return false;
//         }
//         return true;
//     };
// });