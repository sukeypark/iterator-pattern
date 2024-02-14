package com.example;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MenuTreeIterator implements Iterator<MenuItem> {

    private MenuTree menuTree;

    private Queue<MenuItem> q = new ArrayBlockingQueue<>(50);

    public MenuTreeIterator(MenuTree menuTree) {
        this.menuTree = menuTree;
        this.createQueue(menuTree.getRoot());
    }

    private void createQueue(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        q.add(menuItem);
        createQueue(menuItem.getLeft());
        createQueue(menuItem.getRight());
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
