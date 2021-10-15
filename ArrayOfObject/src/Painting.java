public class Painting extends Item{
    int height;
    int width;
    String material;
    boolean isWatercolour;
    boolean isFramed;
    
    // The below is methods that you need to implement
    //constructors
    //getter
    //setter
    //other logic methods

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = true;
        isFramed = true;
    }


    public Painting(int height, int width, String material, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
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

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "type: Painting" + ", height = " + height + ", width = " + width + ", material = " + material + ", isWatercolour = " + isWatercolour + ", isFramed = " + isFramed + ", creator = " + creator;
    }

    //A sub class is only complete once it has provided concrete implementations of all abstract methods inherited from its parent super class/classes.
    @Override
    public void displayPrice() {
        if (width < 100 && height < 100)
            System.out.println("The price is: " + 5000 + "$");
        else
            System.out.println("The price is: " + 5000 + "$");
    }
    
    
}
