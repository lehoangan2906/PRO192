class Point {
    int x, y;
    
    // Hàm Khởi tạo cho x và y - constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter va setter
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
    
    // Phương thức giúp di chuyển điểm từ vị trí này sang vị trí khác
    public void moveRel(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    // Hiển thị khi in thông tin về đối tượng
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
