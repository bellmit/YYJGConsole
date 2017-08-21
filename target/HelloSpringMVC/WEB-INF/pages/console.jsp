<%--
  Created by IntelliJ IDEA.
  User: Tom-G
  Date: 2017/8/19
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!--device-width自适应移动端宽度，initial-scale=1不进行缩放-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YYJGConsole</title>

    <link href="res/css/bootstrap.min.css" rel="stylesheet">
    <link href="res/css/body.css" rel="stylesheet" />
    <link href="res/css/home.css" rel="stylesheet" />
    <!-- jQuery CDN加速 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!---bootstrap的核心JS文件必须放在jQuery文件之后，因为bootstrap基于jQuery -->
    <script src="res/js/bootstrap.min.js"></script>
</head>
<body class="home-body">
<nav class="navbar navbar-default" role="navigation" >
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SPIC</a>
        </div>
        <div>
            <p class="navbar-text">首页</p>
        </div>
        <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
        </form>
    </div>
</nav>
<div class="pull-left" style="width: 200px;">
    <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span>&emsp;首页 </a></li>
        <li><a href="#"><span class="glyphicon glyphicon-comment"></span>&emsp;通知</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span>&emsp;用户</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-signal"></span>&emsp;采集状态</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-road"></span>&emsp;组态管理</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-cog"></span>&emsp;平台配置</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-file"></span>&emsp;帮助文档</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-wrench"></span>&emsp;管理工具</a></li>
    </ul>
</div>
<!--<div class="pull-right" style="width: calc(100% - 250px);padding-right: 100px;">
    <div class="panel panel-default">
        <div class="panel-heading">运行状态</div>
    </div>
</div>-->
<div id="paper" class="listPaper pull-right">
    <div class = listPaper_content>
        <iframe src="mod/mod_home.html" id="iframe_content" class="iframe_content_class" >
        </iframe>
    </div>
</div>

</body>
</html>
