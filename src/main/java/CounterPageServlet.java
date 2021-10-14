import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CounterServlet", urlPatterns = "/counter")
public class CounterPageServlet extends HttpServlet {
    protected int counter = 0;
    protected void setCounter(int newCounter) {
        counter = newCounter;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        setCounter(counter+1);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        int counter = Integer.parseInt(req.getParameter("count"));
        out.println("<h1>There have been " + counter + " visits to this page!</h1>");
    }
}
