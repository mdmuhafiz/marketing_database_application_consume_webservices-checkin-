<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Lead</title>
</head>
<body>
<h3>Show Lead | Lead</h3>
<hr>
<pre>
${error}
<br/>
Id:${lead.id}<br/>
First Name:${lead.firstName}<br/>
Last Name:${lead.lastName}<br/>
Email:${lead.email}<br/>
City:${lead.city}<br/>
Mobile:${lead.mobile}<br/>

</pre>
</body>
</html>