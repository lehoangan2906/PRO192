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
public class Painting extends Item {
    int height;
    int width;
    Boolean isWatercolour;
    Boolean isFramed;

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }

    public Painting(int height, int width, Boolean isWatercolour, Boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Boolean getIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(Boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public Boolean getIsFramed() {
        return isFramed;
    }

    public void setIsFramed(Boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public String toString() {
        return super.toString() + ", height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
    }
    
    public void trimPainting() {
        width -= 1;
    }
    
    public void trimPainting(int amount) {
        width -= amount;
    }

    @Override
    public void displayPrice() {
        if(width<100 && height<100)
		   System.out.println("The price is " +  5000 +"$");
		else
		   System.out.println("The price is " +  5000 +"$");
    }
}
