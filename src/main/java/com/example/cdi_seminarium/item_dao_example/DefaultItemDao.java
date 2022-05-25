package com.example.cdi_seminarium.item_dao_example;

import java.util.ArrayList;
import java.util.List;

@Demo
public class DefaultItemDao implements ItemDao {

    @Override
    public List<String> fetchItems() {
        List<String> results = new ArrayList<>();
        results.add("Three");
        results.add("Four");
        return results;
    }

}
