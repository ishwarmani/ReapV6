<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Guideline</title>
	<link rel="shortcut icon"
	href="<c:url value ="/resources/images/logo.ico"/>">
<link rel="stylesheet"
	href="<c:url value ="/resources/css/bootstrap-3.3.6-dist/css/bootstrap.min.css" />">
<script src="<c:url value ="/resources/css/jquery-2.2.0.min.js" />"></script>
<script
	src="<c:url value ="/resources/css/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>
<link rel="stylesheet"
	href="<c:url value ="/resources/css/font-awesome-4.6.3/css/font-awesome.min.css" />">
<link rel="stylesheet"
	 href="<c:url value ="/resources/css/guideline.css" />">
	
	    </head>

	    <!-- HTML code from Bootply.com editor -->

	    <body style="background-color:f6fbff">




				<nav class="navbar navbar-default" role="navigation">
			<div class="navbar-header" style="height:70px">
				 <img class="MainLogo"
						src="<c:url value ="/resources/images/logo.png"/>"> 
				<div class="collapse navbar-collapse pull-right" id="myNav1">
						<img class="MainHeader"
						src="<c:url value ="/resources/images/text_header.png"/>"> 
			  </div>
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNav" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
        <!-- <a class="navbar-brand"><img src="assets/text_header.png" /></a> -->

		 <div class="collapse navbar-collapse pull-right" id="myNav" style="margin-top: 10px;">
        <ul class="nav navbar-nav">

					<li class="buttons">
							<a href="#">
								<i class="fa fa-tachometer fa-lg" aria-hidden="true"></i>
							<!-- <img src="assets/icon_dashboard_hover.png" class="hover"> -->
								<b>Dashboard</b>
							</a>
					</li>

					<li class="buttons buttonhover2">
							<a href="#">


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
							src="<c:url value ="/resources/images/myimage.JPG"/>">
						</li>
						<!-- <a data-toggle="modal" href="#myModal" class="btn btn-primary btn-lg">Launch demo modal</a> -->
						<!-- <ul class="dropdown-menu profile" name="wgtmsr" id="wgtmsr"> -->

										<!-- <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel" name="wgtmsr" id="wgtmsr">
										<li class="dropdown-header" > <center><strong><font size="5">Your Profile</font></strong></center>
										</li>
											<div class="col-md-3 image">
															<img class="img-circle" alt="User Image" src="assets/myimage.JPG" height="100px" weight="100px">
											</div>
												<div class="col-md-6">
																<li>Name : Mayank Agnihotri</li>
																<li>Service Line : TTND-Intern</li>
																<li>Practice : Intern</li>
																<li>Email-ID : 	mayank.agnihotri@tothenew.com</li>
																<li class="dropdown-footer">
																    <div class="col-xs-4 text-center pull-left">
																        <a href="#" class="btn btn-default btn-flat">
																            Guidelines
																        </a>
																    </div>
																    <div class="col-xs-4 pull-right">
																        <a href="#" class="btn btn-default btn-flat">
																           <img src="assets/icon_logout.png"> Logout
																        </a>
																    </div>
																</li>
												</div>
									</ul> -->



									<div class="modal right fade modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" width="5px">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-body">
													<h4>Your Profile</h4>
														<img class="userInfoPic pull-left"
															src="<c:url value ="/resources/images/myimage.JPG"/>">
															<div class="pull-right">
																	Newer Name : Mayank Agnihotri <br/>
																	Service Line &nbsp;: TTND-Intern<br/>
																	Practice&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: Intern<br/>
																	Email-ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: mayank.agnihotri@tothenew.com<br/>
															</div>
												</div>
												<div class="modal-footer">
												<button class="pull-left" type="button" class="btn btn-default">Guideline</button>
												<button class="pull-right" type="button" class="btn btn-primary" data-dismiss="modal">Logout</button>
											</div>
										</div><!-- /.modal-content -->
									</div><!-- /.modal-dialog -->
								</div><!-- /.modal -->

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
													<a role = "menuitem" tabindex = "-1" href = "#"><center>View All</center></a>
							 					</li>
								</ul>
					 </div>
				 </ul>
			 </div>
	   </nav>





	                  <!-- <div class="box">

	                    <div class="box-header">

	                      <div class="box-title pull-left">
	                        <p>Guideline</p>
	                      </div> -->
	                      <!--end: TITLE-->
	                      <!--ICONS - FUNCTIONAL-->
	                      <!--end: ICONS-->
	                    <!-- </div> -->
	                    <!--end: BOX HEADER-->
	                    <!--BOX CONTENT-->
	                    <!-- <div class="box-content"> -->

											<div class="panel panel-default" style="margin-top:10px; margin-left:10px; margin-right:10px;">
												<div class="panel-heading" style="background: #8D9FC4;"><b><font color="white">GuideLine</font></b></div>
												<div class="panel-body">
													<p><strong>Roles: </strong>All Newers are categorised into three<strong>&nbsp;</strong>roles in REAP</p>

													<ul>
														<li>Users - Newers working as individual contributors</li>
														<li>Reporting Manager/MentoVisor - Newers in team management roles and/or are MentoVisors for other Newers</li>
														<li>Practice Head/Service Line Head - Newers heading Practice or Service Line</li>
													</ul>

													<p><strong>Karmas: </strong>Karmas are areas in which we want to recognize and acknowledge Newers. We have the following Karmas in REAP</p>

													<p>&nbsp;</p>

													<table class="responsive" border="1" cellpadding="0" cellspacing="0">
														<tbody>
															<tr>
																<td style="width: 108px;">
																<p><strong>Karma</strong></p>
																</td>
																<td style="width: 149px;">
																<p><strong>Who Can Recognize</strong></p>
																</td>
																<td style="width: 160px;">
																<p><strong>Whom</strong></p>
																</td>
																<td style="width: 206px;">
																<p><strong>For</strong></p>
																</td>
															</tr>
															<tr>
																<td style="width: 108px; height: 31px;">
																<p><strong>Pat on the back&nbsp; </strong></p>
																</td>
																<td style="width: 149px; height: 31px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 160px; height: 31px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 206px; height: 31px;">
																<ul>
																	<li>a job well done</li>
																</ul>

																<p>&nbsp;</p>
																</td>
															</tr>
															<tr>
																<td style="width: 108px;">
																<p><strong>Extra Miler</strong></p>
																</td>
																<td style="width: 149px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 160px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 206px;">
																<ul>
																	<li>Going above &amp; beyond the call of duty which helped
																	<ul style="list-style-type: circle;">
																		<li>create value for client</li>
																	</ul>
																	</li>
																	<li>meet the dead lines</li>
																	<li>deliver quality work</li>
																	<li>improved teams performance</li>
																	<li>maintain a happy workplace/team culture/friendly environment</li>
																	<li>etc.</li>
																</ul>

																<p>&nbsp;</p>
																</td>
															</tr>
															<tr>
																<td style="width: 108px;">
																<p><strong>Protégé</strong></p>
																</td>
																<td style="width: 149px;">
																<p>Any MentoVisor/Reporting Manager/ Anybody who mentored you (may not be Official MentoVisor/Reporting Manager)</p>
																</td>
																<td style="width: 160px;">
																<p>Any Mentee/Direct Report/ Anybody whom you mentored</p>
																</td>
																<td style="width: 206px;">
																<ul>
																	<li>Bringing new ideas to the table</li>
																	<li>Positive Attitude and approach</li>
																	<li>Handling a tough situation</li>
																	<li>Taking a challenging initiative</li>
																</ul>

																<p>&nbsp;</p>
																</td>
															</tr>
															<tr>
																<td style="width: 108px;">
																<p><strong>Mentorship</strong></p>
																</td>
																<td style="width: 149px;">
																<p>Any Mentee/Direct Report/ Anybody whom you mentored</p>
																</td>
																<td style="width: 160px;">
																<p>Any MentoVisor/Reporting Manager/ Anybody who mentored you (may not be Official MentoVisor/Reporting Manager)</p>
																</td>
																<td style="width: 206px;">
																<ul>
																	<li>His/her guidance and support</li>
																	<li>Help during projects</li>
																	<li>Motivating in a tough situation</li>
																	<li>Leading by example</li>
																	<li>Guidance in shaping up the career path</li>
																</ul>
																</td>
															</tr>
															<tr>
																<td style="width: 108px;">
																<p><strong>Knowledge Sharing</strong></p>
																</td>
																<td style="width: 149px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 160px;">
																<p>Any Newer who took a Formal Session (Only)</p>
																</td>
																<td style="width: 206px;">
																<ul>
																	<li>Presenting complex ideas in a simple way</li>
																	<li>Helping apply the knowledge on the job</li>
																	<li>Covering a lesser known Topic</li>
																</ul>
																</td>
															</tr>
															<tr>
																<td style="width: 108px;">
																<p><strong>Customer Delight</strong></p>
																</td>
																<td style="width: 149px;">
																<p>Any Newer</p>
																</td>
																<td style="width: 160px;">
																<p>Any Newer (who has&nbsp;received&nbsp;client appreciation)&nbsp;</p>
																</td>
																<td style="width: 206px;">
																<ul>
																	<li>Being appreciated by client for exceptional work</li>
																</ul>
																</td>
															</tr>
														</tbody>
													</table>

													<p>&nbsp;</p>

													<p><strong>Badges:</strong></p>

													<ul>
														<li>There are three types of badges - Gold, Silver and Bronze</li>
														<li>Badges are to be used when recognizing a Newer for Karmas</li>
														<li>Badges are allocated to a Newer on a&nbsp;quarterly basis</li>
														<li>Unused badges will lapse at the end of the quarter</li>
														<li>Badges are allocated as per roles</li>
													</ul>

													<p><strong>Ideas:</strong></p>

													<ul>
														<li>A Newer can submit an idea to improve day-to-day operations at TTND</li>
														<li>Newers can boost an idea by sharing badges</li>
														<li>Ideas shortlisted for implementation will appear on Implemented tab</li>
													</ul>

													<p><strong>Redemption:</strong></p>

													<ul>
														<li>Ever<p><strong>Roles: </strong>All Newers are categorised into three<strong>&nbsp;</strong>roles in REAP</p>

													<ul>
														<li>Users - Newers working as individual contributors</li>
														<li>Reporting Manager/MentoVisor - Newers in team management roles and/or are MentoVisors for other Newers</li>
														<li>Practice Head/Service Line Head - Newers heading Practice or Service Line</li>
													</ul>
												</div>
												</div>
	                    <!-- </div>

	                  </div>-->







  </body>
  </html>
