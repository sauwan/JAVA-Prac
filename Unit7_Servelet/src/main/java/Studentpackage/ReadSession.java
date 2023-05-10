package Studentpackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ReadSession")
public class ReadSession extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession session = request.getSession(false);
String n = (String) session.getAttribute("uname");
out.print("Hello:" + n);
}
}