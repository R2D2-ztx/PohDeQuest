<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>This is JavaBank</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="<c:url  value="/resources/style.css"/>">
</head>

<body >
<h2>Welcome Bruno Ferreira</h2>



    <div class="box ">
        <form action="http://localhost:8080/javabank/form" method="POST" >
            <label> Put your data Sacana :</label><br>
            <input name="firstName" type="text" value="PrimeiroNomezyn" id="firstname" required minlength="4" maxlength="12"><br>
            <input name="lastName" type="text" value="ultimoNomizyn" required minlength="4" maxlength="12"><br>
            <input name="email" type="text" value="mail" min="9" max="9"><br>
            <input name="phone" type="text" value="Contatinho"><br>
            <input type="submit" value="       submit       "><br>
        </form>
    </div>
</body>
</html>

