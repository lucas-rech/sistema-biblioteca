package com.lucasrech.data;

import com.lucasrech.model.Book;
import com.lucasrech.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private final List<User> users;
    private final List<Book> books;


    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

   public void addUser(User user) {
        users.add(user);
   }

   public void removeUser(Integer id) {
      User userToRemove = getUser(id);
      users.remove(userToRemove);
   }

   public void addBook(Book book) {
        books.add(book);
   }

   public void removeBook(Integer id) {
        Book bookToRemove = getBook(id);
        books.remove(bookToRemove);
   }

   public void changeBook(Integer id, Book changedBook) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(changedBook.getTitle());
                book.setAuthor(changedBook.getAuthor());
                book.setGenre(changedBook.getGenre());
                book.setPublicationDate(changedBook.getPublicationDate());
                book.setTotalQuantity(changedBook.getTotalQuantity());
                book.setAvailableQuantity(changedBook.getAvailableQuantity());
            }
        }
   }

   public void changeBookTotalQuantity(Integer id, Integer newTotalQuantity) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTotalQuantity(newTotalQuantity);
            }
        }
   }

   public void changeBookAvailableQuantity(Integer id, Integer newAvailableQuantity) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setAvailableQuantity(newAvailableQuantity);
            }
        }
   }

   public Book getBook(Integer id) {
        return books.stream().filter(book -> Objects.equals(book.getId(), id)).findFirst().orElse(null);
   }

   public User getUser(Integer id) {
        return users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst().orElse(null);
   }

}
