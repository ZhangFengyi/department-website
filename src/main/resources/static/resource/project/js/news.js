var fn_app = angular.module('newsApp', []);

fn_app.controller('newsCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/news/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.newsList = data.data;
            } else {
                $scope.newsList = [];
            }
        }, function (reason) {
            $scope.newsList = [];
        });
    };

    $scope.list();

    $scope.editNews = function (news) {
        $scope.edit = news;
    };

    $scope.doEditNews = function (news) {
        $http.post('/news/edit', news).then(function (value) {
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

    $scope.addNews = function () {
        $scope.add = {};
    };

    $scope.doAddNews = function (news) {
        $http.post('/news/add', news).then(function (response) {
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