var fn_app = angular.module('fnApp', []);

fn_app.controller('fnCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/fn/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.fns = data.data;
            } else {
                $scope.fns = [];
            }
        }, function (reason) {
            $scope.fns = [];
        });
    };

    $scope.list();

    $scope.editFn = function (fn) {
        $scope.edit = fn;
    };

    $scope.doEditFn = function (fn) {
        $http.post('/fn/edit', fn).then(function (value) {
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

    $scope.addFn = function () {
        $scope.add = {};
    };

    $scope.doAddFn = function (add) {
        $http.post('/fn/add', add).then(function (response) {
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