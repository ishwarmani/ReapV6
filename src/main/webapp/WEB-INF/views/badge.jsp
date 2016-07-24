<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false" %>
<html lang="en" class="no-js">
<head>
      <title>Badges</title>
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

  <style>
      .black_overlay{
          display: none;
          position: absolute;
          top: 0%;
          left: 0%;
          width: 100%;
          height: 100%;
          background-color: black;
          z-index:1001;
          -moz-opacity: 0.8;
          opacity:.80;
          filter: alpha(opacity=80);
      }
      .white_content {
          display: none;
          position: absolute;
          top: 25%;
          left: 25%;
          width: 50%;
          height: 50%;
          padding: 16px;
          background-color: white;
          z-index:1002;
          overflow: auto;
      }
 
  .post-content {
    background: none repeat scroll 5 5 #FFFFFF;
    opacity: 1.5;
    top:0;
    left:50;
    position: absolute;
     text-align:center;
}
 
    .table-style {
          width: 100%;
          max-width: 100%;
          margin-bottom: 20px;
          border-collapse: collapse;
          border: 1px;
          border-color: #f4f4f4;
          background-color: transparent;
          border-spacing: 0;
          display: table;
      }

      th {
          padding: 10px;
      }


      td {
          width: 220px;
          font-weight: 600;
          padding: 10px;
      }
      .rdmBtn {
          margin-top: 30px;
          background-color: #505b72;
          float: right;
          border-radius: 5px 5px 5px 5px;
          color: #e8e9ec;
          border-width: 0px;
          padding: 5px;
      }

					.dropdown-menu>li.user-header>img
					{
						z-index:5;
						height:122px;
						width:122px;
						border:3px solid;
						border-color:transparent;
						border-color:#e9e9e9;
						float:left;
					}

					#user>.dropdown-menu
					{
    				width: 500px !important;
    				height: 350px !important;
					}
					.dropdown-menu>li.user-footer
					{
						background-color:#f4f4f4;
					}
					/* #wgtmsr{
 					width:350px;
					}

					#wgtmsr option{
 					width:100px;
					} */

					div#recog-heading{
						background:#ea8744;
						border:1px solid #ea8744;
						height:38px;
						color: #fff;
					}

					/* #wgtmsr image {
					    position:relative;
					    right:0px;
					    padding:0 5px;
					    margin:0;
					  }

					#wgtmsr img {
					    display: block;
					    margin-left: auto;
					    margin-right: auto;
							margin-top: 10px;
							margin-bottom: auto;
					} */

					.buttonhover1:hover {
					    background-color: #555555;
					    color: white;
							img src: url("assets/icon_dashboard_hover.png");
							text-shadow: 1px 1px 10px white;

							-webkit-transition: all 0.3s ease-in-out;
							-moz-transition: all 0.3s ease-in-out;
							-ms-transition: all 0.3s ease-in-out;
							-o-transition: all 0.3s ease-in-out;
							transition: all 0.3s ease-in-out;
					}

					.buttonhover1:hover img{
						url(assets/icon_dashboard_hover.png" class="hover);
					}


					.top-buffer
					{
						 margin-top:20px;
					  }

						.center1
						{
							/*margin: auto;
					    width: 50%;
					    border: 3px;
					    padding: 10px;*/
							padding: 0px 0;
					    border: 0px;
					    text-align: center;
						}

						a:hover, a:visited, a:link, a:active
					{
					    text-decoration: none;
					}
					.modal .modal-dialog { width: 50%; }
				 .modal-body {
				     /* 100% = dialog height, 120px = header + footer */
				     max-height: calc(100% - 80px);
				     overflow-y:auto;
				 }
				 #myModal {
					 top:7%;
					 left:49%;
					 outline: none;
				 }

				 table td {
				     border-top: none !important;
				 }
				 .table th, .table td {
				      border-top: none !important;
				  }
				  modal.close {display: none;}
				  .fa-lightbulb-o:hover {
					    color: yellow;
					}
				  .MainLogo{
				  width:120px;
				  padding-right:13;
				  margin-top: 18px;
				  margin-left:58px;
				  }
				  .MainHeader{
				  	width:425px;
				  	margin-top: 21px;
				  	margin-left:12px;
				  }
				  .userInfoIcon{
				  	height:45px; 
				  	weight:45px;
				  }
				  .userInfoPic{
				  	height:100px; 
				  	weight:100px;
				  }
				  .wallOfFamePost{
				  	width:50px; 
				  	height:50px;
				  }
				  .sideBatchPic{
				  height:100px; 
				  weight:100px;
				  }
				  .batchListPic{
				  	height:100px; 
				  	weight:100px;
				  }
				  .navbar-header{
				  height:70px;
				  }
				  .navbar-collapse{
				  margin-top: 10px;
				  }
			.points{
				width:130px; 
				height:110px;
			} 

			</style>


	</head>
</head>

<body>

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
                     <a href="index">
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



    <div class="content-wrapper" >
        <div class="container-fluid">
		<div class="row" style="background-color:f1f4f5">
    <div class="col-md-4">
      <div class="row">
        <div class="panel panel-default">
          <div class="panel-heading" style="background:#8d9fc4; color:#ffffff" ><img src="
                        <c:url value ="/resources/images/icon_badge.png" />"> <strong style="font-size:15px" >&nbsp
    	  BADGES & POINTS
    	  </strong></div>
        <div class="panel-body">
            <div class="col-lg-3 col-xs-3 col-md-3">
                  <div class="badge-content"id="userBadgeDetail_1116">
                        <div class="badgecontentleft">
                              <img class="sideBatchPic profile-pic"
                        src="
                        <c:url value ="/resources/images/myimage.jpg"/>
                        ">
                        </div>
                  </div>
            </div>
            <!-- <div class="col-lg-7 col-sm-9 col-md-7" height="20px"> -->
            <div class="col-lg-5 col-xs-5 col-md-5">
                      <!-- <div class="row center1">
                      <a href="#"></a><br/>
                      </div> -->
                      <div class="row">
                          <div class="row" style="height:30px">
                          </div>
                          <a href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${name}</a><br/>
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
                      <div class="row">
                              <span>
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${recievedBadges.getBadges().getGold() }</i>
                              </span>
                              <span>
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${recievedBadges.getBadges().getSilver()}</i>
                              </span>
                              <span>
                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>${recievedBadges.getBadges().getBronze()}</i>
                              </span>
                      </div>
            </div>
            <div class="col-lg-4 col-xs-4 col-md-4">
            <img class="points" src="<c:url value ="/resources/images/points.png"/>">
            <div class="caption post-content">
                <h1>${ recievedBadges.getPoints()} <small>pts</small></h1>
            </div>

            </div>

     </div>
      <input type="button" id="btn" class="rdmBtn" value="Redeem Points" onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">

   </div>
   </div>
    </div>
    <div class="col-lg-8 col-md-8 col-sm-8">

        <!--
             <ul class="nav nav-tabs tab" id="myTab" >
                 <li><a    data-toggle:"tab" href="#all">ALL(0)</a></li>
                 <li><a    data-toggle:"tab" href="#menu1">BADGES SHARED(0)</a></li>
                 <li><a    data-toggle:"tab" href="#">BADGES RECEIEVED(0)</a></li>
                 <li><a    data-toggle:"tab" href="#">BADGES HISTORY</a></li>
                 <li><a    data-toggle:"tab" href="#">POINTS REDEEMED</a></li>
             </ul>

        <div class="tab-content">
                <div id="all" class="tab-pane fade " role="tabpanel">
                    <p> No Data Found</p>
                </div>
                 <div id="menu1" class="tab-pane fade" role="tabpanel">
  <h3>Menu 1</h3>
  <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
  </div>


        </div>



    </div>-->


   <!--   <nav class="navbar navbar"> -->
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#badges" style="border:1px solid black">
                <span class="icon-bar" style="background-color:#000 !important"></span>
                <span class="icon-bar" style="background-color:#000 !important"></span>
                <span class="icon-bar" style="background-color:#000 !important"></span>
              </button>

            </div>

      <div class="collapse navbar-collapse" id="badges" style="padding:5px;font-size:14px">
        <ul class="nav nav-tabs" id="badges">
            <li><a data-toggle="tab" href="#all">ALL(${allBadges.size() })</a>
            
            </li>
            <li><a data-toggle="tab" href="#BadgesShared">BADGES SHARED(${givBadges.size() })</a>
            
            </li>
            <li><a data-toggle="tab" href="#BadgesRecieved">BADGES RECIEVED(${recBadges.size() })</a>
            
            </li>
          <li><a data-toggle="tab" href="#BadgesHistory">BADGES HISTORY</a>
            </li>
            <li><a data-toggle="tab" href="#PointsRedeemed">POINTS REDEEMED</a>
            </li> 
        </ul>
      </div>
      </div>
    <!--   </nav> -->

        <div class="tab-content">
            <div id="all" class="tab-pane fade in active">
               <!--  <div class="con">No Data Found</div> -->
               <c:forEach var="allBadges"
										items="${allBadges}">
										<div class="row">
											<div class="col-md-2" style="padding-top: 10px">
												<center>
													<img src="<c:url value ="/resources/images/myimage.jpg"/>" alt="image"
														class="img-rounded" width="50px" height="50px">
												</center>
											</div>
											<div class="col-md-10" style="padding-top: 10px">
												<strong><a
													href="badges/user/${allBadges.getRecieverId()}">${allBadges.getRecieverName()}</a></strong>
												 has received ${allBadges.getStar()} <!-- <img src="/REAP/resources/images/silver.png"
													title="Silver" alt="Silver"> --> from <strong><a
													href="badges/user/${allBadges.getSenderId()}">${allBadges.getSenderName()}</a></strong>
												for Karma : ${allBadges.getKarma()}
												<div>
													Reason : ${allBadges.getMessage()} <br> <i
														class="momentDate"> ${allBadges.getDate()} </i>
												</div>
											</div>
										</div>
										<hr>
									</c:forEach>
            </div>
            <div id="BadgesShared" class="tab-pane fade">
               <!--  <div class="con">No Data Found</div> -->
                <c:forEach var="givenKarma"
										items="${givBadges}">
										<div class="row">
											<div class="col-md-2" style="padding-top: 10px">
												<center>
													<img src="<c:url value ="/resources/images/myimage.jpg"/>" alt="image"
														class="img-rounded" width="50px" height="50px">
												</center>
											</div>
											<div class="col-md-10" style="padding-top: 10px">
												<strong><a
													href="badges/user/${givenKarma.getRecieverId()}">${givenKarma.getRecieverName()}</a></strong>
												 has received ${givenKarma.getStar()} <!-- <img src="/REAP/resources/images/silver.png"
													title="Silver" alt="Silver"> --> from <strong><a
													href="badges/user/${givenKarma.getSenderId()}">${givenKarma.getSenderName()}</a></strong>
												for Karma : ${givenKarma.getKarma()}
												<div>
													Reason : ${givenKarma.getMessage()} <br> <i
														class="momentDate"> ${givenKarma.getDate()} </i>
												</div>
											</div>
										</div>
										<hr>
									</c:forEach>
            </div>
            <div id="BadgesRecieved" class="tab-pane fade in">
               <!--  <div class="con">No Data Found</div> -->
               <c:forEach var="recKarma"
										items="${recBadges}">
										<div class="row">
											<div class="col-md-2" style="padding-top: 10px">
												<center>
													<img src="<c:url value ="/resources/images/myimage.jpg"/>" alt="image"
														class="img-rounded" width="50px" height="50px">
												</center>
											</div>
											<div class="col-md-10" style="padding-top: 10px">
												<strong><a
													href="badges/user/${recKarma.getRecieverId()}">${recKarma.getRecieverName()}</a></strong>
												 has received ${recKarma.getStar()} <!-- <img src="/REAP/resources/images/silver.png"
													title="Silver" alt="Silver"> --> from <strong><a
													href="badges/user/${recKarma.getSenderId()}">${recKarma.getSenderName()}</a></strong>
												for Karma : ${recKarma.getKarma()}
												<div>
													Reason : ${recKarma.getMessage()} <br> <i
														class="momentDate"> ${recKarma.getDate()} </i>
												</div>
											</div>
										</div>
										<hr>
									</c:forEach>
            </div>
            <div id="BadgesHistory" class="tab-pane fade">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <select class="form-control select-sty">
                                <option value="2016">2016</option>
                            </select>
                        </div>
                        <div class="col-sm-6">
                            <select class="form-control select-sty">
                                <option value="Q2">Q2</option>
                                <option value="Q3">Q3</option>
                                <option value="Q4">Q4</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <table class="table-bordered table-hover table-responsive">
                            <tbody>
                                <tr>
                                    <th style="width:192px" colspan="4">Badges to be shared</th>
                                </tr>
                                <tr style="margin:15%">
                                    <th colspan="4"> </th>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td>Current Badge Balance</td>
                                    <td>2 4 6 </td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>Date</td>
                                    <td>Transaction</td>
                                    <td>Opening Balance</td>
                                    <td>Closing Balance</td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <h2>No Data Found</h2>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <br>
                        <br>
                        <br>
                        <table class="table-bordered table-hover table-responsive">
                            <tbody>
                                <tr>
                                    <th style="width:192px" colspan="4">Badges Recieved</th>
                                </tr>
                                <tr style="margin:15%">
                                    <th colspan="4"> </th>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td>Current Point Balance/Badge Balance</td>
                                    <td>0 0 0 </td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>Date</td>
                                    <td>Transaction</td>
                                    <td>Opening Balance</td>
                                    <td>Closing Balance</td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <h2>No Data Found</h2>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
            <div id="PointsRedeemed" class="tab-pane fade">
                <div class="con">No Data Found</div>
            </div>
        </div>

    </div>

	</div>  <!--main Row END  -->
      </div>
</div>
</div>

    <div id="light" class="white_content">Content to be done 6 month training module. <a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">Close</a></div>
    <div id="fade" class="black_overlay"></div>
</body>

</html>
