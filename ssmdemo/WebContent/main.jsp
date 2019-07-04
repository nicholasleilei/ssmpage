<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
主页<br><a href="../insert.jsp">增加</a><br>
<form action="../student/findByName.action" method="post">
    <input type="text" name="name"/><input type="submit" value="查询"/>
</form>
<c:forEach items="${stus}" var="s">
  ${s.id }&nbsp;&nbsp; ${s.name }  &nbsp;&nbsp;${s.age }&nbsp;&nbsp;${s.sex }&nbsp;&nbsp;
  <a href="../student/yupdate.action?id=${s.id }">修改</a>&nbsp;&nbsp;
  <a href="../student/delete.action?id=${s.id }">删除</a><br>
</c:forEach>
</body>
</html>