/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previousExample;

/**
 *
 * @author edward
 */
public class Point {
    int x;
    int y;

    public Point() {
        x = y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
