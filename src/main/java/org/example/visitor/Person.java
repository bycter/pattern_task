package org.example.visitor;

import org.example.visitor.visitorImpl.Visitor;

public class Person implements Element {

    private int height;
    private int footSize;
    private int hairColor;
    private int languageUsed;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPerson(this);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    public int getHairColor() {
        return hairColor;
    }

    public void setHairColor(int hairColor) {
        this.hairColor = hairColor;
    }

    public int getLanguageUsed() {
        return languageUsed;
    }

    public void setLanguageUsed(int languageUsed) {
        this.languageUsed = languageUsed;
    }
}
