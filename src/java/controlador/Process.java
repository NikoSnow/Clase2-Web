package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.BaseDatos;

/**
 *
 * @author Nico
 */
public class Process extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * Request 
     * Response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String cedula = request.getParameter("cedula");
            String programa = request.getParameter("programa");
            String cat = request.getParameter("cat");
            String tp = request.getParameter("tp");
            String dropdown = request.getParameter("dropdown");        
            String [] equipos = request.getParameterValues("equipo");
            String fechaprestamo = request.getParameter("fechaprestamo");
            String fecharetorno = request.getParameter("fecharetorno");
            //String pagename = request.getParameter("pagename");
            StringBuffer cadena2 = new StringBuffer();
            for (int x=0;x<equipos.length;x++){
                cadena2 = cadena2.append(equipos[x]+",");
}
            String cadena = nombre + "," +cedula + "," + programa + "," + cat + "," + tp + "," + dropdown + "," + cadena2  + fechaprestamo + "," + fecharetorno;
            BaseDatos basdat = new BaseDatos();
            basdat.persistir(cadena);
                                
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Confirmacion de prestamo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario de prestamo diligenciado</h1>");
            out.println("<h4>Prestamo a nombre de " + nombre + "</h4>");
            out.println("<h4>Tipo de practica: " + tp + "</h4>");
            out.println("<h4>Se va a realizar en el salon: " + dropdown + "</h4>");
            out.println("<h3>Los equipos que ha solicitado son</h3>");
                out.println("<ul>");
                for(String equipo: equipos)
                out.println("<li>" + equipo + "</li>");
                out.println("</ul>");
            out.println("<h3>Recuerde que debe devolver los equipos el</h3>");
            out.println("<h4>" + fecharetorno + "</h4>");
            out.println("</body>");
            out.println("</html>");
            
                
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
