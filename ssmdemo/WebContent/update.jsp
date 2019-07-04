<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="../student/update.action" method="post"> 
     <input type="hidden" name="id" value="${stu.id }"/>
      <input type="text" name="name" placeholder="姓名" value="${stu.name }"/><br>
      <input type="text" name="sex" placeholder="性别" value="${stu.sex }"/><br>
      <input type="text" name="age" placeholder="年龄" value="${stu.age }"/><br>
      <input type="submit" value="ok"/><br>
   </form>
</body>
</html>