<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freemarker</title>
</head>
<body>
	<h1>shop</h1>
	<table border="1">
		<#if instances??> 
		<#list instances as instance>
		<tr>
			<td>${instance.id}</td>
			<td>${instance.commodityName}</td>
			<td>${instance.shopName}</td>
			<td>${instance.type}</td>
			<td>${instance.price}</td>
			<td><a href="/order/productor/delete?id=${instance.id}">完成</a></td>
		</tr>
		</#list> </#if>
	</table>
</body>
</html>