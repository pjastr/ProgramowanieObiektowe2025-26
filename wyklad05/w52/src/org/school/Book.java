package org.school;

class Book {
    private String title;
    private double price;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "A";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public Book doublePrice(){
        Book temp = new Book();
        temp.title = title;
        temp.price = 2 * price;
        return temp;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}