package com.example.cdi_seminarium.manual_di;

import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/manual-di")
public class ManualDIServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Printer printer = new Printer(new SimpleMessage());

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + printer.printMessage() + "</h1>");
        out.println("</body></html>");
    }

}
