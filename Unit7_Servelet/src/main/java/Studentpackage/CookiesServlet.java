package Studentpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String n = request.getParameter("uname");

		out.print("welcome " + n);

		Cookie ck = new Cookie("name", n);
		
		ck.setMaxAge(60 * 60 * 24); // expiry date in seconds
		
		response.addCookie(ck); // saves the name coming from html page as a cookie
//Creating submit button
		out.println("<form action='ReadServlet' method='GET'>");
		out.println("<input type='submit' value='GO'>");
		out.println("</form>");
		out.close();
}
}
