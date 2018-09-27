

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Why won't you work...
 * @author D070512
 */
@WebServlet(name = "Home", urlPatterns = {""})
public class Home extends HttpServlet {

    private final String Home = "WEB-INF/Home.jsp";
    
    /**
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        request.getRequestDispatcher(Home).forward(request, response);
    }
     /**
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getSession().setAttribute("name", request.getParameter("Name"));
        request.getSession().setAttribute("message", request.getParameter("Message"));
        response.sendRedirect(request.getRequestURI());
    }
}
