package com.example;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MenuTree implements Iterable<MenuItem> {

    private MenuItem root;

    @Override
    public Iterator<MenuItem> iterator() {
        return new MenuTreeIterator(this);
    }

    public MenuItem getRoot() {
        return root;
    }

    public void addItem(MenuItem menuItem) {
        if (root == null) {
            root = menuItem;
            return;
        }
        Queue<MenuItem> q = new ArrayBlockingQueue<>(50);
        q.add(root);
        MenuItem parent = null;
        while ((parent = q.poll()) != null) {
            if (parent.getLeft() != null) {
                q.add(parent.getLeft());
                if (parent.getRight() != null) {
                    q.add(parent.getRight());
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        if (parent.getLeft() == null) {
            parent.setLeft(menuItem);
        } else if (parent.getRight() == null) {
            parent.setRight(menuItem);
        }
    }

    public void print() {
        Queue<MenuItem> q = new ArrayBlockingQueue<>(50);
        q.add(root);

        int level = 0;
        int count = 0;
        MenuItem current = null;

        while ((current = q.poll()) != null) {
            System.out.print(current.getName() + " ");
            count++;
            if (current.getLeft() != null) {
                q.add(current.getLeft());
                if (current.getRight() != null) {
                    q.add(current.getRight());
                }
            }
            if (count == Math.pow(2, level)) {
                System.out.print("\n");
                count = 0;
                level++;
            }
        }
    }

    public static void main(String[] args) {
        MenuTree tree = new MenuTree();
        for (int i = 0; i < 16; i++) {
            tree.addItem(new MenuItem("menu" + i, "menu" + i, 0));
        }
        tree.print();
    }

}
