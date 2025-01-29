package org.example.visitor;

import org.example.visitor.visitorImpl.Visitor;

public class Dolphin implements Element {

    private int length;
    private int tailType;
    private int color;
    private int skinType;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDolphin(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTailType() {
        return tailType;
    }

    public void setTailType(int tailType) {
        this.tailType = tailType;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSkinType() {
        return skinType;
    }

    public void setSkinType(int skinType) {
        this.skinType = skinType;
    }
}
