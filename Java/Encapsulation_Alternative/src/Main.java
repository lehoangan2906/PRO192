/**
 *
 * @author edward
 */
public class Main {

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
