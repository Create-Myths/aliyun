/**
 * Created by Helen on 13-12-18.
 */

/*云内存跳转页（内页）列表控制器*/
controllers.controller('memoryInCtrl',    ['memServices', '$scope', '$modal',
    function(memServices, $scope, $modal) {

        $scope.description = memServices.getDescription();
    $scope.dataList = [
        {id: '1', a: 'default', b: '10.4.1.81',c: '11211',d:'2013-12-09  21：22'}];
    $scope.gridOptions = {
        data: 'dataList',
        headerRowHeight: '24',
        rowHeight: '40',
        showSelectionCheckbox: true,//行前checkbox
        /*showFilter: true,*///右上角的过滤器
        selectWithCheckboxOnly: true,//屏蔽行选择，只使用checkbox
        /* sortInfo: { fields: ['id', 'name'], directions: ['desc', 'asc'] },*///排序
        columnDefs: [
            {field:'a', displayName:'实例名称'},
            {field:'b', displayName:'访问地址'},
            {field:'c', displayName:'访问端口'},
            {field:'d', displayName:'创建时间'}]
    };

    //返回云内存列表
    $scope.backToMemoryList = function(){
        window.location.href = '#memory';
    }
}]);


