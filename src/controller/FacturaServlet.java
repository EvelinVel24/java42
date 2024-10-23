package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FacturaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = (String) request.getAttribute("nombre");
        String empresa = (String) request.getAttribute("empresa");
        String ciudad = (String) request.getAttribute("ciudad");
        String pais = (String) request.getAttribute("pais");

        int cantidad1 = (int) request.getAttribute("cantidad1");
        int cantidad2 = (int) request.getAttribute("cantidad2");

        // Prices for the products
        double precioProducto1 = 50;
        double precioProducto2 = 100;

        // Calculate totals
        double total = (cantidad1 * precioProducto1) + (cantidad2 * precioProducto2);
        double discount = total * 0.10;
        double totalAfterDiscount = total - discount;

        // Set attributes for JSP
        request.setAttribute("total", total);
        request.setAttribute("discount", discount);
        request.setAttribute("totalAfterDiscount", totalAfterDiscount);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Factura.jsp");
        dispatcher.forward(request, response);
    }
}
