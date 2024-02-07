package com.example;

import java.util.Iterator;

public class MenuTree implements Iterable<MenuItem> {

    private MenuItem root;

    @Override
    public Iterator<MenuItem> iterator() {
        return new MenuTreeIterator(this);
    }

    public MenuItem getRoot() {
        return root;
    }

    public void addItem() {
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }

}
