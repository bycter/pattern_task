package org.example.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardBox implements Cost {

    private final List<Cost> innerItems = new ArrayList<>();
    private final int boxCost;

    public StandardBox(Integer boxCost, Cost... innerItems) {
        this.innerItems.addAll(Arrays.asList(innerItems));
        this.boxCost = boxCost;
    }

    @Override
    public int getCost() {
        int costOfBox = boxCost;
        for (Cost innerItem : innerItems) {
            costOfBox += innerItem.getCost();
        }
        return costOfBox;
    }
}
