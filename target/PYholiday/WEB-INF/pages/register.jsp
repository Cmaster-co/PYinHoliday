<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 添加用户</title>

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
    <h1>SpringMVC 添加用户</h1>
    <hr/>
    <c:if test="${not empty error}">
        <div class="errorblock">
            Login error : Please try again.<br />Root Cause:
                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>
    </c:if>
    <form:form action="/registerP" method="post" commandName="user" role="form">
        <div class="form-group">
            <label for="username">name:</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="Enter Nickname:"/>
        </div>

        <div class="form-group">
            <label for="passwd">Password:</label>
            <input type="password" class="form-control" id="passwd" name="passwd" placeholder="Enter Password:"/>
        </div>
        <div class="form-group">
            <label for="age">age:</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="Enter age:"/>
        </div>
        <div class="form-group">
            <label for="city">city:</label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Enter city:"/>
        </div>
        <div class="form-group">
            <%--@declare id="sex"--%><label for="sex">sex:</label>
            <input type="radio" name="sex" value="1" /> Male
            <input type="radio" name="sex" value="0" /> Female
        </div>
        <input type="hidden" class="form-control" id="status" name="status" value="1" />
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>