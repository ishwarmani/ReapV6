<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html >
  <head>
    <meta charset="UTF-8">
    <title>Simple login form</title>
    
    
    <link rel="stylesheet" href=""<c:url value ="/resources/css/reset.css" />">
    <link rel="stylesheet" href="<c:url value ="/resources/css/style.css" />">

  </head>

  <body>

    <div class="container">
  <div class="login">
  	<h1 class="login-heading">
      <strong>Welcome.</strong> Please login.</h1>
      <form method="POST">
        <input type="text" name="email" placeholder="Username" required="required" class="input-txt" />
          <input type="password" name="password" placeholder="Password" required="required" class="input-txt" />
          <div class="login-footer">
             <a href="#" class="lnk">
              <span class="icon icon--min">ಠ╭╮ಠ</span> 
              I've forgotten something
            </a>
            <button type="submit" class="btn btn--right">Sign in  </button>
    
          </div>
      </form>
  </div>
</div>
        <script src=<c:url value ="/resources/js/index.css" />"></script>

  </body>
</html>
