package model;

public class Grocery {
    private int price;
    private int ageLimit;
    private int quantity;
    private GroceryType type;
    // TODO utgångsdatum


    public Grocery() {
    }

    public Grocery(int price, int ageLimit, int quantity, GroceryType type) {
        this.price = price;
        this.ageLimit = ageLimit;
        this.quantity = quantity;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(GroceryType type) {
        this.type = type;
    }

    public GroceryType getType() {
        return type;
    }
}
