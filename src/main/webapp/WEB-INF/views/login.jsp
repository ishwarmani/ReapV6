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
	href="<c:url value ="/resources/images/login_logo.ico"/>">
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
	
	<div class="login-container">
	<div class="btn"style="align:center"><c:if test="${msg!=null}">${msg}</c:if></div>
	<div></div>
		<form method="POST" action="login">
			<div class="panel shadow">
				<div class="panel-header">
					<img class="panelLogo"
						src="<c:url value ="/resources/images/combineLogo.png"/>">

				</div>
				<div class="panel-body">
						
						<div class="form-group">
							<label for="exampleInputName2">E-Mail</label> <input
								name="email" type="text" class="form-control inputField"
								id="exampleInputName2" placeholder="Username">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">Password</label> <input
							name="password"	type="password" class="form-control inputField pull-right"
								id="exampleInputEmail2" placeholder="Password">
						</div>
						</br>
						</br>
						<div class="form-group">
						<input type="submit" value="Login" class="btn btn-primary pull-left"></input>
						<!-- <input type="" value="Login" class="btn btn-primary pull-right"></input> -->
						<a class="pull-right" href="register">Not a Member !</a>					
						
						</div>
					
				</div>
			</div>
		</form>
	</div>
</body>
</html>