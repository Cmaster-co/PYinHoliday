<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/26 0026
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC project管理</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>SpringMVC 系统-project管理</h1>
    <hr/>

    <h3>所有project <a href="/admin/projects/add" type="button" class="btn btn-primary btn-sm">添加</a></h3>

    <!-- 如果用户列表为空 -->
    <c:if test="${empty projectList}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>Projecy表为空，请<a href="/admin/projects/add" type="button" class="btn btn-primary btn-sm">添加</a>
        </div>
    </c:if>

    <!-- 如果用户列表非空 -->
    <c:if test="${!empty projectList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>ID</th>

                <th>项目名称</th>
                <th>地点</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${projectList}" var="pro">
                <tr>
                    <td>${pro.id}</td>
                    <td>${pro.proname}</td>

                    <td>${pro.location}</td>
                    <td>
                        <a href="/admin/projects/show/${pro.id}" type="button" class="btn btn-sm btn-success">详情</a>
                        <a href="/admin/projects/update/${pro.id}" type="button" class="btn btn-sm btn-warning">修改</a>
                        <a href="/admin/projects/delete/${pro.id}" type="button" class="btn btn-sm btn-danger">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>