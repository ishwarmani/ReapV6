<%@ page session="false"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 

<!DOCTYPE html>
<html lang="en">

	<h1>User Detail</h1>
	<br />
		<c:out value = "${user.getName()}"/>
		
		<label >ID</label>
		<div ><c:out value="${myObj}" /></div>
	

		<label>Password</label>
		<a>${user.getPassword()}</a>


		<label ">Name</label>
		<a >${user.getName()}</a>
	

		<label >Email</label>
		<div >${user.getEmail()}</div>
	
	
		<label >Address</label>
		<div >${user.getAddress()}</div>
	
</html>