import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = (String) request.getSession().getAttribute("username");
            if(username !=null) {
                if (request.getSession().getAttribute("username").equals("admin") && request.getSession().getAttribute("password").equals("password")) {
                    request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
                } else {
                    response.sendRedirect("/login");
                }
            } else{
                response.sendRedirect("/login");
            }
    }
}
