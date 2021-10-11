
/**
 *
 * @author edward
 */
public class Car {

    // fields
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void PressStartButton() {
        System.out.println("You can press the start button");
    }

    public void PressAcceleratorButton() {
        System.out.println("You can press the accelerator button");
        System.out.println("Colour: " + colour);
        System.out.println("Engine Power:" + enginePower);
        System.out.println("Convertible: " + convertible);
        System.out.println("Parking Brake: " + parkingBrake);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("car c1: ");
        c1.PressStartButton();
        c1.PressAcceleratorButton();

        System.out.println("==========================");
        
        Car c2 = new Car();
        System.out.println("car c2: ");
        c2.PressAcceleratorButton();
        System.out.println("==========================");

        System.out.println("car c3: ");
        Car c3 = new Car("red", 100, true, true);
        c3.PressAcceleratorButton();
        c3.setColour("black");
        System.out.println("Colour of c3: " + c3.getColour());
        
    }
}
