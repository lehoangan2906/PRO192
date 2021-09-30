
public class Foodbill {
    private String name;
    private int index;
    private int quantity;
    private double price;

    public Foodbill() {
    }

    public Foodbill(int index, String name, int quantity, double price) {
        this.name = name;
        this.index = index;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.printf("%8s|%20s|%15s|%8s|%8s", index, name, quantity, price, quantity*price);
        return "";
    }
    
    
}
