<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="../common/header.jsp" />
		
		
		<h2>Add New User to Shop-Fever</h2>
		
		<div align="center">
			<form:form action="admin/adminAddUser.htm" modelAttribute="customerBean" method="POST">
				
				<table>
					<tr>
						<td><form:label path="firstName">First Name:</form:label></td>		
						<td><form:input path="firstName" ></form:input></td>
					</tr>
					
					<tr>
						<td><form:label path="middleName">Middle Name:</form:label></td>		
						<td><form:input path="middleName" ></form:input></td>
					</tr>
					
					<tr>
						<td><form:label path="lastName">Last Name:</form:label></td>		
						<td><form:input path="lastName" ></form:input></td>
					</tr>
					
					<tr>
						<td><form:label path="mobileNo">Mobile No</form:label></td>		
						<td><form:input path="mobileNo" value=""></form:input></td>
					</tr>
					
					<tr>
						<td><form:label path="emailId">Email address:</form:label></td>		
						<td><form:input path="emailId" ></form:input></td>
					</tr>
					
					<tr>
						<td><label >Upload Photograph</label></td>		
						<td><input type="file" name="imageUpload" size="20"/></td>
					</tr>
				
					<tr>
								
						<td><input type="submit" value="Add User"/></td>
						<td><input type="reset" value="Clear Data"/></td>
					</tr>
				
				</table>
				
				
			
			</form:form>
		
		</div>
		
		<jsp:include page="../common/footer.jsp" />
	</div>

</body>
</html>