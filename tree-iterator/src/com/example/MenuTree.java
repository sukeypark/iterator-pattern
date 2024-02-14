package com.example;

import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class MenuTree implements Iterable<MenuItem> {

    private MenuItem root;

    private MenuItem tail;

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
            tail = root;
            return;
        }
        MenuItem current = root;
        while (current != null) {
            if (current.getPrice() >= menuItem.getPrice()) {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                } else {
                    current.setLeft(menuItem);
                    break;
                }
            } else {
                if (current.getRight() != null) {
                    current = current.getRight();
                } else {
                    current.setRight(menuItem);
                    break;
                }
            }
        }
        tail = menuItem;
    }

    public void print() {
        Queue<MenuItem> q = new ArrayBlockingQueue<>(100);
        q.add(root);

        int level = 0;
        int count = 0;
        MenuItem current = null;
        MenuItem blankNode = new MenuItem("None", null, -1);

        while ((current = q.poll()) != tail) {
            System.out.print(current.getName() + "|" + current.getPrice() + " ");
            count++;
            if (current.getLeft() != null) {
                q.add(current.getLeft());
            } else {
                q.add(blankNode);
            }
            if (current.getRight() != null) {
                q.add(current.getRight());
            } else {
                q.add(blankNode);
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

        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            tree.addItem(new MenuItem("menu" + i, "menu" + i, Math.abs(rand.nextDouble()) * 10));
        }
        tree.print();
    }

}
