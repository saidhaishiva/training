<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JAX-RS Form Parameter Example</title>
</head>
<body>
 <h1>JAX-RS Form Parameter Example</h1>
 <form action="restapi/student/add" method="post">		
	Name : <input type="text" name="name" />
	<br/><br/>
	Roll No : <input type="text" name="rollNo" />
	<br/><br/>
	
		<br/><br/>
	Mobile No : <input type="text" name="mobile" />
	<br/><br/>
	
	<input type="submit" value="Add Student" />
 </form>
</body>
</html>