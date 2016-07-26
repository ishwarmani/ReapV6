
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
        <head>
<title>Login</title>
<link rel="shortcut icon"
	href="<c:url value ="/resources/images/icon_browser.ico"/>">
<link rel="stylesheet"
	href="<c:url value ="/resources/css/bootstrap-3.3.6-dist/css/bootstrap.min.css" />">
<script src="<c:url value ="/resources/css/jquery-2.2.0.min.js" />"></script>
<script
	src="<c:url value ="/resources/css/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>

<link rel="stylesheet"
	href="<c:url value ="/resources/css/font-awesome-4.6.3/css/font-awesome.min.css" />">
<link rel="stylesheet"
	href="<c:url value ="/resources/css/styleLogin.css" />">
</head>
    <body>
    	<div class="row">
      <div class="row">
        <div class="col-xs-12">
    <div class="login-container center">
    <div class="btn"style="align:center"><c:if test="${msg!=null}">${msg}</c:if></div>
     <form method="POST" action="login">
       <div class="panel shadow panelStyle">
            <div class="panel-header">
                    <img class="panelLogo"
						src="<c:url value ="/resources/images/combineLogo.png"/>">
            </div>
          <div class="panel-body ">
            <div class="row">
              <div class="col-xs-12">
            <div class="form-group">
                  <label>E-mail</label>
                  <input name="email" class="form-control" id="emailInput" placeholder="E-mail ID">
            </div>
          </div>
          <div class="col-xs-12">
            <div class="form-group">
                  <label>Password</label>
                  <input type="password" name="password" class="form-control pull-right" id="passwordInput" placeholder="Password">
            </div>
          </div>
          <div class="row login">
            <button type="submit" class="btn btn-primary pull-left">Login</button>
            <br/>
            <a class="pull-right notamember btn btn-primary" href="register">Not a member</a>
          </div>
          </div>
        </div>
      </form>
      </div>
    </div>
    </div>
    </body>
</html>
