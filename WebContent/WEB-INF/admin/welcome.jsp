<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css" />
<script	src="<%=request.getContextPath()%>/resources/js/jquery-2.1.0.js"></script>

</head>
<body>

<div id="wrapper" >
	 
	<jsp:include page="../common/header.jsp" />
	 
  

<h1>Hello ${customerDetail.firstName}  
			${customerDetail.middleName}  
			${customerDetail.lastName}!!!!!!</h1>

	<div>
		<ul>
		<li> <a href="admin/adminLoadAddUser.htm">Add new user</a> </li>
		<li> <a href="admin/updateExistingUser.htm">Update existing user</a> </li>
		<li> <a href="#">Add new items</a> </li>
		<li> <a href="#">Update existing items</a> </li>
		</ul>
		
	</div>

  
   <jsp:include page="../common/footer.jsp" />
   
</div>
</body>
</html>