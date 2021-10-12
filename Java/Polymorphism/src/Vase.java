
import java.util.Scanner;


public class Vase extends Item {

    private int height;
    private String material;
    Scanner sc = new Scanner(System.in);

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    // The super keyword refers to the super class
    // Note: A derived class does not inherit a superclass constructor by default
    
    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void putFlowers(){
        System.out.println("flowers are put in the vase");
    }
    
    //A sub class is only complete once it has provided concrete implementations of all abstract methods inherited from its parent super class/classes.
    @Override
    public void displayPrice(){
        if (height < 100)
            System.out.println("The price is: " + 1000 + "$");
        else
            System.out.println("The price is: " + 2000 + "$");
    }
    
    @Override
    public void input(){
        super.input();    //call the input method version of the father class
        sc = new Scanner(System.in);
        System.out.print("enter the Vase's height: ");
        height = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("enter the Vase's material: ");
        material = sc.nextLine();
    }
    
    @Override
    public void output(){
        super.output();    //call the ouput method version of the father class
        System.out.println("This vase's height is " +height);
        System.out.println("This vase's material is "+material);
    }

    @Override
    public String toString() {
        return "height=" + height + ", material=" + material;
    }

}
