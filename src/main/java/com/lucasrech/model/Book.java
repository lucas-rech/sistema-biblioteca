package com.lucasrech.model;

import java.util.Date;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String genre;
    private Date publicationDate;
    private int totalQuantity;
    private int availableQuantity;

    public Book(String title, String author, String genre, Date publicationDate, int totalQuantity) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationDate = publicationDate;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = totalQuantity;

    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


    @Override
    public String toString() {
        return "Título:" + getTitle() + "\n" +
                "Autor: " + getAuthor() + "\n" +
                "Gênero" + getGenre() + "\n" +
                "Data de publicação: " + getPublicationDate() + "\n" +
                "Total de quantidade: " + getTotalQuantity() + "\n" +
                "Quantidade disponível: " + getAvailableQuantity() + "\n";
    }
}
