<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr style="text-align: center">
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
		</tr>
		<c:forEach items="${requestScope.student }" var="s">
			<tr>
				<th>${s.stuno}</th>
				<th>${s.stuname}</th>
				<th>${s.stuage}</th>
				<th><a href="../controller/deleteStudent/${s.stuno }">删除</a></th>
				<th><a href="../update.jsp?stuno=${s.stuno}&stuname=${s.stuname}&stuage=${s.stuage}">修改</a></th>
			</tr>
		</c:forEach>
		<form action="../controller/addStudent" method="post">
			<td><input type="text" name="stuno" /></td>
			<td><input type="text" name="stuname" /></td>
			<td><input type="text" name="stuage" /></td>
			<td><button>添加</button></td>
		</form>
	</table>
		
</body>
</html>