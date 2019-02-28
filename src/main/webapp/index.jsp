<%@page import="java.util.Date"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Hello Mate</title>
</head>
<body>

<%
	Date d = new Date();
	System.out.println("Current Date="+d);
%>


    <form action = "BSLogicService" method = "POST">
       First Name: <input type = "text" name = "first_name">
       <br/>
       Last Name: <input type = "text" name = "last_name" />
       <br/>
       Gender: 
        <select name="gender">
  			<option value="Male">Male</option>
  			<option value="Female">Female</option>
		</select>
       
       <input type = "submit" value = "Submit" />
    </form>


</body>
</html>