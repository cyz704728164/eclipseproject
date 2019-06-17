<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String stuno = request.getParameter("stuno");
	String stuname = request.getParameter("stuname");
	String stuage = request.getParameter("stuage");
%>
		<table>
			<tr>
				<form action="controller/updateStudent" method="post">
					<th>编号<input type="text" value=<%=stuno %> name="stuno" /></th>
					<th>姓名<input type="text" value=<%=stuname %> name="stuname" /> </th>
					<th>年龄<input type="text" value=<%=stuage %> name="stuage"/></th>
					<th><button>修改</button></th>
				</form>
			</tr>
		</table>
</body>
</html>