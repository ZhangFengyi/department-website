var fn_app = angular.module('articleListApp', []);

fn_app.controller('articleListCtrl', function ($scope, $http) {
    $scope.list = function () {
        $http.post('/articleList/list', {}).then(function (value) {
            var data = value.data;
            if (data.success) {
                $scope.articleLists = data.data;
            } else {
                $scope.articleLists = [];
            }
        }, function (reason) {
            $scope.articleLists = [];
        });
    };

    $scope.list();

    $scope.editArticleList = function (articleList) {
        $scope.edit = articleList;
    };

    $scope.doEditArticleList = function (articleList) {
        $http.post('/articleList/edit', articleList).then(function (value) {
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

    $scope.addArticleList = function () {
        $scope.add = {};
    };

    $scope.doAddArticleList = function (articleList) {
        $http.post('/articleList/add', articleList).then(function (response) {
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