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
public abstract class Item {
    public int value;
    public String creator;
    Scanner sc = new Scanner(System.in);
    public Item() {
        value = 0;
        creator = "Anonymous";
    }
    public abstract void displayPrice();
    
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "value=" + value + ", creator=" + creator;
    }
    
    public void output() {
            System.out.println("The item is worth " +value + " pounds");
            System.out.println("The item is created by " +creator);
    }
    public void input() {
        sc = new Scanner(System.in);
        System.out.println("Enter value: "); 
        value = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter creator: ");
        creator = sc.nextLine();
    }
    
}
