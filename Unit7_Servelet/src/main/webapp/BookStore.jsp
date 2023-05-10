<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book jsp</title>
<%@page import="Studentpackage.Database" %>
<%@page import="java.sql.*" %>
</head>
<body>
<%
String isbn = request.getParameter("isbn");
String title = request.getParameter("title");
String author = request.getParameter("author");
int price = Integer.parseInt(request.getParameter("price"));
String edition = request.getParameter("edition");
String publication = request.getParameter("publication");

Connection con = new Database().getcon();
Statement statement = con.createStatement();
ResultSet set;

String insert = "INSERT INTO book_tbl VALUES('" + isbn + "','" + title + "','" + author + "','" + price + "','"+ edition + "','" + publication + "')";
statement.executeUpdate(insert);
set = statement.executeQuery("SELECT * FROM book_tbl");
%>
<table border =2>
<th>Isbn</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
<th>Edition</th>
<th>Publication</th>
<%
while(set.next())
{
	out.println("<tr>");
	out.println("<td>"+set.getString("isbn")+"</td>");
	out.println("<td>"+set.getString("title")+"</td>");
	out.println("<td>"+set.getString("author")+"</td>");
	out.println("<td>"+set.getInt("price")+"</td>");
	out.println("<td>"+set.getString("edition")+"</td>");
	out.println("<td>"+set.getString("publication")+"</td>");
	out.println("</tr>");
	}
%>
</table>

</body>
</html>