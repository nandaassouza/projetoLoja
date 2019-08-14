<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Produtos</title>
</head>
<body>
	<form method="post" action="/senai/products">
		<div>
			<label for="title">Nome: </label>
			<input type="text" name="title" id="title"/>
		</div>
		<div>
			<label for="description">Descição: </label>
			<textarea rows="4" cols="50" id="description">
			</textarea>
		</div>
		<div>
			<label for="value">Valor: </label>
			<input type="number" name="value" id="value"/>
		</div>
		<div>
			<label for="category">Categoria: </label>
			<input type="text" name="category" id="category"/>
		</div>
		<div>
			<input type="submit" value="enviar"/>
		</div>
	</form>
</body>
</html>