package org.example.visitor;

import org.example.visitor.visitorImpl.AttackAction;
import org.example.visitor.visitorImpl.MoveAction;
import org.example.visitor.visitorImpl.RunAction;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.accept(new AttackAction());

        Dolphin dolphin = new Dolphin();
        dolphin.accept(new MoveAction());

        Person person = new Person();
        person.accept(new RunAction());
    }
}