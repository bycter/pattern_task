package org.example.prototype;

public interface Prototype<T> {

    /**
     * Returns new cloned object of current.
     * @return new cloned object
     */
    T clone();
}
