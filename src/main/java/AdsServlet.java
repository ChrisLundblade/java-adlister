import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads listAdsDao = DaoFactory.getAdsDao();
        //ListAdsDao listAdsDao = new ListAdsDao();
        List<Ad> ads = listAdsDao.all();
        //List<Ad> ads = DaoFactory.getAdsDao();

    request.setAttribute("ads", ads);
    request.getRequestDispatcher("ads/index.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
