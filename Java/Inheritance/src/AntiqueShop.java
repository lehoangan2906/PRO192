/**
 *
 * @author edward
 */
public class AntiqueShop {


    public static void main(String[] args) {
        Vase v1 = new Vase();
        v1.value = 100;
        v1.creator = "AnLH";       
        //you can assign values to other attributes of v1    
        v1.height = 100;
        v1.material = "gom Chu Dau";    
        //this code only uses to check v1's fields
        v1.output();
        
        
        Statue s1 = new Statue();
        s1.value = 200;
        s1.creator = "AnLH";
        //you can assign values to other attributes of s1
        s1.weight = 100;
        s1.colour = "white";
        //this code only uses to check s1's fields
        s1.output();
        
        
        Painting p1 = new Painting();
        p1.value = 500;
        p1.creator = "AnLH";
        //you can assign values to other attributes of p1
        p1.height = 200;
        p1.width = 100;
        p1.isWatercolour = true;
        p1.isFramed = true;
        //this code only uses to check p1's fields
        p1.output();
        
        
        Vase v2 = new Vase(100, "Paris", 200, "rock");
        Statue s2 = new Statue(200, "VN", 1000, "white");
        Painting p2 = new Painting(90, 90, true, false, 800, "AnLH");
        
        Item tmp = v2;
        // Dynamic type: A reference variable that has the type of the superclass can store the address of the object of sub class. It is called to be dynamic type, the type that is has at runtime.
        
        if (tmp instanceof Vase){
            System.out.println("tmp is pointing to the Vase object ");
            ((Vase)tmp).putFlowers();      
            // The tmp variable that has the type of the superclass only calls methods of the superclass. To call methods of the subclass we must cast explicitly
        }else if (tmp instanceof Statue)
            System.out.println("tmp is pointing to the Statue object");
        else
            System.out.println("tmp is pointing to the Painting object");
        
        // The instanceof operator will return true or false. In the above example, Because the variable tmp is pointing to the Vase object, the instruction "tmp instanceof Vase" returns true.
    }
    
}
