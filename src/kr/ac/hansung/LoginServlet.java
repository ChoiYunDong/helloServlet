package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request부분에 사용자가 입력한 Username과 Password가 넘어온다.
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//DB ACCESS...
		//Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> your name is " + username + "<br/>";
		htmlResponse += " your password is " + password + "</h2>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}

}
