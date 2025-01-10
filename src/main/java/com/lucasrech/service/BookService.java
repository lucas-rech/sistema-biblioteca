package com.lucasrech.service;

import com.lucasrech.data.Library;
import com.lucasrech.model.Book;


//TODO: Criar método para emprestar livros a usuários
public class BookService {
    private final Library library;

    public BookService(Library library) {
        this.library = library;
    }

    public void addNewBook(Book book) {
        if(book != null) {
            if (
                    book.getTitle().isEmpty()
                    || book.getAuthor().isEmpty()
                    || book.getTotalQuantity() == 0
            ) {
                System.out.println("Não foi possível inserir o livro. Dados obrigatórios não informados\n" + book);
            }
            library.addBook(book);
        }

    }

    //TODO: Lógica de validação.
    public void removeBook(Integer id) {
        library.removeBook(id);
    }

    //TODO: Lógica de validação.
    public void changeTotalQuantity(Integer id, Integer quantity) {
        library.changeBookTotalQuantity(id, quantity);
    }

    //TODO: Lógica de validação.
    public void changeAvailableQuantity(Integer id, Integer quantity) {
        library.changeBookAvailableQuantity(id, quantity);
    }

}
