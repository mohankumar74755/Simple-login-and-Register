<%@include file="CommonHeader.jsp"%>

<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("paper.gif");
}
</style>

<a href="Demo.jsp">Jsp page</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="Login.jsp">Login</a>
&nbsp;&nbsp;|&nbsp;&nbsp;

<h2>Application Form</h2>

<form action="My HttpServlet" method="get">
	<input type="submit" class="btn btn-lg btn-primary" value="Click here" />
</form>

<h2>Courses offered</h2>
<form action="My HttpServlet" method="get">
  <input type="submit" class="btn btn-lg btn-primary" value="Click Here"/>
</form>
<h2>Fee Details</h2>

<form action="MyHttpServlet" method="Post">
	<input type="submit" class="btn btn-lg btn-primary" value="Click Here" />
</form>




</body>
</html>
