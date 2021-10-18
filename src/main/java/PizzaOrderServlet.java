import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
        //doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String[] toppings = request.getParameterValues("toppings");
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
        System.out.println("Order for a " + size + " pizza with " + crust + " crust, " + sauce + " sauce, and the following toppings:" );
        //System.out.println(toppings.toString());
        for(String topping : toppings){
            System.out.print(topping+" ");
        }
        System.out.println("\nTo be delivered to " + address + ".");
    }
}