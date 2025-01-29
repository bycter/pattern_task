package org.example.composite;

public class InnerItem implements Cost {

    private String itemName;
    private int itemCost;

    public InnerItem(String itemName, int itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    @Override
    public int getCost() {
        return itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }
}
