<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<title>Registration</title>
<link rel="shortcut icon"
	href="<c:url value ="/resources/images/register_logo.png"/>">
<link rel="stylesheet"
	href="<c:url value ="/resources/css/bootstrap-3.3.6-dist/css/bootstrap.min.css" />">
<script src="<c:url value ="/resources/css/jquery-2.2.0.min.js" />"></script>
<script
	src="<c:url value ="/resources/css/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>

<link rel="stylesheet"
	href="<c:url value ="/resources/css/font-awesome-4.6.3/css/font-awesome.min.css" />">
<link rel="stylesheet"
	href="<c:url value ="/resources/css/styleRegister.css" />">
</head>
<body>

	<form:form action="register" method="POST">
		<div class="login-container">
			<div class="panel shadow">
				<div class="row">
					<div class="col-sm-12">
						<div class="panel-header">
							<img class="panelLogo"
								src="<c:url value ="/resources/images/combineLogo.png"/>">
						</div>
					</div>
				</div>

				<div class="panel-body">

					<div class="col-sm-5">
						<div class="form-group">
							<label class="classWithPad" for="exampleInputName2">Name</label>
							<br /> <label class="classWithPad" for="exampleInputEmail2">E-Mail</label><br />
							<label class="classWithPad" for="exampleInputEmail2">Password</label><br />
							<!-- <label class="classWithPad" for="exampleInputEmail2">Password</label><br/> -->
							<label class="classWithPad" for="exampleInputEmail2">Confirm
								Password</label> <label class="classWithPad" for="exampleInputEmail2">Service
								line</label><br /> <label class="classWithPad" for="exampleInputEmail2">Practices</label><br />
						</div>
					</div>
					<div class="col-sm-7">
						<div class="form-group">


							<form:input path="employeeName" type="text" class="form-control classWithPad"
								id="exampleInputName2" placeholder="Username" />
							<form:input path="email" type="email" class="form-control classWithPad"
								id="exampleInputEmail2" placeholder="E-mail ID" />
							<form:input path="password" type="password" class="form-control classWithPad"
								id="exampleInputPass3" placeholder="Password" />
							<input  type="password" class="form-control classWithPad"
								id="exampleInputConfPass4" placeholder="Confirm Password" />


							<form:select path="serviceLine" defaultLabel="Service Lines"
								id="serviceLine" class="classWithPad1">
								<option value="Service Lines">Service Lines</option>
								<option value="Analytics">Analytics</option>
								<option value="Analytics-SEA">Analytics-SEA</option>
								<option value="Digital Marketing">Digital Marketing</option>
								<option value="Digital Marketing India">Digital Marketing India</option>
								<option value="Digital Marketing-SEA">Digital Marketing-SEA</option>
								<option value="Technology">Technology</option>
								<option value="ThoughtBuzz India">ThoughtBuzz India</option>
								<option value="TTN Overheads">TTN Overheads</option>
								<option value="TTND-Intern">TTND-Intern</option>
								<option value="TTND-SEA">TTND-SEA</option>
								<option value="TTNV">TTNV</option>
								<option value="Video Solutions">Video Solutions</option>
							</form:select>

							<form:select path="practice" defaultLabel="Practices"
								class="classWithPad1">
								<option value="Practices">Practices</option>
								<option value="Admin">Admin</option>
								<option value="AMC">AMC</option>
								<option value="Analytics">Analytics</option>
								<option value="Analytics-SEA">Analytics-SEA</option>
								<option value="BigData">BigData</option>
								<option value="BlogMint">BlogMint</option>
								<option value="Business Development">Business Development</option>
								<option value="Creative">Creative</option>
								<option value="Design">Design</option>
								<option value="DevOps">DevOps</option>

							</form:select>

						</div>
					</div>

					<div class="row">
						<div class="col-sm-11">
							<button type="Submit" class="btn btn-primary pull-right submit">Submit</button>
							<button type="button"
								class="btn btn-primary pull-left socialLogin">Sign-In
								With Google</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>


</body>
</html>