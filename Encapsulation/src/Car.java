public class Car {
    // fields
    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;
            
    
    // Viec 1 lop co nhieu ham khoi tao (constructor) goi la overloading
    
    //methods
    public Car(){
        // constructor mac dinh cua car, moi object car khi duoc 
        // tham chieu deu mang cac thuoc tinh mac dinh duoi day
        this.colour = "White";
        this.EnginePower = 100;
        this.Convertible = false;
        this.parkingBrake = true;
    }
    
    public Car(String s){
        // constructor dung de custom attribute colour
        this();
        this.colour = s;   
    }
    
    public Car(String s, int p){
        this(s);
        this.EnginePower = p;
    }
    
    // viec co nhieu constructor dung de tranh truong hop ta can thay doi mot hoac nhieu thuoc tinh
    // khi goi nhieu object khac nhau

    public void pressStartButton() {
        System.out.println("You can press the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You can press the accelerator button");
        System.out.println("Colour: " + colour);
        System.out.println("Engine power: " + EnginePower);
        System.out.println("Cpnvertible: " + Convertible);
        System.out.println("Parking brake: " + parkingBrake);
    }

    public static void main(String[] args) {
        
        System.out.println("car 1: ============================");
        Car c = new Car();
        c.pressAcceleratorButton();
        
        System.out.println("car 2: ============================");    
        Car c2 = new Car("red");
        c.pressStartButton();
        c.pressAcceleratorButton();
        
        System.out.println("car 3: ============================");    
        Car c3 = new Car("yellow", 200);
        c.pressStartButton();
        c.pressAcceleratorButton();
    }
}
