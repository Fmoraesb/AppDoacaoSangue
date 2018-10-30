<%@page import="negocio.Pessoa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Relatorio</title>
</head>
<body>

	<%List<Pessoa> pessoas = (List<Pessoa>)request.getAttribute("lista");
	
	if (pessoas.isEmpty()) {%>
			<h3>Não existem pessoas cadastradas!</h3>
		<%} else {
			for (Pessoa pessoa : pessoas) {%>
				<h4> <%=pessoa.toString()%></h4>
			<%}
		}
	%>
</body>
</html>