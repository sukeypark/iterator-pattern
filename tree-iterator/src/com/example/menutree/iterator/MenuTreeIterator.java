package com.example.menutree.iterator;

import java.util.Iterator;

import com.example.menutree.MenuTree;
import com.example.node.MenuItem;

public abstract class MenuTreeIterator implements Iterator<MenuItem> {

    private MenuTree menuTree;

    private MenuItem currentItem;

    public MenuTreeIterator(MenuTree menuTree) {
        this.menuTree = menuTree;
        this.currentItem = menuTree.getRoot();
    }

    public MenuTree getMenuTree() {
        return menuTree;
    }

    public void setMenuTree(MenuTree menuTree) {
        this.menuTree = menuTree;
    }

    public MenuItem getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(MenuItem currentItem) {
        this.currentItem = currentItem;
    }

    @Override
    abstract public boolean hasNext();

    @Override
    abstract public MenuItem next();

}
