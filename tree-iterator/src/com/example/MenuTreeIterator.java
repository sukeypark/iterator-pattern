package com.example;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MenuTreeIterator implements Iterator<MenuItem> {

    private MenuTree menuTree;

    private Queue<MenuItem> q = new ArrayBlockingQueue<>(50);

    public MenuTreeIterator(MenuTree menuTree) {
        this.menuTree = menuTree;
        this.traverse(menuTree.getRoot());
    }

    private void traverse(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        traverse(menuItem.getLeft());
        q.add(menuItem);
        traverse(menuItem.getRight());
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }

    @Override
    public MenuItem next() {
        return q.poll();
    }

}
