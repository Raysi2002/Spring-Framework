<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Login Page</title>
    <link rel="stylesheet" href="<%= application.getContextPath()%>/css/style.css">
    <script src="<%= application.getContextPath()%>/js/script.js" defer></script>
</head>
<body>
    <form action="<%= application.getContextPath()%>/login" method="post">
        <div class="container">
            <h1>Login Here</h1>
            <input name="email" placeholder="Email or Username" type="email" required>
            <input name="password" placeholder="Password" type="password" required>
            <div class="xyz">
                <input id="remember" type="checkbox">
                <label for="remember">Remember me</label>

                <a id="forgot-password" class="forgot-password-label"  href="<%=application.getContextPath()%>/resetPassword.jsp">Forgot Password?</a>
            </div>
            <button class="btn"  type="submit" >Login</button>
            <div class="register">
                <p>Don't have account? <a href="<%= application.getContextPath()%>/signup.jsp">Register</a> </p>

            </div>
    </form>
    </div>
</body>
</html>