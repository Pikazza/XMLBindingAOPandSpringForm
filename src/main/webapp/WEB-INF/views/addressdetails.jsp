<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isELIgnored="false"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="register1" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>Postcode:</td>
                    <td><form:input path="addressHistory.address[0].postcode" /></td>
                </tr>
                <tr>
                    <td>Address1:</td>
                    <td><form:input path="addressHistory.address[0].address1" /></td>
                </tr>
                <tr>
                    <td>Address2:</td>
                    <td><form:input path="addressHistory.address[0].address2" /></td>
                </tr>
                <tr>
                    <td>Year</td>
                    <td><form:input path="addressHistory.address[0].year" /></td>
                </tr>
                <tr>
                    <td>Month</td>
                    <td><form:input path="addressHistory.address[0].month" /></td>
                </tr>
                <tr>
                
                </tr>
                <tr>
                    <td>Postcode:</td>
                    <td><form:input path="addressHistory.address[1].postcode" /></td>
                </tr>
                <tr>
                    <td>Address1:</td>
                    <td><form:input path="addressHistory.address[1].address1" /></td>
                </tr>
                <tr>
                    <td>Address2:</td>
                    <td><form:input path="addressHistory.address[1].address2" /></td>
                </tr>
                <tr>
                    <td>Year</td>
                    <td><form:input path="addressHistory.address[1].year" /></td>
                </tr>
                <tr>
                    <td>Month</td>
                    <td><form:input path="addressHistory.address[1].month" /></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
            
             <a href="hello">Click Here to back</a>
        </form:form>
    </div>
</body>
</html>