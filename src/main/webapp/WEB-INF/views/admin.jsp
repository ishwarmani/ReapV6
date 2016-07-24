<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false" %>
<html>
   <head>
      <title>REAP Project</title>
      <link rel="shortcut icon"
      href="
      <c:url value ="/resources/images/logo.ico"/>
      ">
      <link rel="stylesheet"
      href="
      <c:url value ="/resources/css/bootstrap-3.3.6-dist/css/bootstrap.min.css" />
      ">
      <script src="
      <c:url value ="/resources/css/jquery-2.2.0.min.js" />
      "></script>
      <script
      src="
      <c:url value ="/resources/css/bootstrap-3.3.6-dist/js/bootstrap.min.js" />
      "></script>
      <link rel="stylesheet"
      href="
      <c:url value ="/resources/css/font-awesome-4.6.3/css/font-awesome.min.css" />
      ">
      <link rel="stylesheet"
      href="
      <c:url value ="/resources/css/index.css" />
      ">
      <script
      src="
      <c:url value ="/resources/js/index.js" />
      "></script>
      <script
	src="<c:url value ="/resources/js/jquery.autocomplete.min.js" />"></script>
      <script>

  	$(document).ready(function() {

  		$('#newer-txtbx').autocomplete({
  			serviceUrl: '${pageContext.request.contextPath}/getEmployeeList',
  			paramName: "name",
  			delimiter: ",",
  		    transformResult: function(response) {
  		    	
  		        return {
  		        	
  		            suggestions: $.map($.parseJSON(response), function(item) {
  		            	
  		                return { value: item.employeeName  +","
  		                	 + item.employeeId,
  		                	data: item.email };
  		            })
  		            
  		        };
  		        
  		    }
  		    
  		});
  		
  		
  	});
  	
  	
  	</script>
  	
      
      
      </script>
      
   </head>
   <body style="background-color:f6fbff">
      <div class="modal fade" id="myModalload" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" width="5px">
         <div class="modal-dialog">
            <div class="modal-content">
               <div class="modal-header" style="background-color: #f1f1f1">
                  <div class="pull-left">
                     <h4>Karma Guideline</h4>
                  </div>
                  <button type="button" class="btn btn-default pull-right" data-dismiss="modal">Read later</button>
               </div>
               <div class="modal-body">
                  Please review the updated Karma Guidelines before making a recognition.<br><br>
                  <strong>Knowledge Participation</strong> - Reporting Manager\ Practice Head\ Service Line Head\ Session Owners\ Learning &amp; Development team can recognize Newers for practical application of learnings from a Formal Course\ Learning session attended.<br><br>
                  <strong>Knowledge Sharing</strong> - Recognize any Newer for sharing their Knowledge through a formal learning session like IntelliMeet, Knowledge Sharing Sessions etc.<br><br>
                  <strong>Protégé</strong> - Recognize Mentees\ Direct Reports for their effort and performance, initiative on the job, positive attitude etc.<br><br>
                  <strong>Mentorship</strong> - Recognize Mentor\Reporting Manager for their guidance and support in projects\career path, motivating in tough situations, leading by example etc.<br><br>
                  <strong>Pat on the back</strong> - Recognize Newers for a job well done. Give details of the task\activity.<br><br>
                  <strong>Extra Miler</strong> - Recognize a Newer for going above &amp; beyond the call of duty to help achieve organizational objectives pertaining to customer satisfaction, product value add, increased quality standards etc.<br><br>
                  <strong>For detailed guidelines, <a href="guideline.html">click here</a></strong>
               </div>
               <div class="modal-footer">
                  <label for="guideline" class="pointer"><input class="pointer" type="checkbox" id="guideline" onchange="guidelineRead(this);">&nbsp;&nbsp;I have read
                  </label>
                  <button type="button" class="btn" data-dismiss="modal">ok</button>
               </div>
            </div>
         </div>
      </div>
      <div class="row no-gutter">
         <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header" >
               <img class="MainLogo"
               src="
               <c:url value ="/resources/images/logo.png"/>
               "> 
               <div class="collapse navbar-collapse pull-right" id="myNav1">
                  <img class="MainHeader"
                  src="
                  <c:url value ="/resources/images/text_header.png"/>
                  "> 
               </div>
               <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNav" aria-expanded="false">
               <span class="sr-only">Toggle navigation</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               </button>
            </div>
            <!-- <a class="navbar-brand"><img src="assets/text_header.png" /></a> -->
            <div class="collapse navbar-collapse pull-right" id="myNav">
               <ul class="nav navbar-nav">
                  <li class="buttons">
                     <a href="admin">
                        <i class="fa fa-tachometer fa-lg" aria-hidden="true"></i>
                        <!-- <img src="assets/icon_dashboard_hover.png" class="hover"> -->
                        <b>Dashboard</b>
                     </a>
                  </li>
                  <li class="buttons buttonhover2">
                     <a href="badge">
                     <span class="fa-stack">
                     <i class="fa fa-circle fa-stack-2x"></i>
                     <i class="fa fa-star-o fa-stack-1x fa-inverse"></i>
                     </span>
                     <b>Badges</b>
                     </a>
                  </li>
                  <li class="buttons buttonhover3">
                     <a href="#">
                        <i class="fa fa-wpforms fa-lg" aria-hidden="true"></i>
                        <!-- <img src="assets/icon_dashboard_hover.png" class="hover"> -->
                        <b>Certificate</b>
                     </a>
                  </li>
                  <li class="buttons">
                     <a href="#">
                        <span class="fa-stack">
                        <i class="fa fa-circle fa-stack-2x"></i>
                        <i class="fa fa-lightbulb-o fa-stack-1x fa-inverse"></i>
                        </span>
                        <!-- <img src="assets/icon_dashboard_hover.png" class="hover"> -->
                        <b>Idea</b>
                     </a>
                  </li>
                  <!-- code for user profile button and dropdwon -->
                  <div class = "dropdown pull-right">
                     <li class = "btn dropdown-toggle" id = "dLabel" data-toggle="modal" href="#myModal" data-direction='top-right'>
                        <img class="userInfoIcon img-rounded"
                        src="
                        <c:url value ="/resources/images/myimage.jpg"/>
                        ">
                     </li>
                    
                     <div class="modal right fade modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" width="5px">
                        <div class="modal-dialog">
                           <div class="modal-content">
                              <div class="modal-body">
                                 <h4>Your Profile</h4>
                                 <img class="userInfoPic pull-left"
                                 src="
                                 <c:url value ="/resources/images/myimage.jpg"/>
                                 ">
                                 <div class="pull-left">
                                    Newer Name :  ${loggedInUser.getEmployeeName()}<br/>
                                   
                                    Service Line &nbsp;: ${loggedInUser.getServiceLine()}<br/>
                                    Practice&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ${loggedInUser.getPractice()}<br/>
                                    Email-ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ${loggedInUser.getEmail()}<br/>
                                 </div>
                              </div>
                              <div class="modal-footer">
                                 <button class="pull-left" type="button" class="btn btn-default">Guideline</button>
                                 <!-- <button class="pull-right" type="button" class="btn btn-primary" data-dismiss="modal">Logout</button> -->
                                 <a class=" btn pull-right" href="logout">Logout</a>
                              </div>
                           </div>
                           <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                     </div>
                     <!-- /.modal -->
                  </div>
                  <!-- code for notification and drop down -->
                  <div class = "dropdown pull-right" style="margin-top: 13px;">
                     <li class = "btn dropdown-toggle" id = "dropdownMenu1" data-toggle = "dropdown">
                        <i class="fa fa-bell fa-lg" aria-hidden="true"></i>
                     </li>
                     <ul class = "dropdown-menu" role = "menu" aria-labelledby = "dropdownMenu1">
                        <li role = "presentation">
                           <a role = "menuitem" tabindex = "-1" href = "#">
                           You have no unread notification
                           </a>
                        </li>
                        <li role = "presentation" class = "divider"></li>
                        <li role = "presentation">
                           <a role = "menuitem" tabindex = "-1" href = "#">
                              <center>View All</center>
                           </a>
                        </li>
                     </ul>
                  </div>
               </ul>
            </div>
         </nav>
      </div>
      </div>
      <!-- main body -->
      <!-- karma section -->
      <div class="col-sm-7 col-md-7 col-lg-9">
         <div class="row">
         </div>
         <div class="col-sm-12">
            <div class="panel panel-default">
               <div class="panel-heading" id="recog-heading" >
                  <img class="recognizeKarmaIcon" src="
                  <c:url value ="/resources/images/icon_badge.png"/>
                  ">
                  &nbsp;&nbsp;&nbsp;&nbsp;<b>Update Role</b>
               </div>
               <form method="POST" action="admin">
                  <div class="panel-body" >
                     <div class="row" style="padding-left:1%; padding:1%">
                        <div class="form-group">
                           <div class="col-sm-6">
                              <div class="input-group">
                                 <span class="input-group-addon" >
                                 <span class="glyphicon glyphicon-user"></span>
                                 </span>
                                
                                 <input type="text" name="newerId" class="form-control" id="newer-txtbx" placeholder="Select a newer"/>
                              </div>
                           </div>
                           <!-- select badge section -->
                           <div class="col-sm-6">
                              <select class="form-control" id="badge" name = "role">
                                 <option value="0" >Select a Role</option>
                                 <option value="Superviser">Superviser<%--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${loggedInUser.getGivingBadges().getBadges().getGold()} --%></option>
                                 <option value="Practice Head">Practice Head<%-- &nbsp;&nbsp;&nbsp;&nbsp;${loggedInUser.getGivingBadges().getBadges().getSilver()} --%></option>
                 
                              </select>
                              
                           </div>
                        </div>
                     </div>
                     <br/>
                  </div>
                  <div class="panel-footer">
                     <div class="row">
                        <div class="col-sm-12">
                           <input type="submit" value = "Update"class="btn btn-primary recogbt"/>
                        </div>
                     </div>
                  </div>
               </form>
            </div>
            <!-- end karma -->
            <!-- wall of fame -->
            <div class="panel panel-default">
               <div class="panel-heading" style="background: #8D9FC4;">
                  <div class="row">
                     <div class="col-lg-3" >
                        <i class="fa fa-list-alt fa-2x" aria-hidden="false"></i> &nbsp;<font color="white">WALL OF FAME</font>
                     </div>
                     <div class="col-lg-9">
                        <div class="row">
                           <form class="form" role="form">
                              <div class="col-lg-4">
                                
                                 <div class="input-group">
                                    <span class="input-group-addon">
                                    <i class="fa fa-search"></i>
                                    </span>
                                    <input type="text" class="form-control"/>
                                 </div>
                              </div>
                               <div class="col-lg-3">
                                 <select name="serviceLine" class="form-control" defaultLabel="Service Lines" id="serviceLine" >
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
                                 </select>
                              </div>
                              <div class="col-lg-3" >
                                 <select name="practice" class="form-control" defaultLabel="Practices" >
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
                                 </select>
                              </div>
                              <div class="col-lg-2 ">
                                 <i class="fa fa-calendar fa-2x" width="30px" height="30px"></i>
                              </div>
                           </form>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="panel-body">
                  <div class="row" style="padding-top: 20px;">
                    
            
            
             <c:forEach  items="${recKarma}"  var="user">
            <div class="col-xs-12" >
            			<div class="col-xs-2 " style = "text-align: center;">
                        <img class="imager wallOfFamePost"
                        src="
                        <c:url value ="/resources/images/myimage.jpg"/>
                        "> 
                     </div>
			             <strong><a href="badges/user/${user.getRecieverId()}">${user.getRecieverName()}</a></strong> has received ${user.getStar()} 
			             
			             from <strong><a href="badges/user/${user.getSenderId()}"> ${user.getSenderName()} </a></strong> for Karma ${user.getKarma()} <br/>
			                           Reason : ${user.getMessage()} <br/> 
			                           Date : <i>${user.getDate()}</i><hr></hr>   
            
            </div>
            	
            </c:forEach>
                     
                  </div>
                  <hr>
                  </hr>
                  
               </div>
            </div>
            <!-- end wall of fame -->
         </div>
      </div>
      <!-- side patch profile/ -->
      <div class="col-sm-5 col-md-5 col-lg-3 ">
      <div class="row">
         <div class="col-sm-12" style="padding: 0% 5.5%">
            <div class="panel panel-default">
               <div class="panel-heading" id="badges-heading" style="background: #8D9FC4;" >
                  <img class="recognizeKarmaIcon" src="
                  <c:url value ="/resources/images/icon_badge.png"/>
                  ">&nbsp;&nbsp;&nbsp;&nbsp;<font color="white">My Badges</font>
               </div>
               <div class="panel-body" >
                  <div class="row">
                     <div class="col-sm-5">
                        <img class="sideBatchPic profile-pic"
                        src="
                        <c:url value ="/resources/images/myimage.jpg"/>
                        ">
                     </div>
                     <div class="col-sm-7">
                        <div class="row">
                           <div class="col-sm-12">
                              <a href="#"><b> ${loggedInUser.getEmployeeName()} </b></a>
                              <label></label>
                           </div>
                        </div>
                        <div class="row">
                           <div class="col-sm-12">
                              <table class="table" border="0">
                                 <tr>
                                    <th>
                                       <img alt="gold badge" src="
                                       <c:url value ="/resources/images/icon_gold_badge.png"/>
                                       "> 
                                    </th>
                                    <th>
                                       <img alt="silver badge" src="
                                       <c:url value ="/resources/images/icon_silver_badge.png"/>
                                       ">
                                    </th>
                                    <th>
                                       <img alt="bronze badge" src="
                                       <c:url value ="/resources/images/icon_broze_badge.png"/>
                                       ">
                                    </th>
                                 </tr>
                                 <tr>
                                    <td>${loggedInUser.getRecievedBadges().getBadges().getGold()}</td>
                                    <td>${loggedInUser.getRecievedBadges().getBadges().getSilver()}</td>
                                    <td>${loggedInUser.getRecievedBadges().getBadges().getBronze()}</td>
                                 </tr>
                              </table>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- list of badges -->
      <!-- <div class="container"> -->
      <div class="panel" style="height:630px;width:275px">
         <ul class="nav nav-tabs nav-justified">
            <li class="active"><a href="#tab_a" data-toggle="tab">Newer Board</a></li>
            
         </ul>
         <div class="tab-content">
            <!-- gap-->													
            <div class="tab-pane active" id="tab_a">
              <!--  <div class="row" style="height:10px">
               </div> -->
               <!-- 1st -->	
            											
               <div class="row">

                  <!-- <div class="col-lg-7 col-sm-9 col-md-7" height="20px"> -->
      <!-- open -->       <c:forEach  items="${newerBoard}"  var="user"> 	
              		<div class = "col-xs-5">
              		<!-- image of newer in this box -->
              		<%-- <img class="sideBatchPic profile-pic"
                        src="
                        <c:url value ="/resources/images/myimage.jpg"/>
                        "> --%>
              		</div>
                  <div class="col-xs-7">
                     <div class="row">
                        <div class="row" style="height:30px">
                        </div>
                        <a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.getName()}</a><br/>
                     </div>
                     <div class="row">
                        <span>
                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="gold badge" src="
                           <c:url value ="/resources/images/icon_gold_badge.png"/>
                           ">
                        </span>
                        <span>
                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="silver badge" src="
                           <c:url value ="/resources/images/icon_silver_badge.png"/>
                           ">
                        </span>
                        <span>
                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="bronze badge" src="
                           <c:url value ="/resources/images/icon_broze_badge.png"/>
                           ">
                        </span>
                     </div>
                     <!-- <div class="row center1">
                        <img src="assets/icon_gold_badge.png">
                        <img src="assets/icon_silver_badge.png">
                        <img src="assets/icon_broze_badge.png">
                        </div> -->
                     <div class="row">
                        <span>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${user.getBadges().getGold() }</i>
                        </span>
                        <span>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${user.getBadges().getSilver() }</i>
                        </span>
                        <span>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${user.getBadges().getBronze() }</i>
                        </span>
                     </div>
                  </div>
                  <!-- close -->      </c:forEach>
          
               </div>
         																
               <div class="row" style="height:20px">
               </div>
               <div class="row pull-right">
                  <div class="col-sm-12">
                     <a href="">view all</a>
                  </div>
               </div>
            </div>
            
      <!-- list of badges end -->
      <!-- end side batch profile -->
   </body>
</html>