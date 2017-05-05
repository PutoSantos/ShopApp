<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList, model.Produto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShopApp</title>
</head>
<body>
	<form action="HProduto" method="post">
	<h2>Adicionar Produto</h2>
		<table>
			<tr><label><h4>Nome</h4></label></tr>
				<input type="text" name="nome" placeholder="paneleirices">
				
			<tr><label><h4>Preço</h4></label></tr>
				<input type="text" name="preco" placeholder="paneleirices">
				
			<tr><label><h4>Quantidade</h4></label></tr>
				<input type="number" name="quantidade" placeholder="paneleirices">
		</table>
		
		<input type="submit" value="Enviar" name="submeter">
	</form>
	
	<h2>Lista de Produtos</h2>
	<table>
		<tr>
			<th>Nome de Produto</th>
			<th>Quantidade</th>
			<th>Pre&ccedil;o</th>
		</tr>
		
		<%
			//Buscar a ArrayList
			ArrayList<Produto> yah = (ArrayList) request.getAttribute("listaProduto");
		
		
			//Ciclo for que mostra cada produto
			for(Produto p : yah)
			{
				out.append("<tr><td>"+ p.getNome() +
							"</td><td>" + p.getQuantidade() + "</td><td>" +
						p.getPreco() + 
						"</td></tr>");
			}
			
		
		
		
		
		%>
	</table>
</body>
</html>