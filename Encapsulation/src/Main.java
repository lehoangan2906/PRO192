public class Main {

    public static void main(String[] args) {
        
        System.out.println("car 1: ============================");
        Car c = new Car();
        c.pressAcceleratorButton();
        
        System.out.println("car 2: ============================");    
        Car c2 = new Car("red");
        c.pressStartButton();
        c.pressAcceleratorButton();
        
        System.out.println("car 3: ============================");    
        Car c3 = new Car("yellow",200);
        c.pressStartButton();
        c.pressAcceleratorButton();
    }
    
}
