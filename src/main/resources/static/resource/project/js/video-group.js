var video_group_app = angular.module('videoGroupApp', []);

video_group_app.controller('videoGroupCtrl', function ($scope, $http) {
    $scope.addVideoGroup = function () {
        $scope.add = {};
    };

    $scope.doAddVideoGroup = function (add) {
        $http.post('/video/group/add', add).then(function successCallback(response) {
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

    $scope.editVideoGroup = function (videoGroup) {
        $scope.edit = videoGroup;
    };

    $scope.doEditVideoGroup = function (edit) {
        $http.post('/video/group/edit', edit).then(function (response) {
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
        $http.post('/video/group/list', {}).then(function (response) {
            var data = response.data;
            if (data.success) {
                $scope.videoGroups = data.data;
            } else {
                $scope.videoGroups = [];
            }
        }, function (response) {
                $scope.videoGroups = [];
        });
    };

    $scope.list();
});