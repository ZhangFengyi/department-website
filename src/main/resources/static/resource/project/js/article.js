var fn_app = angular.module('articleApp', []);

fn_app.controller('articleCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/article/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.articles = data.data;
            } else {
                $scope.articles = [];
            }
        }, function (reason) {
            $scope.articles = [];
        });
    };

    $scope.list();

    $scope.editArticle = function (article) {
        $scope.edit = article;
    };

    $scope.doEditArticle = function (article) {
        $http.post('/article/edit', article).then(function (value) {
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

    $scope.addArticle = function () {
        $scope.add = {};
    };

    $scope.doAddArticle = function (article) {
        $http.post('/article/add', article).then(function (response) {
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