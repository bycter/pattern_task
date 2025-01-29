package org.example.visitor;

import org.example.visitor.visitorImpl.Visitor;

public interface Element {

    void accept(Visitor visitor);
}
