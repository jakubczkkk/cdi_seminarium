package com.example.cdi_seminarium.item_dao_example;

import java.util.ArrayList;
import java.util.List;

public class AnotherItemDao implements ItemDao {

    @Override
    public List<String> fetchItems() {
        List<String> results = new ArrayList<>();
        results.add("One");
        results.add("Two");
        return results;
    }

}
