package com.example.cdi_seminarium.item_dao_example;


import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/item-dao-example")
public class ItemDaoServlet extends HttpServlet {

    @Inject
    private ItemProcessor itemProcessor;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");



        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        itemProcessor.execute(out);
        out.println("</body></html>");

    }
}
