<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="wrapper" >
	<!-- header: starts -->
	<jsp:include page="../common/header.jsp" />
	<!-- header: starts -->
	 
	<h1 style="color: red">Login Denied! you are not an authenticated user!!!!! Panic</h1>
	
	<table>
	<tr>
			<td colspan="2"><a href="/ShopFever"><i>Login Again</i></a></td>
	</tr>	
 	</table>
	 
   <!-- footer : starts -->
   <jsp:include page="../common/footer.jsp" />
   <!-- footer : ends -->
</div>

</body>
</html>