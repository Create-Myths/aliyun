<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table width="600" border="1" align="center" cellpadding="1" cellspacing="0">
    <tr>
        <td>流程ID</td>
        <td>流程名称</td>
        <td>申请时间</td>
        <td>审批</td>
    </tr>
    <c:forEach items="${taskList}" var="dto">
    <tr>
        <td>&nbsp;${dto.taskId}</td>
        <td>&nbsp;${dto.taskName}</td>
        <td>&nbsp;${dto.ctime}</td>
        <td><a href="/activiti/completeTask.json?taskId=${dto.taskId}">审批</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
