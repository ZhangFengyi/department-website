var manager_app = angular.module('managerApp', []);

manager_app.controller('managerCtrl', function ($scope, $http) {
    $scope.addManager = function () {
        $scope.newManager = {};
    };

    $scope.doAddManager = function (newManager) {
        $http.post('/manager/add', newManager).then(function successCallback(response) {
            var data = response.data;
            if (data.success) {
                new PNotify({
                    title: '成功',
                    text: '添加成功',
                    type: 'success',
                    styling: 'bootstrap3'
                });
            } else {
                new PNotify({
                    title: '失败',
                    text: data.message,
                    type: 'error',
                    styling: 'bootstrap3'
                });
            }
        }, function failCallback(response) {
            new PNotify({
                title: '失败',
                text: '网络错误',
                type: 'error',
                styling: 'bootstrap3'
            });
        });
    }
});