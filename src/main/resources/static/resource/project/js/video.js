var video_app = angular.module('videoApp', []);

video_app.controller('videoCtrl', function ($scope, $http) {
    $scope.addVideo = function () {
        $scope.add = {};
    };

    $scope.doAddVideo = function (add) {
        $http.post('/video/add', add).then(function successCallback(response) {
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
    };

    $scope.editVideo = function (video) {
        $scope.edit = video;
    };

    $scope.doEditVideo = function (edit) {
        $http.post('/video/edit', edit).then(function (response) {
            var data = response.data;
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

    $scope.list = function () {
        $http.post('/video/list', {}).then(function (response) {
            var data = response.data;
            if (data.success) {
                $scope.videos = data.data;
            } else {
                $scope.videos = [];
            }
        }, function (response) {
                $scope.videos = [];
        });
    };

    $scope.list();
});