<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freemarker</title>
</head>
<body>
	<h1>shop</h1>
	<#if orders??> <#list orders as order>
	<table border="1">
		<tr>
			<td>${order.id}</td>
			<td>${order.price}</td>
		</tr>
	</table>
	<table border="1">
		<#if order.instances??> 
		<#list order.instances as instance>
		<tr>
			<td>${instance.id}</td>
			<td>${instance.commodityName}</td>
			<td>${instance.shopName}</td>
			<td>${instance.type}</td>
			<td>${instance.price}</td>
		</tr>
		</#list> </#if>
	</table>
	</#list> </#if>
</body>
</html>