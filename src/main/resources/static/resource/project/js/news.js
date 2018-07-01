var fn_app = angular.module('newsApp', ['ngSanitize']);

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
        // 获取新闻内容
        news.content = $("#editor-one-edit").html();
        // 获取发布时间
        news.publishTime = $("#publish-time-edit").val();

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
        // 获取新闻内容
        news.content = $("#editor-one").html();
        // 获取发布时间内
        news.publishTime = $("#publish-time").val();

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