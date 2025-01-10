package com.lucasrech.service;

import com.lucasrech.data.Library;
import com.lucasrech.model.User;

public class UserService {
    private final Library library;

    public UserService(Library library) {
        this.library = library;
    }

    //TODO: Lógica de validação
    public void addNewUser(User user) {

        library.addUser(user);
    }

    //TODO: Lógica de validação
    public void removeUser(Integer id) {
        library.removeUser(id);
    }
}
