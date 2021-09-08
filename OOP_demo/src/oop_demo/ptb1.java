
package oop_demo;

public class ptb1 {
    // a*x + b = 0
    double a, b;
    
    public void inputData(double n1, double n2){
        a = n1;
        b = n2;
    }
    
    public void processData(){
        if (a == 0){
            if (b == 0){
                System.out.println("pt vo so nghiem");
            }
            else{
                System.out.println("pt vo nghiem");
            }
        }
        else{
            System.out.println("Phuong trinh co 1 nghiem: " + -b/a);
        }
    }
    
    public void displayData(){
        processData();
    }
}
