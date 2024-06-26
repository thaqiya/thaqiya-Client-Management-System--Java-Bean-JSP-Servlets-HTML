package JAVA_PROJECT;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteClientServlet
 */
@WebServlet("/DeleteClientServlet")
public class DeleteClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        int id = Integer.parseInt(request.getParameter("clientId"));
	        try {
	            ClientDAO.deleteClient(id);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        response.sendRedirect("ClientListServlet");
	    }

}
