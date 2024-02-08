package com.example.menutree;

import java.util.Iterator;

import com.example.menutree.iterator.MenuTreeIterator;
import com.example.node.MenuItem;

public abstract class MenuTree implements Iterable<MenuItem> {

    private MenuItem root;

    @Override
    public Iterator<MenuItem> iterator() {
        return createIterator();
    }

    public MenuItem getRoot() {
        return root;
    }

    public void addItem() {
        throw new UnsupportedOperationException("Unimplemented method 'addItem'");
    }

    abstract protected MenuTreeIterator createIterator();

}
