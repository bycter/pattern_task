package org.example.visitor;

import org.example.visitor.visitorImpl.Visitor;

public class Cat implements Element {

    private int height;
    private int weight;
    private int color;
    private int woolType;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWoolType() {
        return woolType;
    }

    public void setWoolType(int woolType) {
        this.woolType = woolType;
    }
}
