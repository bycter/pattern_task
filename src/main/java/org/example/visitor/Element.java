package org.example.visitor;

import org.example.visitor.visitorImpl.Visitor;

public interface Element {

    /**
     * Call one of visitor method related to specific class
     * @param visitor object which is implementation if Visitor interface
     */
    void accept(Visitor visitor);
}
