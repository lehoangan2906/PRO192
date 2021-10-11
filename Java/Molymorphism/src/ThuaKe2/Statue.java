/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaKe2;

import java.util.Scanner;

/**
 *
 * @author dumbw
 */
public class Statue extends Item {
    int weight;
    String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "White";
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", weight=" + weight + ", colour=" + colour + '}';
    }
    
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter colour: ");
        colour = sc.nextLine();
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This vase's weight is " +weight);
        System.out.println("This vase's colour is "+colour);
    }

    @Override
    public void displayPrice() {
        if(weight<100)
		   System.out.println("The price is " +  1000 +"$");
		else
		   System.out.println("The price is " +  2000 +"$");
    }
}
