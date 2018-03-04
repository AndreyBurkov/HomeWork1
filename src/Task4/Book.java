package Task4;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    private void init(String name, Author[] authors, double price) {
        // этот метод я создал, чтобы не повторять код в конструкторах
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price) {
        init(name, authors, price);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        init(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        /*
            в этом методе создаём копию массива Book.authors[], чтобы
            объекты этого массива не смогли изменить
        */
        Author[] authors = new Author[this.authors.length];
        for (int i = 0; i < authors.length; i++) {
           authors[i] = new Author(this.authors[i].getName(), this.authors[i].getEmail(), this.authors[i].getGender());
        }
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String result = "Book[name = " + name + ",authors={";
        for (int i = 0; i < authors.length; i++) {
            result += authors[i];
            if (i != authors.length - 1) result += ",";
        }
        result += "}, price=" + price + ",qty=" + qty + "]";
        return result;
    }

    public String getAuthorNames() {
        String result = "";
        for (int i = 0; i < authors.length; i++) {
            result += authors[i].getName();
            if (i != authors.length - 1) result += ", ";
        }
        return result;
    }
}
