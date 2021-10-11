/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaKe2;

/**
 *
 * @author dumbw
 */
class Point{}
abstract class Shape {

    public Shape() {
    
    }
    
    public Shape(Point[] arrPoints) {
    
    }
    public void input(){
        
    }
    
    public void output() {
        
    }
    public abstract double getArea();// là 1 phương thức chưa thể có phần body triển khai do chưa đủ thông tin
    //để có thể áp dụng công thức xử lý tính diện tích
}

abstract class Animal {
    String name;
    String species;

    public Animal() {
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", species=" + species + '}';
    }
    
    public abstract String move();
    
    
}
class Snake extends Animal {

    @Override
    public String move() {
        return "Snake slide.";
    }
}
abstract class HoaHau {
    public abstract String tieuChiDep(); 
}

class HoaHauVN extends HoaHau {

    @Override
    public String tieuChiDep() {
        String ret = "Null";
        return ret;
    }
    
}

class HoaHayPhuongTay extends HoaHau {

    @Override
    public String tieuChiDep() {
        String standard = "Miệng rộng, eo thon";
        return standard;
    }
}

abstract class Employee {
    public abstract double calcSalary();
}

abstract class FulltimeEmp extends Employee {

    @Override
    public double calcSalary() {
        double fulltimeSalary = 10;
        return fulltimeSalary;
    }
}

public class AbstracClassDemo {
    public static void main(String[] args) {
//        Shape obj = new Shape();// lớp trừu tượng thì ko thể có thể hiện(vì nó trừu tượng))
//                                 // cho nên dòng lệnh trên là không hợp lệ
    Snake KingCorba = new Snake();
        System.out.println(KingCorba.move());
    }                          
}
