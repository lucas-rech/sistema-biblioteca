package com.lucasrech;

import com.lucasrech.data.Library;
import com.lucasrech.service.BookService;
import com.lucasrech.service.UserService;
import com.lucasrech.view.Menu;

public class Container {
    private final Menu menu;

    public Container() {
        Library library = new Library();
        BookService bookService = new BookService(library);
        UserService userService = new UserService(library);
        this.menu = new Menu(bookService, userService);
    }

    public Menu getMenu() {
        return menu;
    }
}
