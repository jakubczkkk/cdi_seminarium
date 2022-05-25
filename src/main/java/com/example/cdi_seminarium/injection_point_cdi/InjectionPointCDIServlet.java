package com.example.cdi_seminarium.injection_point_cdi;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/injection-point")
public class InjectionPointCDIServlet extends HttpServlet {

    @Inject
    private PrinterConstructor printerConstructor;

    @Inject
    private PrinterSetter printerSetter;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + printerConstructor.printMessage() + "</h1>");
        out.println("<h1>" + printerSetter.printMessage() + "</h1>");
        out.println("</body></html>");
    }

}