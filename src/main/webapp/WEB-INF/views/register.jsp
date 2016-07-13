
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html >
  <head>
    <meta charset="UTF-8">
    <title>Custom Login Form</title>

        <link rel="stylesheet" href="<c:url value ="/resources/css/style.css" />">

  </head>
  <body>

    <div id="wrapper">
        
      	<div class="clr"></div>
        <div class="login-options">Choose on of the following sign up methods.</div>
        <a class="twitter" href="#">Twitter</a>
        <a class="facebook" href="#">Facebook</a>
        <a class="google" href="#">Google+</a>
        <div class="clr"><hr /></div>
        <div class="mail-text">Or sign up using your email address.</div>
        <div class="forms">
                <form:form action="register" method="POST">
                          <form:input path="name" type="text" placeholder ="Enter your full name" size="60" onClick="border: 1px solid #30a8da;" id="name"/>
                         <form:input path="email" type="text" placeholder ="Enter your email address" size="60" onClick="border: 1px solid #30a8da;" id="email"/>
                         <form:input path="password" type="password" placeholder ="Enter a password" size="60" onClick="border: 1px solid #30a8da;" id="password"/>
                         <input type="password" placeholder ="Re-Enter the password" size="60" onClick="border: 1px solid #30a8da;" id="password"/>

                      <form:select path="serviceLine" defaultLabel="Service Lines" id="serviceLine"  >
                        <option value="">Service Lines</option>
                        <option value="2" >Analytics</option>
                        <option value="12" >Analytics-SEA</option>
                        <option value="9" >Digital Marketing</option>
                        <option value="20" >Digital Marketing India</option>
                        <option value="13" >Digital Marketing-SEA</option>
                        <option value="1" >Technology</option>
                        <option value="6" >ThoughtBuzz India</option>
                        <option value="21" >TTN Overheads</option>
                        <option value="23" >TTND-Intern</option>
                        <option value="17" >TTND-SEA</option>
                        <option value="22" >TTNV</option>
                        <option value="19" >Video Solutions</option>
                      </form:select>
                      

                     <!--  private String employeeID;
                      private String name;
                      private String email;
                      private UserRole userRole;
                      private String serviceLine;
                      private String password; -->

                    
                      <form:select path="practice" defaultLabel="Practices" >
                        <option value="">Practices</option>
                        <option value="6" >Admin</option>
                        <option value="14" >AMC</option>
                        <option value="63" >Analytics</option>
                        <option value="46" >Analytics-SEA</option>
                        <option value="20" >BigData</option>
                        <option value="80" >BlogMint</option>
                        <option value="70" >Business Development</option>
                        <option value="37" >Creative</option>
                        <option value="10" >Design</option>
                        <option value="71" >DevOps</option>
                        
                      </form:select>
                  	
                  	<input type="submit" class="create-acc" value="Create My Account"/>
               </form:form>
        </div>	

    </div>
  </body>
</html>
