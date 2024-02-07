package com.example;

import java.util.Iterator;

public class MenuTreeIterator implements Iterator<MenuItem> {

    private MenuTree menuTree;

    private MenuItem currentItem;

    public MenuTreeIterator(MenuTree menuTree) {
        this.menuTree = menuTree;
        this.currentItem = menuTree.getRoot();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public MenuItem next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
