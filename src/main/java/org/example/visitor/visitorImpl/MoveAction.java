package org.example.visitor.visitorImpl;

import org.example.visitor.Cat;
import org.example.visitor.Dolphin;
import org.example.visitor.Person;

public class MoveAction implements Visitor {

    @Override
    public void visitCat(Cat cat) {
        System.out.println("CAT: some action for MOVE");
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        System.out.println("DOLPHIN: some action for MOVE");
    }

    @Override
    public void visitPerson(Person person) {
        System.out.println("PERSON: some action for MOVE");
    }
}
