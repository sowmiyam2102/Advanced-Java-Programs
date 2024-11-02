/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class biodata extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String s1=request.getParameter("txtname");
           int mark=Integer.parseInt(request.getParameter("pm"));
           String r=request.getParameter("radgen");
           String ck1=request.getParameter("c1");
           String ck2=request.getParameter("c2");
           String ck3=request.getParameter("c3");
           String ck4=request.getParameter("c4");
           boolean c1=request.getParameter("c1")!=null;
           boolean c2=request.getParameter("c2")!=null;
           boolean c3=request.getParameter("c3")!=null;
           boolean c4=request.getParameter("c4")!=null;
           out.println("<html>");
           out.println("<body>");
           out.println("<center>");
           out.println("<br> BIO-DATA </br>");
           out.println("Name Of Sudent:" +s1+"<br>");
           out.println("Gender:" +r+"<br>");
           out.println("Languages Known"+"<br>");
           if(c1==true)
               out.println(" " +ck1+ "<br>");
           if(c2==true)
               out.println(" " +ck2+ "<br>");
           if(c3==true)
               out.println(" " +ck3+ "<br>");
           if(c4==true)
               out.println(" " +ck4+ "<br>");
        out.println("Percentage of marks:" +mark+ "<br>");
        out.println("</center>");
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
