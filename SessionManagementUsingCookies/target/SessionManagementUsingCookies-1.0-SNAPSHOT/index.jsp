<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>session management</title>
</head>
<body>

	<h1>Session Management Using Cookies</h1>
	<div class="container">
		<form action="<%= application.getContextPath()%>/data" method="post">
			<input type="text" name="username" required placeholder="Username" >
			<input type="text" name="inputUserId" required placeholder="UserID">
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>