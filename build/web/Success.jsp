<%-- 
    Document   : Success
    Created on : Oct 31, 2018, 3:36:03 PM
    Author     : Hp
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
   @import url('https://fonts.googleapis.com/css?family=Lato');

body, html{
  height: 100%;
  background: #222222;
	font-family: 'Lato', sans-serif;
}

.container{
  display: block;
  position: relative;
  margin: 40px auto;
  height: auto;
  width: 500px;
  padding: 20px;
}

h2 {
	color: #AAAAAA;
}

.container ul{
  list-style: none;
  margin: 0;
  padding: 0;
	overflow: auto;
}

ul li{
  color: #AAAAAA;
  display: block;
  position: relative;
  float: left;
  width: 100%;
  height: 100px;
	border-bottom: 1px solid #333;
}

ul li input[type=radio]{
  position: absolute;
  visibility: hidden;
}

ul li label{
  display: block;
  position: relative;
  font-weight: 300;
  font-size: 1.35em;
  padding: 25px 25px 25px 80px;
  margin: 10px auto;
  height: 30px;
  z-index: 9;
  cursor: pointer;
  -webkit-transition: all 0.25s linear;
}

ul li:hover label{
	color: #FFFFFF;
}

ul li .check{
  display: block;
  position: absolute;
  border: 5px solid #AAAAAA;
  border-radius: 100%;
  height: 25px;
  width: 25px;
  top: 30px;
  left: 20px;
	z-index: 5;
	transition: border .25s linear;
	-webkit-transition: border .25s linear;
}

ul li:hover .check {
  border: 5px solid #FFFFFF;
}

ul li .check::before {
  display: block;
  position: absolute;
	content: '';
  border-radius: 100%;
  height: 15px;
  width: 15px;
  top: 5px;
	left: 5px;
  margin: auto;
	transition: background 0.25s linear;
	-webkit-transition: background 0.25s linear;
}

input[type=radio]:checked ~ .check {
  border: 5px solid #0DFF92;
}

input[type=radio]:checked ~ .check::before{
  background: #0DFF92;
}

input[type=radio]:checked ~ label{
  color: #0DFF92;
}

.signature {
	margin: 10px auto;
	padding: 10px 0;
	width: 100%;
}

.signature p{
	text-align: center;
	font-family: Helvetica, Arial, Sans-Serif;
	font-size: 0.85em;
	color: #AAAAAA;
}

.signature .much-heart{
	display: inline-block;
	position: relative;
	margin: 0 4px;
	height: 10px;
	width: 10px;
	background: #AC1D3F;
	border-radius: 4px;
	-ms-transform: rotate(45deg);
    -webkit-transform: rotate(45deg);
    transform: rotate(45deg);
}

.signature .much-heart::before, 
.signature .much-heart::after {
	  display: block;
  content: '';
  position: absolute;
  margin: auto;
  height: 10px;
  width: 10px;
  border-radius: 5px;
  background: #AC1D3F;
  top: -4px;
}

.signature .much-heart::after {
	bottom: 0;
	top: auto;
	left: -4px;
}

.signature a {
	color: #AAAAAA;
	text-decoration: none;
	font-weight: bold;
}


/* Styles for alert... 
by the way it is so weird when you look at your code a couple of years after you wrote it XD */

.alert {
	box-sizing: border-box;
	background-color: #0DFF92;
	width: 100%;
	position: relative; 
	top: 0;
	left: 0;
	z-index: 300;
	padding: 20px 40px;
	color: #333;
}

.alert h2 {
	font-size: 22px;
	color: #232323;
	margin-top: 0;
}

.alert p {
	line-height: 1.6em;
	font-size:18px;
}

.alert a {
	color: #232323;
	font-weight: bold;
}

/* Above line is used for online Google font */
hr{
border:0;
border-top:1px solid #ccc;
margin-bottom:-10px
}
div#main{
width:828px;
height:764px;
margin:0 auto;
font-family:'Lato', sans-serif;
}
div#first{
width:350px;
height:740px;
padding:0 25px 20px;
float:left;
text-align:center
}
.btn{
width:260px;
height:50px;
margin-left:45px
}
.button2{
width:250px;
height:45px;
border:none;
outline:none;
color:#fff;
margin-top:20px;
font-size:14px;
background-color:#00FF7F;
text-shadow:0 1px rgba(0,0,0,0.4);
font-weight:700;
background-image:url(../images/1.png);
background-repeat:no-repeat;
background-position:200px
}
.button2:hover{
background-color:#878787;
cursor:pointer
}
.button2:active{
padding-top:2px;
box-shadow:none
}


   </style>
            
    </head>
    <body>
         <% Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","PJFLAB07020103");
            String sql_query="select fname from cand";
              PreparedStatement pstmt=conn.prepareStatement(sql_query);
              
              ResultSet rs=pstmt.executeQuery();
              %>
     
   <div class="alert">
	<h2>Please check again the candidate you wish to vote for!</h2>
	
</div>

<div class="container">
    	     
    <form action="Success" method="POST" >
	
  <ul>
   <%while(rs.next())
              {
                    %>   
  <li>
       
      <input type="radio" name="cand" id="<%=rs.getString(1)%>" value="<%=rs.getString(1)%>">
      <label for="<%=rs.getString(1)%>"><%=rs.getString(1)%></label>
    
    <div class="check"></div>
    
  </li>
   <%}%>
  
  <li>
      <div class="btn">
      <input type="submit" class="button2" value="Submit">
      </div>
  </li>
</ul>
     
</form>
</div>




    </body>
</html>

