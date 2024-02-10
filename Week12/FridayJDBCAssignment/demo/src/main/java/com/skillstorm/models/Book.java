package com.skillstorm.models;

public class Book {
    private int ISBN;
    private String title;
    private String author;
    private float price;
    private int numInStock;

    public Book(int ISBN, String title, String author, float price, int numInStock) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.numInStock = numInStock;
    }

    public int getISBN() {
        return ISBN;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ISBN;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + numInStock;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (ISBN != other.ISBN)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        if (numInStock != other.numInStock)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", price=" + price + ", numInStock="
                + numInStock + "]";
    }
}
