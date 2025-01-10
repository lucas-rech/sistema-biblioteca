package com.lucasrech;

import com.lucasrech.view.Menu;


public class Main {
    public static void main(String[] args) {
        Container c = new Container();
        Menu menu = c.getMenu();

        menu.start();
    }
}