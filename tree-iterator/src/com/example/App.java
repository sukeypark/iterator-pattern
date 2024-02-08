package com.example;

import com.example.menutree.MenuTree;
import com.example.menutree.PreorderMenuTree;
import com.example.node.MenuItem;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new PreorderMenuTree();
        /*
         * Add tree items
         */

        for (MenuItem menuItem : menuTree) {
            menuItem.print();
        }
    }
}
