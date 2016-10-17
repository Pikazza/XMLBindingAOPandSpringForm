<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td>${userForm.username}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${userForm.email}</td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td>${userForm.birthDate}</td>
            </tr>
            <tr>
                <td>Profession:</td>
                <td>${userForm.profession}</td>
            </tr>
            
            
            
             <tr>
                <td>Post code:</td>
                <td>${userForm.addressHistory.address[0].postcode}</td>
            </tr>
            <tr>
                <td>Address1</td>
                <td>${userForm.addressHistory.address[0].address1}</td>
            </tr>
            <tr>
                <td>Address2</td>
                <td>${userForm.addressHistory.address[0].address2}</td>
            </tr>
            <tr>
                <td>Year:</td>
                <td>${userForm.addressHistory.address[0].year}</td>
            </tr>
                        <tr>
                <td>Month:</td>
                <td>${userForm.addressHistory.address[0].month}</td>
            </tr>
            
                       
             <tr>
                <td>Post code:</td>
                <td>${userForm.addressHistory.address[1].postcode}</td>
            </tr>
            <tr>
                <td>Address1</td>
                <td>${userForm.addressHistory.address[1].address1}</td>
            </tr>
            <tr>
                <td>Address2</td>
                <td>${userForm.addressHistory.address[1].address2}</td>
            </tr>
            <tr>
                <td>Year:</td>
                <td>${userForm.addressHistory.address[1].year}</td>
            </tr>
                        <tr>
                <td>Month:</td>
                <td>${userForm.addressHistory.address[1].month}</td>
            </tr>
            
            
 
        </table>
    </div>
    
    <a href="register">Click Here to back</a>
</body>
</html>