package com.example;

import java.util.Iterator;

public class MenuTree implements Iterable<MenuItem> {

    MenuItem root;

    public MenuTree(MenuItem root) {
        this.root = root;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new MenuTreeIterator();
    }

}
