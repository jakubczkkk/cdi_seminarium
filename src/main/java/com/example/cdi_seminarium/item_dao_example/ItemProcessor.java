package com.example.cdi_seminarium.item_dao_example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.PrintWriter;
import java.util.List;

@Named
@RequestScoped
public class ItemProcessor {

    @Inject
    @Demo
    private ItemDao itemDao;

    public void execute(PrintWriter out) {
        List<String> items = itemDao.fetchItems();
        for (String str : items) {
            out.println("<h1>" + str + "</h1>");
        }
    }
}
