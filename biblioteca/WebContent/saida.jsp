<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String mensagem = (String) session.getAttribute("attrMensagem");
	%>

	<h1>P�gina de Login</h1>
	<p><%= mensagem %></p>
	
	<% if (mensagem.equals("Usu�rio logado com sucesso")) { %>
	
		<p>Menu do sistema</p>

	<% } %>



</body>
</html>










