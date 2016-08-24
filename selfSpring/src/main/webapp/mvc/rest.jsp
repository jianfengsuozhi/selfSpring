<%@ page import="java.util.*" 
	pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		
		<!-- 
			 进入地址 http://localhost:8088/selfSpring/rest/ajaxChange.jsp
			 /rest/1  http://localhost:8088/rest/1 
			 rest/1   http://localhost:8088/selfSpring/rest/rest/1
			 1 		  http://localhost:8088/selfSpring/rest/1
			 最前面/ 端口之后   同级跳转
		-->
		<form action="1" method="get">
			<input type="submit" value="获取值"/>
		</form>
		<form action="1" method="post">
			<input type="submit" value="新增值"/>
		</form>
		<form action="1" method="post">
			<input name="_method" value="put" type="hidden"/>
			<input type="submit" value="修改值"/>
		</form>
		<form action="1" method="post">
			<input name="_method" value="delete" type="hidden"/>
			<input type="submit" value="删除值"/>
		</form>
	</body>
</html>