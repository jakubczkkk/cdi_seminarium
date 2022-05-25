package com.example.cdi_seminarium.produces_cdi;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/produces-cdi")
public class ProducesCDIServlet extends HttpServlet {

    @Inject
    private Printer printer;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + printer.printMessage() + "</h1>");
        out.println("<h1>" + printer.printTime() + "</h1>");
        out.println("</body></html>");

    }
}
