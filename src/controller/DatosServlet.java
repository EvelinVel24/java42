package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DatosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        String empresa = request.getParameter("empresa");
        String ciudad = request.getParameter("ciudad");
        String pais = request.getParameter("pais");

        int cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
        int cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));

        // Set attributes to forward to the next servlet
        request.setAttribute("nombre", nombre);
        request.setAttribute("direccion", direccion);
        request.setAttribute("empresa", empresa);
        request.setAttribute("ciudad", ciudad);
        request.setAttribute("pais", pais);
        request.setAttribute("cantidad1", cantidad1);
        request.setAttribute("cantidad2", cantidad2);

        RequestDispatcher dispatcher = request.getRequestDispatcher("FacturaServlet");
        dispatcher.forward(request, response);
    }
}
