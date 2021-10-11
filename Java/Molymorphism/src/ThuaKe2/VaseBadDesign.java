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
public class VaseBadDesign {
    public int height;
    public String material;
    Item item; // Nếu triển khai ntn thì quan hệ giữa vase và Item là qhe has-a

    public VaseBadDesign() {
        height = 0;
        material = "ceramic";
//        item = new Item();
    }

    public VaseBadDesign(int height, String material, int value, String creator) {
        this.height = height;
        this.material = material;
//        this.item = new Item(value, creator);
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Vase{" + "height=" + height + ", material=" + material + ", item=(" + item + ")}";
    }
    
    
    
}
