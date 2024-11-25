<%--
  Created by IntelliJ IDEA.
  User: raysi2002
  Date: 20/09/24
  Time: 6:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>signup</title>
	<link rel="stylesheet" href="<%=application.getContextPath()%>/css/signup.css">

</head>
<body>
    <form action="<%= application.getContextPath()%>/signup" method="post">
	    <div class="container">
		    <h1 style="text-align: center">Signup Here</h1>
		    <input type="text" name="firstName" id="firstName" placeholder="First Name" required>
		    <input type="text" name="middleName" id="middleName" placeholder="Middle Name">
		    <input type="text" name="lastName" id="lastName" placeholder="Last Name" required>
		    <input type="email" name="email" id="email" placeholder="Email" required>
		    <input type="text" name="phone" id="phone" placeholder="Phone" required>
		    <input type="password" name="password" id="password" placeholder="Password" required>
		    <input type="password" name="confirmPassword" id="confirmPassword" placeholder="Confirm Password" required>

		    <div class="agreement-container">
			    <input type="checkbox" id="agreement">
			    <label style="margin-left: 10px" for="agreement">Click to accept privacy and agreement</label>
		    </div>
		    <button type="submit">Signup</button>
		    <p style="font-size: large">or</p>
		    <p>Already have account ? <a style="margin-top: 5px" href="<%= application.getContextPath()%>/index.jsp">Click here to login</a></p>
	    </div>
    </form>
</body>
</html>
