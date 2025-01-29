package org.example.visitor.visitorImpl;

import org.example.visitor.Cat;
import org.example.visitor.Dolphin;
import org.example.visitor.Person;

public class AttackAction implements Visitor {

    @Override
    public void visitCat(Cat cat) {
        System.out.println("CAT: some action for ATTACK");
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        System.out.println("DOLPHIN: some action for ATTACK");
    }

    @Override
    public void visitPerson(Person person) {
        System.out.println("PERSON: some action for ATTACK");
    }
}
