package model;

public class Customer {
    private int id;
    private String description;
    private int bookCount;
    private int discount;
    private int priceTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void getDescription(String description) {
        this.description = description;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void getBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getDiscount() {
        return discount;
    }

    public void getDiscount(int discount) {
        this.discount = discount;
    }

    public int getPriceTotal() {
        return priceTotal;
    }

    public void getPriceTotal(int priceTotal) {
        this.priceTotal = priceTotal;
    }
}


