package org.example.visitor.visitorImpl;

import org.example.visitor.Cat;
import org.example.visitor.Dolphin;
import org.example.visitor.Person;

public interface Visitor {

    void visitCat(Cat cat);

    void visitDolphin(Dolphin dolphin);

    void visitPerson(Person person);
}
