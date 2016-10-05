/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjavaee001.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author t-ito
 */
@WebServlet(name = "HttpHeaderServlet", urlPatterns = {"/HttpHeaderServlet"})
public class HttpHeaderServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
	    /* TODO output your page here. You may use following sample code. */
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet HttpHeaderServlet</title>");
	    out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=8\" />");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Servlet HttpHeaderServlet at " + request.getContextPath() + "</h1>");
	    out.println("<hr />");
	    
	    out.println("<h2>HTTPリクエストヘッダー</h2><br />");
	    Enumeration headerNamesReq = request.getHeaderNames();
	    while (headerNamesReq.hasMoreElements()) {
		String name = (String) headerNamesReq.nextElement();
		Enumeration headervals = request.getHeaders(name);
		while (headervals.hasMoreElements()) {
		    String val = (String) headervals.nextElement();
		    out.println(name);
		    out.println(":");
		    out.println(val);
		    out.println("<br />");
		}
	    }
	    out.println("<hr />");
	    
	    out.println("<h2>HTTPレスポンスヘッダー</h2><br />");
	    response.addHeader("Additional", "俺");
	    Collection<String> headerNamesRes = response.getHeaderNames();
	    headerNamesRes.stream().forEach(e ->
		    out.println(e + ":" + response.getHeaders(e) + "<br />"));
	    out.println("<hr />");
	    
	    out.println("</body>");
	    out.println("</html>");

//	    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
//	    out.println("<!DOCTYPE html>");
	    
//	    out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
//	    out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
//	    out.println("<head>");
//	    out.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />");
//	    out.println("<title>SAMPLE</title>");
//	    out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7\" />");
//	    out.println("<style type=\"text/css\">");
//	    out.println("body {");
//	    out.println("  margin-top: 30px;");
//	    out.println("}");
//	    out.println("div {");
//	    out.println("  background-color: yellow;");
//	    out.println("  width: 200px;");
//	    out.println("  line-height: 50px;");
//	    out.println("  text-align: center;");
//	    out.println("  font-size: 2em;");
//	    out.println("}");
//	    out.println("");
//	    out.println("div {");
//	    out.println("  outline: solid 10px limegreen;");
//	    out.println("  margin: auto;");
//	    out.println("}");
//	    out.println("</style>");
//	    out.println("</head>");
//	    out.println("<body>");
//	    out.println("<div>HELLO</div>");
//	    out.println("</body>");
//	    out.println("</html>");
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
