<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
          <title>Login</title>
          
          <link rel="stylesheet" href="<c:url value ="/resources/css/style.css" />">
          
          <link rel="stylesheet" href="<c:url value ="/resources/css/bootstrap-3.3.6-dist/css/bootstrap.min.css" />">
   		 <link rel="stylesheet" href="<c:url value ="/resources/css/jquery-2.2.0.min.js" />">
          <link rel="shortcut icon" href="<c:url value ="/resources/images/login_logo.ico"/>">
          
          <script src="<c:url value ="/resources/css/bootstrap-3.3.6-dist/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>
          <link rel="stylesheet" href="<c:url value ="/resources/css/font-awesome-4.6.3/css/font-awesome.min.css" />">
          <style>
          .login-container {
              margin: auto;
              margin-top: 150px;
              margin-left: 450px;
              width: 520px; /* Whatever exact width you are looking for (not bound by preset bootstrap widths) */
            }


            input {
                float:right;
                border:2px solid #dadada;
                border-radius:7px;
                font-size:20px;
                padding:5px;
                margin-top:-10px;
            }

            input:focus {
                outline:none;
                border-color:#9ecaed;
                box-shadow:0 0 10px #9ecaed;
            }
            .shadow {
                box-shadow:         3px 3px 5px 6px #ccc;
            }
          </style>
    </head>
    <body>
    <div class="login-container">
     <form method="POST" action="login">
       <div class="panel shadow">
            <div class="panel-header">
                   <!--  <img src="resources/images/logo.png" style="width:300; height:70px; display: block; margin-left: 100; margin-right: auto"> -->
                    <img src="resources/images/combineLogo.png">
            </div>
          <div class="panel-body">
            <div class="form-group">
                  <label for="exampleInputName2">Username</label>
                  <input type="text" name="email" class="form-control" id="exampleInputName2" placeholder="Username" style="width:300px;">
            </div>
            <div class="form-group">
                  <label for="exampleInputEmail2">Password</label>
                  <input type="password" name="password" class="form-control pull-right" id="exampleInputEmail2" placeholder="Password" style="width:300px;">
            </div>
            <button type="submit" class="btn btn-primary">Log In</button>
            
 
            <!-- <button type="submit" class="btn btn--right">Sign in  </button> -->
            <br/>
            <!-- <div class="panel-footer clearfix" style="background-color:white;"> -->
                    <a class="pull-right" href="register">Not a member</a>
                    
            <!-- </div> -->

          </div>
        </div>
      </form>
      </div>
    </body>
</html>