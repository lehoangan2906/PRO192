/**
 *
 * @author edward
 */
public class items {
    private String name;
    private int index;
    private int quantity;
    private int price;
    private String unit;

    public items() {
    }

    public items(int index, String name, String unit, int quantity, int price) {
        this.name = name;
        this.index = index;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.printf("%8s|%22s|%25s|%25s|%15s|%15s\n", index, name, unit, quantity, price, quantity*price);
        return "";
    }
    
    
}
