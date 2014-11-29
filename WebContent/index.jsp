<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In to Shop-Fever</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css" />
<script	src="<%=request.getContextPath()%>/resources/js/jquery-2.1.0.js"></script>

<script type="text/javascript">

$(function() {
	$("#j_username").focus();
});

function validateLogin()
{
	var valid = false;
	if ($("#j_username").val() == "" && $("#j_password").val() == "")
	{
		$("#login-error").html("Please enter User Name and Password.");
		$("#j_username").focus();
	}
	else if ($("#j_username").val() == "")
	{
		$("#login-error").html("Please enter User Name.");
		$("#j_username").focus();
	}
	else if ($("#j_password").val() == "")
	{
		$("#login-error").html("Please enter Password.");
		$("#j_password").focus();
	}
	else
	{
		valid = true;
	}
	return valid;
}
	
</script>

</head>
<body>
	
	<div id="wrapper" >
	
	
	<!-- header: starts -->
	<jsp:include page="WEB-INF/common/header.jsp" />
	<!-- header: starts -->
	
 
	
	<form action="login.htm" onsubmit="return validateLogin()" id="form" method="post" >
	<fieldset>
		<legend>Shop-fever Login</legend>
	
	 
		<table>
						<tr>
							<td><label for="j_username">User Name</label></td>
							<td><input id="j_username" name="j_username" type="text" value="ankit"/></td>
						</tr>
						<tr>
							<td><label for="j_password">Password</label></td>
							<td><input id="j_password" name="j_password" type="password" value=""/></td>
						</tr>
						<tr>
							<td colspan="2"><br/><input type="submit" value="Log In"/></td>
						</tr>
						<tr>
							<td colspan="2"><a href="#"  ><i>Forgot Password ?</i></a></td>
						</tr>	
						<tr>
							<td colspan="2"><a href="customer/createNewAccountLoad.htm"><i>Create New Account</i></a></td>
						</tr>	
				
						<tr>
							<td colspan="2">
								<span id= "login-error" style="color: red"></span>
							 </td>
						</tr>
					
		</table>
	
	</fieldset>
	</form>
	 
   
   <!-- footer : starts -->
   <jsp:include page="WEB-INF/common/footer.jsp" />
   <!-- footer : ends -->
</div>
</body>
</html>