package oop_demo;
        
import java.util.Scanner;
// import thu vien scanner

public class ptb2 {
    // a*x**2 + b*x + c = 0
    double a, b, c, firstRoot, secondRoot, delta, squareroot;
    
    public void inputData(double n1, double n2, double n3){
        a = n1;
        b = n2;
        c = n3;

        // input tu ban phim
        Scanner sc = new Scanner(System.in);
        c = sc.nextDouble();
        b = sc.nextDouble();
        a = sc.nextDouble();
        
    }
    
    public void processData(){
        double firstRoot = 0, secondRoot = 0;
        if (a == 0){
            // bx + c = 0
            // ke thua attributes cua ptb1
            ptb1 pt1 = new ptb1();
            pt1.inputData(b, c);
            pt1.displayData();
        }
        
        else{
            double delta = (b*b) - (4*a*c);
            double squareroot = Math.sqrt(delta);

            if(delta>0){
             firstRoot = (-b + squareroot)/(2*a);
             secondRoot = (-b - squareroot)/(2*a);
             System.out.println("Roots are : "+ firstRoot +" and "+secondRoot);
            }
            else if(delta == 0){
             System.out.println("Root is :: "+(-b + squareroot)/(2*a));
          }
        }
    }
        
    
    public void displayData(){
        processData();
    }
    
}
