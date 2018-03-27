/**
 * Created by Helen on 13-12-16.
 */

$(function(){

    //console.log('currentUri='+currentUri);
    focusNav();

    $('.cloud-nav-list li a, .cloud-nav-list .nav-header').click(function(){

        if($(this).attr('class') == 'nav-header'){
            $(this).siblings().removeClass('active');
            $(this).addClass('active');
        }else{
            $(this).parent().siblings().removeClass('active');
            $(this).parent().addClass('active');
        }

        //alert( $(this).attr("href"));
        //alert( this.href);//跨浏览器不兼容，实际属性不存在时无法取值
        window.location.href = $(this).attr('href');

        return false;
    });



});

function logout(){
    $.ajax({
        type: 'POST',
        url: 'api/index.php?r=user/logout',
        dataType: 'json',
        success: function(data){
            location.pathname = './user/login.html';
        }
    });
}

function searchFormFun(){

    document.searchform.submit();
}

var refreshPage = function(url){
    window.location.href = url + "?" + Math.random();
}

var commonGridOptions = {
    data: 'dataList',
    showSelectionCheckbox: true,//行前checkbox
    multiSelect: true,//单选模式
    selectWithCheckboxOnly: true,//true屏蔽行选择，只使用checkbox,
    /*keepLastSelected: false,*/
    enableColumnResize:true,
    headerRowHeight: '30',
    rowHeight: '30',
    /*ng-grid分页设置*/
    totalServerItems: 'totalServerItems',
    enablePaging: true,
    showFooter: true,
    pagingOptions:{
        pageSizes: [10],
        pageSize: 10,
        currentPage: 1
    },
    filterOptions:{
        filterText: "",
        useExternalFilter: true
    },
    i18n: 'zh-cn'
    /*showFilter: true,*///右上角的过滤器
    /* sortInfo: { fields: ['id', 'name'], directions: ['desc', 'asc'] },*///排序
};

function setPagingData(data, page, pageSize,$scope){
    var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
    $scope.dataList = pagedData;
    $scope.totalServerItems = data.length;
    if (!$scope.$$phase) {
        $scope.$apply();
    }
}

function pageConfiguration(service, $scope,ErrorServices){
    commonGridOptions.pagingOptions.currentPage = 1;//重置首页页码
    $scope.filterOptions = commonGridOptions.filterOptions;
    $scope.pagingOptions = commonGridOptions.pagingOptions;
    $scope.getPagedDataAsync = function (pageSize, page, searchText) {
        service.query().then(function(data){

            if (searchText) {
                var ft = searchText.toLowerCase();
                data = data.filter(function(item) {
                    return JSON.stringify(item).toLowerCase().indexOf(ft) != -1;
                });
            }
            setPagingData(data,page,pageSize,$scope);
        },function(data){
            ErrorServices.openSystemErrorModal();
        });
    };
    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
    $scope.$watch('pagingOptions', function (newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage,$scope.filterOptions.filterText);
        }
    }, true);
    $scope.$watch('filterOptions', function (newVal, oldVal) {
        if (newVal !== oldVal) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
}

function pageConfigurationDnsParse(service, $scope,ErrorServices,id){
    commonGridOptions.pagingOptions.currentPage = 1;//重置首页页码
    $scope.filterOptions = commonGridOptions.filterOptions;
    $scope.pagingOptions = commonGridOptions.pagingOptions;
    $scope.getPagedDataAsync = function (pageSize, page, searchText) {
        service.query(id).then(function(data){
                if (searchText) {
                var ft = searchText.toLowerCase();
                data = data.filter(function(item) {
                    return JSON.stringify(item).toLowerCase().indexOf(ft) != -1;
                });
            }
            setPagingData(data,page,pageSize,$scope);
        },function(data){
            ErrorServices.openSystemErrorModal();
        });
    };
    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
    $scope.$watch('pagingOptions', function (newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage,$scope.filterOptions.filterText);
        }
    }, true);
    $scope.$watch('filterOptions', function (newVal, oldVal) {
        if (newVal !== oldVal) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
}


function pageConfigurationLoadRule(service, $scope,ErrorServices,id){
    commonGridOptions.pagingOptions.currentPage = 1;//重置首页页码
    $scope.filterOptions = commonGridOptions.filterOptions;
    $scope.pagingOptions = commonGridOptions.pagingOptions;
    $scope.getPagedDataAsync = function (pageSize, page, searchText) {
        service.queryRuleList(id).then(function(data){
            if (searchText) {
                var ft = searchText.toLowerCase();
                data = data.filter(function(item) {
                    return JSON.stringify(item).toLowerCase().indexOf(ft) != -1;
                });
            }
            setPagingData(data,page,pageSize,$scope);
        },function(data){
            ErrorServices.openSystemErrorModal();
        });
    };
    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
    $scope.$watch('pagingOptions', function (newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage,$scope.filterOptions.filterText);
        }
    }, true);
    $scope.$watch('filterOptions', function (newVal, oldVal) {
        if (newVal !== oldVal) {
            $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
}

/*硬盘的滑动条基本配置*/
var commonDiskRange= {
    min: 10,
    max: 2048,
    max2: 2,
    unit: 'GB',
    unit2: 'T'
}
var commonDiskOptions = {
    orientation: 'horizontal',
    min: commonDiskRange.min,
    max: commonDiskRange.max,
    range: 'min',
    step: 10
};


/*内存的滑动条基本配置*/
var commonMemoryRange= {
    min: 1,
    max: 128,
    max2: 128,
    unit: 'GB',
    unit2: 'GB'
}
var commonMemoryOptions = {
    orientation: 'horizontal',
    min: commonMemoryRange.min,
    max: commonMemoryRange.max,
    range: 'min',
    step: 1
};



/*CPU的滑动条基本配置*/
var commonCPURange= {
    min: 1,
    max: 32,
    max2: 32,
    unit: '核',
    unit2: '核'
}
var commonCPUOptions = {
    orientation: 'horizontal',
    min: commonCPURange.min,
    max: commonCPURange.max,
    range: 'min',
    step: 1
};



/*带宽的滑动条基本配置*/
var commonSpeedRange= {
    min: 1,
    max: 400,
    max2: 400,
    unit: 'Mbps',
    unit2: 'Mbps'
}
var commonSpeedOptions = {
    orientation: 'horizontal',
    min: commonSpeedRange.min,
    max: commonSpeedRange.max,
    range: 'min',
    step: 1
};

/**
 * 负载均衡计算
 * @param carrer 运营商
 * @param bandWidth 带宽
 * @param month 月份
 */
function load_calc(carrer,bandwidth,month){
    if (bandwidth < 1) 
        return 0;
    if (bandwidth > 400) 
        bandwidth = 400;
    if (bandwidth <= 5) 
        return 15 * bandwidth * month;
    else {
        return (15 * 5 + 45 * (bandwidth - 5)) * month;
    }
}
//计算硬盘价格=主机数 * 月数 * 每10G一个单位 * 价格
/**
 * 计算硬盘费用
 *  @param hostNumber 主机个数
 *  @param month 月数
 *  @param diskCapcity 容量 GB
 *  @param price 单价
 */
function disk_calc(hostNumber,month,diskCapcity){
    var diskOfTenPrice = 4.0 //每个月一台增加10G硬盘容量价格
    var number = parseInt(diskCapcity % 10) == 0 ? parseInt(diskCapcity / 10) : (parseInt(diskCapcity / 10) + 1);
    return hostNumber * diskOfTenPrice * month * number;
}
function disk_calc_of_host(hostNumber,month,diskCapcity){
    var diskOfTenPrice_YEAR = 40; //每年一台增加10G硬盘容量价格
    var diskOfTenPrice = diskOfTenPrice_YEAR/10; //每个月一台增加10G硬盘容量价格
    var number = parseInt(diskCapcity % 10) == 0 ? parseInt(diskCapcity / 10) : (parseInt(diskCapcity / 10) + 1);
    if(month % 12 == 0){
        return hostNumber * diskOfTenPrice_YEAR * (month/12) * number;
    }else{
        return hostNumber * diskOfTenPrice * month * number;
    }
}
/**
 * 计算内存费用
 *  @param hostNumber 主机个数
 *  @param capcity 内存容量 GB
 *  @param month 月数
 */
function mem_calc(hostNumber,month,capcity){

    /*console.log("hostNumber=" + hostNumber);
    console.log("month=" + month);
    console.log("capcity=" + capcity);*/
    var memOfOnePrice =  120.0 //每一次性增加1G内存价格
    var memOfTwoPrice =  150.0 //每一次性增加2G内存价格
    var memOfFourPrice =  270.0 //每一次性增加4G内存价格

    var fourOfCount = function(){return parseInt(capcity / 4)};
    var twoOfcount = function(){return parseInt((parseInt(capcity % 4)) / 2)};
    var oneOfcount = function(){return parseInt((parseInt(capcity % 4)) % 2)};
    var sum = 0.0;
    sum = hostNumber * month * (fourOfCount() * memOfFourPrice + twoOfcount() * memOfTwoPrice +
        oneOfcount() * memOfOnePrice);

    /*console.log("fourOfCount=" + fourOfCount());
    console.log("twoOfcount=" + twoOfcount());
    console.log("oneOfcount=" + oneOfcount());*/
    return sum;
}
function mem_calc_of_host(hostNumber,month,capcity){

    /*console.log("hostNumber=" + hostNumber);
     console.log("month=" + month);
     console.log("capcity=" + capcity);*/
    var memOfOnePrice_YEAR =  1200; //每一次性增加1G内存价格
    var memOfTwoPrice_YEAR =  1500; //每一次性增加2G内存价格
    var memOfFourPrice_YEAR =  2700; //每一次性增加4G内存价格

    var memOfOnePrice =  memOfOnePrice_YEAR/10; //每一次性增加1G内存价格
    var memOfTwoPrice =  memOfTwoPrice_YEAR/10; //每一次性增加2G内存价格
    var memOfFourPrice =  memOfFourPrice_YEAR/10; //每一次性增加4G内存价格

    var fourOfCount = function(){return parseInt(capcity / 4)};
    var twoOfcount = function(){return parseInt((parseInt(capcity % 4)) / 2)};
    var oneOfcount = function(){return parseInt((parseInt(capcity % 4)) % 2)};
    var sum = 0.0;

    if(month % 12 == 0){
        sum = hostNumber * (month/12) * (fourOfCount() * memOfFourPrice_YEAR + twoOfcount() * memOfTwoPrice_YEAR +
            oneOfcount() * memOfOnePrice_YEAR);
    }else{
        sum = hostNumber * month * (fourOfCount() * memOfFourPrice + twoOfcount() * memOfTwoPrice +
            oneOfcount() * memOfOnePrice);
    }

    /*console.log("fourOfCount=" + fourOfCount());
     console.log("twoOfcount=" + twoOfcount());
     console.log("oneOfcount=" + oneOfcount());*/
    return sum;
}

//计算cpu价格=主机数 * cpu数 * 月数 * 价格
function cpu_calc(hostNumber,month,cpuNumber){
    var cpuOfCorePrice_YEAR = 500.0; //cpu每核一年价格
    var cpuOfCorePrice = cpuOfCorePrice_YEAR/10; //cpu每核一个月价格
    if(month % 12 == 0){
        return hostNumber * (month/12) * cpuNumber * cpuOfCorePrice_YEAR;
    }else{
        return hostNumber * month * cpuNumber * cpuOfCorePrice;
    }
}

function band_calc(hostNumber,month,carrer,bandWidth){
    var telcomBandWidthPrice = 100.0 //每个月电信一台主机1M带宽
    var chuBandWidthPrice = 100.0 //每个月联通一台主机1M带宽
    var bgpWidthPrice = 200.0 //每个月BGP一台主机1M带宽
    var sum = 0.0;
    if ("电信" == carrer){
        sum = telcomBandWidthPrice * month * bandWidth * hostNumber;
    }else if ("联通" == carrer){
        sum = chuBandWidthPrice * month * bandWidth * hostNumber;
    }else if ("BGP双线" == carrer){
        sum = bgpWidthPrice * month * bandWidth * hostNumber;
    }else if ("无网络" == carrer){
        sum = 0;
    }
    return sum;
}

function band_calc_of_host(hostNumber,month,carrer,bandWidth){
    var telcomBandWidthPrice_YEAR = 1000; //每年电信一台主机1M带宽
    var chuBandWidthPrice_YEAR = 1000; //每年联通一台主机1M带宽
    var bgpWidthPrice_YEAR = 1200; //每年BGP一台主机1M带宽

    var telcomBandWidthPrice = telcomBandWidthPrice_YEAR/10; //每个月电信一台主机1M带宽
    var chuBandWidthPrice = chuBandWidthPrice_YEAR/10; //每个月联通一台主机1M带宽
    var bgpWidthPrice = bgpWidthPrice_YEAR/10; //每个月BGP一台主机1M带宽

    var sum = 0.0;
    if(month % 12 == 0){
        if ("电信" == carrer){
            sum = telcomBandWidthPrice_YEAR * (month/12) * bandWidth * hostNumber;
        }else if ("联通" == carrer){
            sum = chuBandWidthPrice_YEAR * (month/12) * bandWidth * hostNumber;
        }else if ("BGP双线" == carrer){
            sum = bgpWidthPrice_YEAR * (month/12) * bandWidth * hostNumber;
        }else if ("无网络" == carrer){
            sum = 0;
        }
    }else{
        if ("电信" == carrer){
            sum = telcomBandWidthPrice * month * bandWidth * hostNumber;
        }else if ("联通" == carrer){
            sum = chuBandWidthPrice * month * bandWidth * hostNumber;
        }else if ("BGP双线" == carrer){
            sum = bgpWidthPrice * month * bandWidth * hostNumber;
        }else if ("无网络" == carrer){
            sum = 0;
        }
    }

    return sum;
}

/**
 * ip价格计算
 * @param hostNumber 主机个数
 * @param month 月份数
 * @param number ip个数
 * @param carrer 运营商
 */
function ip_calc(hostNumber,month,number,carrer){
    var telcomIP = 160.0 //每个月1个电信IP一台主机价格
    var chuIP = 150.0 //每个月1个联通IP一台主机价格
    var sum = 0.0;
    if ("电信" == carrer){
        sum = telcomIP * month * number * hostNumber;
    }else if ("联通" == carrer){
        sum = chuIP * month * number * hostNumber;
    }
    return sum;
}


function base_price(hostNumber,month,carrer,buyType){
    var minBasePriceOfTelcom_YEAR = 3716 //每年1台主机电信价格
    var minBasePriceOfCHU_YEAR = 3716 //每年1台主机联通价格
    var minBasePriceOfBGP_YEAR = 3890 //每年1台主机BGP价格

    var minBasePriceOfTelcom = minBasePriceOfTelcom_YEAR/10 //每个月1台主机电信价格
    var minBasePriceOfCHU = minBasePriceOfCHU_YEAR/10 //每个月1台主机联通价格
    var minBasePriceOfBGP = minBasePriceOfBGP_YEAR/10 //每个月1台主机BGP价格
    var sum = 0.0;
    //console.log("基础价计算");
    if(buyType == 1 || month % 12 == 0){
        //console.log("按年购买：month=" + month);
        if ("电信" == carrer){
            sum = minBasePriceOfTelcom_YEAR * hostNumber * (month/12);
        }else if ("联通" == carrer){
            sum = minBasePriceOfCHU_YEAR * hostNumber * (month/12);
        } else if ("BGP双线" == carrer){
            sum = minBasePriceOfBGP_YEAR * hostNumber * (month/12);
        } else if ("无网络" == carrer){
            var nolineprice = 700 * hostNumber * (month/12);
            sum = minBasePriceOfTelcom_YEAR * hostNumber * (month/12) - nolineprice;
        }
    }else if(buyType == 2){
        //console.log("按月购买");
        if ("电信" == carrer){
            sum = minBasePriceOfTelcom * hostNumber * month;
        }else if ("联通" == carrer){
            sum = minBasePriceOfCHU * hostNumber * month;
        } else if ("BGP双线" == carrer){
            sum = minBasePriceOfBGP * hostNumber * month;
        } else if ("无网络" == carrer){
            var nolineprice = 70 * hostNumber * month;
            sum = minBasePriceOfTelcom * hostNumber * month - nolineprice;
        }
    }
    return sum;
}

//无网络的情况下按年购买：每年减700,按月购买：每月减70
function no_line_calc(hostNumber,month,buyType){
       var yearPrice = -700 //年购买：每年减700
       var monthPrice = -70 //按月购买：每月减70

       if(buyType == 1 || month % 12 == 0){
            sum = yearPrice * hostNumber * (month/12);
        }else if(buyType == 2){
            sum = monthPrice * hostNumber * month;
        }
       return sum;
}

/**
 * 计算云主机费用
 *  @param hostNumber 主机个数
 *  @param month 月数
 *  @param carrer 运营商
 */
function cloudhost_priceCalc(hostNumber,month,carrer,buyType,cpuNumber,memCapcity,diskCapcity,bandWidth,ipnumber){

    var baseprice =  base_price(hostNumber,month,carrer,buyType);
    //console.log("基础价：" + baseprice);
    var cpuprice = cpu_calc(hostNumber,month,cpuNumber);
    //console.log("cpu：" + cpuprice);
    var diskprice = disk_calc_of_host(hostNumber,month,diskCapcity);
    //console.log("disk：" + diskprice);
    var bandprice = band_calc_of_host(hostNumber,month,carrer,bandWidth);
   //console.log("band：" + bandprice);
    var memprice = mem_calc_of_host(hostNumber,month,memCapcity);
    //console.log("mem：" + memprice);
    var ipprice = ip_calc(hostNumber,month,ipnumber,carrer);//暂时没用

    var sum =baseprice + cpuprice  + diskprice + bandprice + memprice;
    return sum;
}

function focusNav(){
    var currentUrl = window.location.href;
    var currentUri = currentUrl.substring(currentUrl.indexOf('#'),currentUrl.length);


    var aList = $('#sidebar a');
    for(var i = 0; i < aList.length; i++){
        /*console.log(aList[i]);
         console.log($(aList[i]).attr('href'));*/
        $(aList[i]).parent().removeClass('active');
        if($(aList[i]).attr('href') == currentUri){
            $(aList[i]).parent().addClass('active');
        }
    }
}


var alertLifeTime = 5000;

