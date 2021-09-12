import java.lang.Math.*;

class Line {
    Point begin, end;
    int length;
    
    // Khởi tạo constructor của hai thuộc tính begin và end của class line
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter va setter
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    

    // tính độ dài đại số của đoạn thẳng dựa vào tọa độ 2 đầu mút.
    public double getLength(Point begin, Point end){
        int x1 = begin.getX();
        int x2 = end.getX();
        int y1 = begin.getY();
        int y2 = begin.getY();
        return Math.sqrt(Math.pow((y1 - y2), 2) + Math.pow((x1 - x2), 2)); 
    } 
    
    @Override
    public String toString() {
        return "Line{" + "begin=" + begin + ", end=" + end + '}';
    }
}