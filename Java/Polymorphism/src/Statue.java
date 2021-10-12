public class Statue extends Item{
    int weight;
    String colour;
    
    //The below is methods that you need to implement
    //constructors
    //getter
    //setter
    //other logic methods

    public Statue() {
        super();
        weight = 0;
        colour = "Null";
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    // A sub class is only complete once it has provided concrete implementations of all abstract methods inherited from its parent super class/classes.
    @Override
    public void displayPrice(){
        if (weight < 100)
            System.out.println("The price is: " + 2000 + "$");
        else
            System.out.println("The price is: " + 3000 + "$");
    }

    @Override
    public String toString() {
        return "weight=" + weight + ", colour=" + colour;
    }
    
    
}
