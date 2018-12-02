<%-- 
    Document   : admin
    Created on : Dec 2, 2018, 8:04:50 PM
    Author     : Hp
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver by loading driver class
            //calling the method of by class name cuz DriverManager is static
           //class DBConnection implements Connection
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","PJFLAB07020103");
            String query1="select fname,vote from cand";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            ResultSet rs=pstmt.executeQuery();
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

 td,  th {
    border: 1px solid #ddd;
    padding: 8px;
}

 tr:nth-child(even){background-color: #f2f2f2;}

 tr:hover {background-color: #ddd;}

th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
            </style>
    </head>
    <body>
        <table>
            <tr><th>Full Name</th><th>Vote Count</th></tr>
            <%while(rs.next())
            {%>
            <tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td></tr>
            <%}%>
        </table>
    </body>
</html>
