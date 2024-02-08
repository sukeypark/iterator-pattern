package com.example;

public class Waitress {

    private Iterable<MenuItem> menu;

    public Waitress(Iterable<MenuItem> menu) {
        this.menu = menu;
    }

    public void printMenuItems() {
        for (MenuItem menuItem : menu) {
            menuItem.print();
        }
    }

}
