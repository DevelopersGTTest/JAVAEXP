<%-- 
    Document   : index
    Created on : 28-sep-2019, 23:21:49
    Author     : Hackobo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple OAuth </h1>
        <form method="POST" action="AuthController.do">
            <input name="username" type="text" placeholder="Write a username" >
            <br>
            <input name="password" type="password" placeholder="Write a password">
            <br>
            <input type="submit" value="Access" >
        </form>
    </body>
</html>
