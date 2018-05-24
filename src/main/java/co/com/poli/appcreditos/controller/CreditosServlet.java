/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.controller;

import co.com.poli.appcreditos.business.implementation.CreditoBusinessImpl;
import co.com.poli.appcreditos.model.Credito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giovanny
 */
public class CreditosServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CreditoBusinessImpl cBusinessImpl = new CreditoBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String numCredito = request.getParameter("txtNumeroCredito");
                String documento = request.getParameter("txtDocumento");
                String nombres = request.getParameter("txtNombres");
                String apellidos = request.getParameter("txtApellidos");
                int monto = Integer.parseInt(request.getParameter("txtMonto"));
                String TipoTrabajador = request.getParameter("txtTipoTrabajador");
                String TipoCredito = request.getParameter("txtTipoCredito");
                Boolean esTrabajador = Boolean.valueOf(request.getParameter("txtEsTrabajador"));
                Credito credito = new Credito(numCredito, documento, nombres, apellidos, monto, TipoTrabajador, TipoCredito, esTrabajador);

                String mensaje = cBusinessImpl.registrarCredito(credito);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "mas utilizado":
                break;
            case "mayor acumulado":
                break;
            case "mayores prestadores":
                break;
            case "listar":
                List<Credito> creditos = cBusinessImpl.obtenerListaCredito();
                session.setAttribute("LISTADO", creditos);
                rd = request.getRequestDispatcher("/view/CreditoLista.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);

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
