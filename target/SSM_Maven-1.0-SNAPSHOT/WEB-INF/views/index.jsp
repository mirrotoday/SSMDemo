<%--
  Created by IntelliJ IDEA.
  User: Freestyle
  Date: 2020/7/16
  Time: 12:52
  To change this template use File | Settings | File Templates.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SMM框架整合Test</title>
</head>
<body>
${user.id}：${user.username}
</body>
</html>
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人信息</title>
</head>
<body>

<div align="center">
    <table border="1" cellspacing="1">
        <caption>个人信息</caption>
        <tbody>
        <tr>
            <td>用户编号</td>
            <td>用户名字</td>
        </tr>
        <c:forEach items="${user_list}" var="user">
            <tr>
                <td>${user.id }</td>
                <td>${user.username}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <table border="1" cellspacing="0">
        <tr align="center">
            <td>
                当前是${pageInfo.pageNum}/${pageInfo.pages}
            </td>
        <tr/>
     <table/>
                <a href="user.do?page=1">第一页</a>
                 &nbsp;&nbsp;
                <a href="user.do?page=${pageInfo.nextPage}">下一页</a>
                &nbsp;&nbsp;
                <a href="user.do?page=${pageInfo.prePage}">上一页</a>
                &nbsp;&nbsp;
                <a href="user.do?page=${pageInfo.pages}">最后页</a>

</div>
</body>l
</html>
