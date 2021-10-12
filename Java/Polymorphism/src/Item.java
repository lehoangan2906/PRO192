
import java.util.Scanner;

public abstract class Item {
    protected int value;
    protected String creator;
    Scanner sc = new Scanner(System.in);
    
    public Item(){
        value = 0;
        creator = "";
    }
    
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }

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
    
    public void input(){
        sc = new Scanner(System.in);
        System.out.print("enter a value: ");
        value = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("enter a creator: ");
        creator = sc.nextLine();
    }
    
    public void output(){
        System.out.println("This item is worth " + value + " pounds");
        System.out.println("This item is created by " + creator);
    }

    
    //we want to add a new method named displayPrice, by design we want it is the common method to all classes. 
    //We will put it into the Item class, so all subclasses can inherit. The task of this method to print out the 
    //price of Item based on width, height, or weight fields. But, when you implement it in the Item class, this 
    //class is not able to support any fields as: width, height, or weight . This is where we meet the notion of an abstract method.
    
    public abstract void displayPrice();
    // it is abstract because we lack information to implement.
    
    //Abstract classes cannot be instantiated
    
    
    @Override
    public String toString() {
        return "value=" + value + ", creator=" + creator;
    }
    
    
}
