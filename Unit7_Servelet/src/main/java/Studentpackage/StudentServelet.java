package Studentpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.ClassNotFoundException;

public class StudentServelet extends HttpServlet {
	Connection con;
	Statement statement;
	ResultSet set;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");

		out.println("My id is" + " " + id + " " + "and my name is <h2 style='color:red'>name</h2>");
		// database connection
		try {
			con = new Database().getcon();
			statement = con.createStatement();
			String addstudent = "INSERT INTO Student_tbl VALUES('" + id + "','" + name + "')";
			statement.executeUpdate(addstudent);
			set = statement.executeQuery("SELECT * FROM Student_tbl");
			out.println("<table border='2'>");
			out.println("<th>ID</th>");
			out.println("<th>NAME</th>");
			while (set.next()) {
				out.println("<tr>");
				out.println("<td>" + set.getInt("id") + "</td>");
				out.println("<td>" + set.getString("studentname") + "</td>");
				out.println("</tr>");

			}
			out.println("</table>");

		} catch (Exception e) {
		}
	}

 
}
