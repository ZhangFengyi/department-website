var fn_app = angular.module('imageApp', []);

fn_app.controller('imageCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/image/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.images = data.data;
            } else {
                $scope.images = [];
            }
        }, function (reason) {
            $scope.images = [];
        });
    };

    $scope.list();

    $scope.editImage = function (image) {
        $scope.edit = image;
    };

    $scope.doEditImage = function (image) {
        $http.post('/image/edit', image).then(function (value) {
            var data = value.data;
            if (data.success) {
                new PNotify({
                    title: '成功',
                    text: '编辑成功',
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
        }, function (reason) {
            new PNotify({
                title: '失败',
                text: '网络错误',
                type: 'error',
                styling: 'bootstrap3'
            });
        });
    };

    $scope.addImage = function () {
        $scope.add = {};
    };

    $scope.doAddImage = function (add) {
        $http.post('/image/add', add).then(function (response) {
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
        }, function (reason) {
            new PNotify({
                title: '失败',
                text: '网络错误',
                type: 'error',
                styling: 'bootstrap3'
            });
        });
    };
});