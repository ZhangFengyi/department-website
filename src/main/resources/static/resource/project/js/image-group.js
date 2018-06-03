var fn_app = angular.module('imageGroupApp', []);

fn_app.controller('imageGroupCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/image/group/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.imageGroups = data.data;
            } else {
                $scope.imageGroups = [];
            }
        }, function (reason) {
            $scope.imageGroups = [];
        });
    };

    $scope.list();

    $scope.editImageGroup = function (imageGroup) {
        $scope.edit = imageGroup;
    };

    $scope.doEditImageGroup = function (imageGroup) {
        $http.post('/image/group/edit', imageGroup).then(function (value) {
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

    $scope.addImageGroup = function () {
        $scope.add = {};
    };

    $scope.doAddImageGroup = function (add) {
        $http.post('/image/group/add', add).then(function (response) {
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