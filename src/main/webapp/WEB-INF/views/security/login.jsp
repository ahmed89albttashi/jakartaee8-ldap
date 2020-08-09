<%-- 
    Document   : login
    Created on : Aug 3, 2020, 9:03:39 PM
    Author     : ahmed.battashi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>login!</h1>
        <form method="POST" action="/mavenproject3/j_security_check">
        <input name="j_username" placeholder="j_username"/>
        <input name="j_password" placeholder="j_password" type="password"/>
        <hr/>
        <input type="submit" value="login"/>
        </form>
    </body>
</html>
