package org.example.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardBox implements Cost {

    private final List<Cost> innerItems = new ArrayList<>();
    private int costValue = 10;

    public StandardBox(Integer costValue, Cost... innerItems) {
        this.innerItems.addAll(Arrays.asList(innerItems));
        this.costValue = costValue != null ? costValue : this.costValue;
    }

    @Override
    public int getCost() {
        int costOfBox = costValue;
        for (Cost innerItem : innerItems) {
            costOfBox += innerItem.getCost();
        }
        return costOfBox;
    }
}
