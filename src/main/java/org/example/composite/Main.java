package org.example.composite;

public class Main {

    public static void main(String[] args) {
        // level 2
        InnerItem itemPhone = new InnerItem("phone", 500);
        InnerItem itemLaptop = new InnerItem("laptop", 1000);
        InnerItem itemBook = new InnerItem("book", 100);
        StandardBox standardBox2 = new StandardBox(10, itemPhone, itemLaptop, itemBook);
        // cost = 1610

        // level 1
        InnerItem itemCalculator = new InnerItem("calculator", 50);
        StandardBox standardBox1_0 = new StandardBox(20, itemCalculator, standardBox2);

        InnerItem itemBrush = new InnerItem("brush", 50);
        StandardBox standardBox1_1 = new StandardBox(20, itemBrush);
        // cost = 140 + 1610 = 1750

        // level 0
        InnerItem itemMouse = new InnerItem("mouse", 200);
        StandardBox standardBox0 = new StandardBox(30, standardBox1_0, standardBox1_1, itemMouse);
        // cost = 230 + 1750 = 1980

        System.out.println("All box cost: " + standardBox0.getCost());
    }
}
