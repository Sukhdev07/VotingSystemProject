<%-- 
    Document   : newjsp
    Created on : Dec 2, 2018, 6:28:43 PM
    Author     : Hp
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>Voting Servlet</title>
	<!-- Meta-Tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<meta name="keywords" content="Hover Overlay Effects a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //Meta-Tags -->
	<!-- Stylesheets -->
	<link href="css/style_1.css" rel='stylesheet' type='text/css' />
	<link href="css/fontawesome-all.min.css" rel='stylesheet' type='text/css' />
	<!--// Stylesheets -->
	<!-- online fonts -->
	<link href="//fonts.googleapis.com/css?family=Ubuntu+Condensed" rel="stylesheet">
        <style>
.myButton {
	<!-- -moz-box-shadow:inset 0px 1px 3px 0px #91b8b3;
	-webkit-box-shadow:inset 0px 1px 3px 0px #91b8b3;-->
	box-shadow:inset 0px 1px 3px 0px #91b8b3;
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #768d87), color-stop(1, #191f1f));
	background:-moz-linear-gradient(top, #768d87 5%, #191f1f 100%);
	background:-webkit-linear-gradient(top, #768d87 5%, #191f1f 100%);
	background:-o-linear-gradient(top, #768d87 5%, #191f1f 100%);
	background:-ms-linear-gradient(top, #768d87 5%, #191f1f 100%);
	background:linear-gradient(to bottom, #768d87 5%, #191f1f 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#768d87', endColorstr='#191f1f',GradientType=0);
	background-color:#768d87;
	-moz-border-radius:5px;
	-webkit-border-radius:5px;
	border-radius:5px;
	border:1px solid #0f1412;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:'Ubuntu Condensed',sans-serif;
	font-size:100%;
	padding:11px 23px;
	text-decoration:none;
	text-shadow:0px -1px 0px #2b665e;
}
.myButton:hover {
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #191f1f), color-stop(1, #768d87));
	background:-moz-linear-gradient(top, #191f1f 5%, #768d87 100%);
	background:-webkit-linear-gradient(top, #191f1f 5%, #768d87 100%);
	background:-o-linear-gradient(top, #191f1f 5%, #768d87 100%);
	background:-ms-linear-gradient(top, #191f1f 5%, #768d87 100%);
	background:linear-gradient(to bottom, #191f1f 5%, #768d87 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#191f1f', endColorstr='#768d87',GradientType=0);
	background-color:#191f1f;
}
.myButton:active {
	position:relative;
	top:1px;
}

</style>
</head>

<body>
    <% Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","PJFLAB07020103");
            String sql_query="select fname,party,phone from cand";
              PreparedStatement pstmt=conn.prepareStatement(sql_query);
              
              ResultSet rs=pstmt.executeQuery();
              %>
	<header>
		<h1 class="text-center">Candidate List</h1>
	</header>
	<!-- team -->
	<div class="container">
		<div class="row">
                    <%while(rs.next())
              {
                    %>
              
			<div class="col-4">
				<div class="team-member">
					<div class="team-img">
						<img src="images/h1.jpg" alt="team member" class="img-fluid">
						<div class="team-hover">
							<div class="desk">
								<h4>Contact Me:</h4>
								<p><%=rs.getString(2)%></p>
							</div>
							<div class="s-link">
								<a href="#">
									<i class="fab fa-facebook-f"></i>
								</a>
								<a href="#">
									<i class="fab fa-twitter"></i>
								</a>
								<a href="#">
									<i class="fab fa-google-plus-g"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="team-title">
						<h5><%=rs.getString(1)%></h5>
						<span>Affiliated With :  <%=rs.getString(3)%></span>
					</div>
				</div>
			</div>
                                                        <%}%>
<!--			<div class="col-4">
				<div class="team-member">
					<div class="team-img">
						<img src="images/t2.jpg" alt="team member" class="img-fluid">
						<div class="team-hover">
							<div class="desk">
								<h4>vehicula eleme!</h4>
								<p>estibulum ac diam sit amet quam vehicula elementum.</p>
							</div>
							<div class="s-link">
								<a href="#">
									<i class="fab fa-facebook-f"></i>
								</a>
								<a href="#">
									<i class="fab fa-twitter"></i>
								</a>
								<a href="#">
									<i class="fab fa-google-plus-g"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="team-title">
						<h5>Franklin Harbet</h5>
						<span>HR Manager</span>
					</div>
				</div>
			</div>
			<div class="col-4">
				<div class="team-member">
					<div class="team-img">
						<img src="images/t3.jpg" alt="team member" class="img-fluid">
						<div class="team-hover">
							<div class="desk">
								<h4>vehicula eleme!</h4>
								<p>estibulum ac diam sit amet quam vehicula elementum.</p>
							</div>
							<div class="s-link">
								<a href="#">
									<i class="fab fa-facebook-f"></i>
								</a>
								<a href="#">
									<i class="fab fa-twitter"></i>
								</a>
								<a href="#">
									<i class="fab fa-google-plus-g"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="team-title">
						<h5>Linda Anderson</h5>
						<span>Marketing Manager</span>
					</div>
				</div>-->
			</div>
		</div>
		<!-- //team -->
		<!-- team -->
		
	</div>
        <br>
        <br>
        <a href="Success.jsp" class="myButton">Proceed to Vote</a>


</body>

</html>