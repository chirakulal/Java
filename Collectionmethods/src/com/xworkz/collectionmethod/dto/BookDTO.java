package com.xworkz.collectionmethod.dto;

public class BookDTO {

    public String title;
    public String author;
    public String publisher;
    public String isbn;
    public int pages;
    public double price;
    public String genre;
    public int edition;
    public boolean hardcover;
    public String language;

    public BookDTO(String title, String author, String publisher, String isbn, int pages, double price, String genre, int edition, boolean hardcover, String language) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;
        this.genre = genre;
        this.edition = edition;
        this.hardcover = hardcover;
        this.language = language;
    }

    public BookDTO() {
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", edition=" + edition +
                ", hardcover=" + hardcover +
                ", language='" + language + '\'' +
                '}';
    }
}
