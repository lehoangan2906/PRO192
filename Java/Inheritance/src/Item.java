public class Item {
    int value;
    String creator;
    
    // The below is methods that you need to implement
    
    // default constructor
    public Item(){
        value = 0;
        creator = "";
    }
    
    // Constructor with parameters
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }
    
    //getter
    //setter
    //other logic methods

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output(){
        System.out.println("This item is worth " + value + " pounds");
        System.out.println("This item is created by " + creator);
    }

    @Override
    public String toString() {
        return "value=" + value + ", creator=" + creator;
    }
    
    
}
