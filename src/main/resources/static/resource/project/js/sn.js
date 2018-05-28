var fn_app = angular.module('snApp', []);

fn_app.controller('snCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/sn/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.sns = data.data;
            } else {
                $scope.sns = [];
            }
        }, function (reason) {
            $scope.sns = [];
        });
    };

    $scope.list();

    $scope.editSn = function (sn) {
        $scope.edit = sn;
    };

    $scope.doEditSn = function (sn) {
        $http.post('/sn/edit', sn).then(function (value) {
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

    $scope.addSn = function () {
        $scope.add = {};
    };

    $scope.doAddSn = function (add) {
        $http.post('/sn/add', add).then(function (response) {
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