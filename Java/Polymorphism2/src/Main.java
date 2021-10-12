public class Main {

    public static void main(String[] args) {
        Menu m = new Chef();
        m.getSalad();
        m.getBeefsteak();
        
        System.out.println("================");
        
        VIPMenu m2 = new VIPChef();
        m2.getSalmon();
        m2.getFishEggs();
        
        System.out.println("================");
        
        Menu m3 = new VIPChef();
        m3.getBeefsteak();
        m3.getSalad();
        
        System.out.println("================");
        
        VIPChef m4 = new VIPChef();
        m4.getBeefsteak();
        m4.getFishEggs();
        m4.getSalad();
        m4.getSalmon();
    }
    
}

//Now, it's polymorphism feature. When you instantiate the Chef
//class, you can assign it to a variable declared as an Menu 
//(an Interface type) rather than Chef (a class type)


/*
WHY AND WHEN TO USE INTERFACES?

- It will be the core of some classes
- Java does not support "multiple inheritance" (a class can only inherit from 
one superclass). However, it can be achieved with interfaces, because the class 
can implement multiple interfaces. Note: To implement multiple interfaces, separate 
them with a comma.

*/