package study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{
	private static final Logger log = LoggerFactory.getLogger(WelcomeServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.debug("Serlvet Start!!");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Servlet Start!!</h1>");
	}

}
