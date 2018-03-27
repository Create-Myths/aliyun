<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>

<!DOCTYPE html>
<!--载入和指令相关的模块-->
<html ng-app="suncloud.app">
<head>
    <meta charset="utf-8">
    <title>宝光云 - BaoCloud Version1.0</title>
    <!-[if lt IE9]>
    <script src="lib/plugins/html5.js"></script>
    <script>
        document.createElement('alert');
    </script>
    <![endif]->

    <script src="lib/jquery/jquery.min.js"></script>
    <script type="text/javascript">

        var gamecloud_username;
        isLogged(false);
        setInterval("isLogged(true)", 600000);
        function isLogged(async){
            var options = {
                type: 'GET',
                url: 'api/index.php?r=user/getislogin',
                dataType: 'json',
                success: function(data){
                    if (data['result'] == 'true') {
                        gamecloud_username = data['param']['username'];
                        
                    } else {
                        console.log(location);
                        location.pathname = './user/login.html'; // + location.hash;
                    }
                }
            };
            options.async = async;
            $.ajax(options);
        }
    </script>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/suncloud.css" rel="stylesheet">
    <link href="css/ng-grid.min.css" rel="stylesheet">
    <link href="css/jquery-ui-slider.min.css" rel="stylesheet">
</head>
<body>

<!-- header -->
<div class="navbar navbar-fixed-top cloud-nav">
    <!--<div class="navbar-inner">-->
        <div class="container-fluid">
        <div class="row-fluid cloud-header">
            <div class="span2 text-center cloud-logo">
                <a href="#">宝光云Version1.0</a>
            </div>

            <div class="span10 nav-collapse collapse">
                <div class="navbar-text pull-right cloud-login">
                    <span>欢迎, </span>
                        <span class="dropdown">
                            <a href="#/personal" class="username" >
                                <span id="username"></span>
                            </a>
                            &nbsp;|&nbsp;
                            <a href="http://g.suncloud.cn/" target="_blank" class="username" >
                                <span>游戏云首页</span>
                            </a>
                            <!--<a href="#" class="dropdown-toggle username" data-toggle="dropdown">
                                <span id="username"></span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">item1</a></li>
                                <li><a href="#">item2</a></li>
                                <li><a href="#">item3</a></li>
                                <li class="divider"></li>
                                <li><a href="#">item4</a></li>
                                <li class="divider"></li>
                                <li><a href="#">item5</a></li>
                            </ul>-->
                        </span>
                        &nbsp;|&nbsp;<a role="button" class="cloud-logout" href="loginout.json" >退出</a>
                </div>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
    <!--</div>-->
</div>

<!-- content -->
<div class="container-fluid"  >
    <div class="row-fluid">
        <!-- left side -->
        <div class="span2">
            <div class="well cloud-sidebar-nav">
                <ul id="sidebar" class="nav nav-list cloud-nav-list">
                    <li class="nav-header" href="#/home">控制台首页</li>
                    <li><a href="#/host"><i></i>云主机</a></li>
                    <li><a href="#/disk"><i></i>云硬盘</a></li>
                    <li><a href="#/load"><i></i>负载均衡</a></li>
                    <li><a href="#/db"><i></i>云数据库</a></li>
                    <li><a href="#/memory"><i></i>云内存存储</a></li>
                    <shiro:hasRole name="admin">
                    <li><a href="#/cdn"><i></i>云工单</a></li>
                    </shiro:hasRole>
                    <!--<li><a href="#/monitor"><i></i>监控宝</a></li>-->
                    <li><a href="#/dns_domain"><i></i>DNS</a></li>
                    <li><a href="#/protection"><i></i>云防护</a></li>
                    <li class="nav-header" href="#/personal">个人中心</li>
            </ul>
                <div style="height: 90px;"></div>
                <div class="cloud-help"><i class="icon-question"></i> 帮助中心</div>
                <hr>
                <form name="searchform" target="_blank" action="http://docs.g.suncloud.cn/search.html" method="get">
                    <div class="input-append cloud-search">
                        <input type="text" name="q" placeholder="输入您的问题">
                        <a href="javascript:void(0)" onclick="searchFormFun()"></a>
                    </div>
                </form>
                <hr>
                <div class="cloud-help"><i class="icon-sell"></i> 售后服务</div>

                <div class="cloud-help-text">
                    <small>周一至周五（9:00-18:00）</small>
                </div>
                <hr>
                <div class="cloud-help"><i class="icon-tel"></i> <small>18616882123</small></div>
                <div class="cloud-help"><i class="icon-email"></i> <small>iaas_pcc@yovole.com</small></div>
            </div>
            <!--/.well -->
        </div>
        <!--/span-->

        <!-- right side -->
        <div class="span10 right-page">
            <div style="position: absolute; right: 30px;z-index:100;">
                <alert ng-repeat="alert in alerts" type="alert.type">
                    <span ng-bind="alert.msg"></span>
                </alert>
            </div>
            <div ng-view></div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function(){
        $("#username").html(gamecloud_username);
    });
</script>

<!-- 脚本库 -->
<script src="lib/angular/angular.min.js"></script>
<script src="lib/angular/angular-route.min.js"></script>
<script src="lib/angular/angular-resource.min.js"></script>
<!--<script src="lib/bootstrap/bootstrap.min.js"></script>--><!--使用AngularJS的bootstrap ui,不依赖于jQuery-->
<script src="lib/plugins/ui-bootstrap-tpls-0.7.0.min.js"></script>
<script src="lib/plugins/ng-grid.min.js"></script>
<script src="lib/plugins/jquery-ui-slider.min.js"></script>
<script src="lib/plugins/slider.js"></script><!--自定义插件，包装了jquery-ui-slider，使之适应AngularJS-->

<!--自定义脚本-->
<script src="script/common.js"></script>
<script src="script/app.js"></script>
<script src="script/filters.js"></script>
<script src="script/directives.js"></script>

<!--所有资源-->
<script src="script/services/host_service.js"></script>
<script src="script/services/disk_service.js"></script>
<script src="script/services/db_service.js"></script>
<script src="script/services/load_service.js"></script>
<script src="script/services/mem_service.js"></script>
<script src="script/services/firewall_service.js"></script>
<script src="script/services/user_service.js"></script>
<script src="script/services/dns_parse_service.js"></script>
<script src="script/services/dns_domain_service.js"></script>
<script src="script/services/error_service.js"></script>
<script src="script/services/cdn_service.js"></script>
<!--所有控制器-->
<script src="script/controllers.js"></script>
<script src="script/controllers/personal_controller.js"></script>
<script src="script/controllers/msg_controller.js"></script>
<!--主页控制器-->
<script src="script/controllers/home/home.js"></script>
<script src="script/controllers/home/support.js"></script>
<!--云主机控制器-->
<script src="script/controllers/host/list.js"></script>
<script src="script/controllers/host/create.js"></script>
<script src="script/controllers/host/start.js"></script>
<script src="script/controllers/host/shutdown.js"></script>
<script src="script/controllers/host/poweroff.js"></script>
<script src="script/controllers/host/reboot.js"></script>
<script src="script/controllers/host/login.js"></script>
<!--云硬盘控制器-->
<script src="script/controllers/disk/list.js"></script>
<script src="script/controllers/disk/create.js"></script>
<script src="script/controllers/disk/delete.js"></script>
<script src="script/controllers/disk/clone.js"></script>
<script src="script/controllers/disk/unmount.js"></script>
<script src="script/controllers/disk/mount.js"></script>
<script src="script/controllers/disk/resize.js"></script>
<!--云防护-->
<script src="script/controllers/protection/list.js"></script>
<script src="script/controllers/protection/create.js"></script>
<script src="script/controllers/protection/edit.js"></script>
<script src="script/controllers/protection/delete.js"></script>
<!--云防护规则-->
<script src="script/controllers/protection_rule/list.js"></script>
<script src="script/controllers/protection_rule/create.js"></script>
<script src="script/controllers/protection_rule/edit.js"></script>
<script src="script/controllers/protection_rule/delete.js"></script>
<!--云内存控制器-->
<script src="script/controllers/memory/list.js"></script>
<script src="script/controllers/memory/create.js"></script>
<script src="script/controllers/memory/delete.js"></script>
<script src="script/controllers/memory/extends.js"></script>
<!--云数据库控制器-->
<script src="script/controllers/db/list.js"></script>
<script src="script/controllers/db/delete.js"></script>
<script src="script/controllers/db/create.js"></script>
<script src="script/controllers/db/start.js"></script>
<script src="script/controllers/db/close.js"></script>
<script src="script/controllers/db/login.js"></script>
<!--DNS域名控制器-->
<!--<script src="script/controllers/dns_controller.js"></script>-->
<script src="script/controllers/dns_domain/list.js"></script>
<script src="script/controllers/dns_domain/delete.js"></script>
<script src="script/controllers/dns_domain/pause.js"></script>
<script src="script/controllers/dns_domain/reboot.js"></script>
<script src="script/controllers/dns_domain/add.js"></script>
<!--DNS解析控制器-->
<script src="script/controllers/dns_parse/list.js"></script>
<script src="script/controllers/dns_parse/delete.js"></script>
<script src="script/controllers/dns_parse/pause.js"></script>
<script src="script/controllers/dns_parse/reboot.js"></script>
<script src="script/controllers/dns_parse/add.js"></script>
<!--负载均衡-->
<script src="script/controllers/load/list.js"></script>
<script src="script/controllers/load/create.js"></script>
<script src="script/controllers/load/delete.js"></script>
<!--负载均衡规则-->
<script src="script/controllers/load_rule/list.js"></script>
<script src="script/controllers/load_rule/create.js"></script>
<script src="script/controllers/load_rule/edit.js"></script>
<script src="script/controllers/load_rule/delete.js"></script>
</body>
</html>