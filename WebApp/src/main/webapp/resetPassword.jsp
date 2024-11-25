<%--
  Created by IntelliJ IDEA.
  User: raysi2002
  Date: 21/09/24
  Time: 12:18 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Password Resetting</title>
	<link rel="stylesheet" href="<%= application.getContextPath()%>/css/resetPassword.css">
	<script src="<%= application.getContextPath()%>/js/resetPassword.js" defer></script>
</head>
<body>
	<form action="<%=application.getContextPath()%>/resetPassword" method="post">
		<h1 style="text-align: center; margin-top: 26vh; color: white">Resetting Password</h1>
		<div class="container">

			<input required type="email" name="email" id="email" placeholder="Enter your email">
<%--			<div class="otp">--%>
<%--				<input type="number" name="otp" id="otp" placeholder="Enter OTP">--%>
<%--				<button type="submit" id="otp" >Generate OTP</button>--%>
<%--			</div>--%>
			<input required type="password" name="password" id="password" placeholder="New Password">
			<input required type="password" name="confirmPassword" id="confirmPassword" placeholder="Confirm Password">
			<button id="reset" type="submit">Reset</button>
			<p>Don't want to change password ? <a href="<%= application.getContextPath()%>/index.jsp">Login Here</a></p>
		</div>
	</form>
</body>
</html>
