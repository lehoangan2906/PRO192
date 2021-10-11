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
public class AntiqueShop {

    public static void main(String[] args) {
        VaseBadDesign v1 = new VaseBadDesign();
        System.out.println(v1);
        
        v1 = new VaseBadDesign(360, "Plastic", 10000, "Phan");
        System.out.println(v1);
        System.out.println("===================================");
        
        VaseGoodDesign v2 = new VaseGoodDesign();
        System.out.println(v2);
        v2 = new VaseGoodDesign(123, "Diamon", 9999999, "Phan");
        System.out.println(v2);
        
        Statue s1 = new Statue();
        System.out.println(s1);
        
        s1 = new Statue(46, "Green", 12345, "Phan");
        System.out.println(s1);
        
        Painting p1 = new Painting();
        System.out.println(p1);
        
        p1 = new Painting(10, 20, Boolean.TRUE, Boolean.FALSE, 100000, "Phan");
        System.out.println(p1);
        
        Item tmp = v2;
        if (tmp instanceof Painting)
            System.out.println("tmp is pointing to Painting object");
        else if (tmp instanceof VaseGoodDesign )
            System.out.println("tmp is pointing to Vase object");
        else if (tmp instanceof Statue)
            System.out.println("tmp is pointing to Statue object");
        else
            System.out.println("tmp is not pointing to any object");
        ((VaseGoodDesign)tmp).putFlowers();
        tmp = s1;
        ((Statue)tmp).setColour("Red");
        // khi khởi tạo 1 hàm gọi dến lớp cha thì từ khóa super() phải được viết ở vị trí đầu tiên của hàm
        System.out.println("-----------------------------------------------");
        s1.input();
        s1.output();
        
    }

}
