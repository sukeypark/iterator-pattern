package com.example;

import com.example.menuclient.Waitress;
import com.example.menutree.MenuTree;
import com.example.menutree.PreorderMenuTree;

public class App {
    public static void main(String[] args) throws Exception {

        MenuTree menuTree = new PreorderMenuTree();
        /*
         * Add tree items
         */
        Waitress waitress = new Waitress(menuTree);
        waitress.printMenuItems();

    }
}
