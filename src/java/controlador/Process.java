/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String password = request.getParameter("password");
            String description = request.getParameter("description");
            String maths = request.getParameter("M");        
            String physics = request.getParameter("F");         
            
            String subject = request.getParameter("subject");
            String dropdown = request.getParameter("dropdown");
            String pagename = request.getParameter("pagename");
            String [] cars = request.getParameterValues("car");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Prueba como capturar datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario, datos recibidos " + request.getContextPath() + "</h1>");
            out.println("<h1>" + first_name + "</h1>");
            out.println("<h1>" + last_name + "</h1>");
            out.println("<h1>" + password + "</h1>");
            out.println("<h1>" + description + "</h1>");
            out.println("<h1>" + maths + "</h1>");
            out.println("<h1>" + physics + "</h1>");
            out.println("<h1>" + subject + "</h1>");
            out.println("<h1>" + dropdown + "</h1>");
            out.println("<h1>" + pagename + "</h1>");
            
            for(String car: cars)
                out.println("<h1>" + car + "</h1>");
            
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
