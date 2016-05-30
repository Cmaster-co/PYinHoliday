<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/29 0029
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name='f' action="/joinProjectP"
      method='POST'>

    <table>
        <input type="hidden" name="id" value="${project.id}"/>

        <tr>
            <td>Project Name:</td>
            <td><input type="text" name="proname" value="${project.proname}" disabled="true"/>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='passwd' />
            </td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="submit" />
            </td>
        </tr>
    </table>

</form>
</body>
</html>
