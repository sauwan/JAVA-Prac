package Studentpackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SetSession")
public class SetSession extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("uname");
		out.println("Welcome" + ": " + n);
		HttpSession session = request.getSession();
		session.setAttribute("uname", n);
		out.print("<a href='ReadSession'>Visit Here</a>");
	}
}