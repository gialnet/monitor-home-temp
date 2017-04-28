/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.redmoon.monitor.home.temp;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author antonio
 */
public class AjaxServletTemp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String accion = request.getParameter("accion");
        
       
        Gson gson = new Gson();
        
        switch (accion) {
            case "WriteTemp":
                {
                   String ds1820ID = request.getParameter("uid");
                   String Temperature = request.getParameter("temp");
                   // SQLCustomers myCustomers = new SQLCustomers(xDataBase);
                   // List<TuplasCustomers> ListaCustomer = myCustomers.getTuplasCustomers(Integer.parseInt(pagina),Integer.parseInt(size));
                   // response.getWriter().write(gson.toJson(ListaCustomer));
                    break;
                }
            case "NewDevice":
                {
                   String ds1820ID = request.getParameter("uid");
                   String Locate = request.getParameter("lugar");
                   String Tipo = request.getParameter("modelo");
                   // SQLCustomers myCustomers = new SQLCustomers(xDataBase);
                   // List<TuplasCustomers> ListaCustomer = myCustomers.getTuplasCustomers(Integer.parseInt(pagina),Integer.parseInt(size));
                   // response.getWriter().write(gson.toJson(ListaCustomer));
                    break;
                }    
            default:
                response.getWriter().write("Error, mensaje no conteplado: "+accion);
                break;
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
        return "Gestion de las temperaturas de un conjunto de lugares";
    }// </editor-fold>

}
