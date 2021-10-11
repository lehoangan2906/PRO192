
public class Vase extends Item {

    int height;
    String material;

    //The below is methods that you need to implement
    //constructors
    //getter
    //setter
    //other logic methods
    public Vase() {
        super(); //call the default constructor of the Item class to reduce code duplication
        // this is equal to:
        // value = 0;
        // creator = "";
        height = 0;
        material = "";
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator); //call the constructor with 2 parameters of the Item class
        // this is equal to:
        // this.value = value;
        // this.creator = creator;
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

    @Override
    public String toString() {
        return "height=" + height + ", material=" + material;
    }

}
