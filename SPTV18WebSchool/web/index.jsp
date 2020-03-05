<%-- 
    Document   : newjsp
    Created on : Feb 7, 2020, 8:46:49 AM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Сетевая школа группы SPTV18</title>
    </head>
    <body>
        <h1>Сетевая школа</h1>
        <p id="info">${info}</p>
        <p>
            <a href="showLogin">Вход</a><br>
            <a href="showNewReader">Зарегистрировать класс</a><br>
            <a href="listBooks">Добавить ученика</a><br>
            <a href="listReaders">Добавить учителя</a><br>
            <a href="showTakeBook">Список классов</a><br>
            <a href="showReturnBook">Список учеников</a><br>
            <a href="showNewBook">Список учителей</a><br>
        </p>
        
    </body>
</html>
