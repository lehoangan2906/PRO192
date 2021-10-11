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
public class VaseGoodDesign extends Item {
    public int height;
    public String material;
    //super là viết tắt cảu superclass, parent class, based-class: lớp cha
    //subclass, child class, derived class(dẫn xuất): lớp con thừa kế từ cha
    public VaseGoodDesign() {
        super();
        height = 0;
        material = "ceramic";
    }

    public VaseGoodDesign(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", height=" + height + ", material=" + material + '}';
    }
    
    public void putFlowers() {
        System.out.println("Cắm Hoa");
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter material: ");
        material = sc.nextLine();
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This vase's height is " +height);
        System.out.println("This vase's material is "+material);
    }

    @Override
    public void displayPrice() {
        if(height<100)
		   System.out.println("The price is " +  1000 +"$");
		else
		   System.out.println("The price is " +  2000 +"$");
    }
    
    
}
