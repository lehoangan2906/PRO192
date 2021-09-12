class HinhChuNhat {
    Point topLeft, bottomRight;
    int height, base, x1, x2, y1, y2;
    
    // Method dùng để lấy dữ liệu (TopLeft, BottomRight)
    public void inputData(Point tl, Point br){
        topLeft = tl;
        bottomRight = br;
    }
    
    // Method dùng để xử lí dữ liệu
    public void processData(){
        Line Diagonalline = new Line(topLeft, bottomRight);
        double Diagonal = Diagonalline.getLength(topLeft, bottomRight);
        System.out.println("Độ dài đường chéo của Hình chữ nhật là: " + Diagonal);
        
        y1 = topLeft.getY();
        y2 = bottomRight.getY();
        int height = Math.abs(y1 - y2);
        System.out.println("Chiều cao của Hình chữ nhật là: " + height);
        
        x1 = topLeft.getX();
        x2 = bottomRight.getX();
        int base = Math.abs(x1 - x2);
        System.out.println("Độ dài đáy của Hình chữ nhật là: " + base);
        
        int perimeter = (height + base) * 2;
        System.out.println("Chu vi của Hình chữ nhật là: " + perimeter);   
        
        int area = height * base;
        System.out.println("Diện tích của Hình chữ nhật là: " + area); 
        
    }
    
    public void displayData(){
        processData();
    }
   
//    public void getDiagonal(){
//        Line Diagonalline = new Line(topLeft, bottomRight);
//        double Diagonal = Diagonalline.getLength(topLeft, bottomRight);
//        System.out.println("Độ dài đường chéo của Hình chữ nhật là: " + Diagonal);
//    }
//    
//    public void getHeight(){
//        y1 = topLeft.getY();
//        y2 = bottomRight.getY();
//        int height = Math.abs(y1 - y2);
//        System.out.println("Chiều cao của Hình chữ nhật là: " + height);
//    }
//    
//    public void getBase(){
//        x1 = topLeft.getX();
//        x2 = bottomRight.getX();
//        int base = Math.abs(x1 - x2);
//        System.out.println("Độ dài đáy của Hình chữ nhật là: " + base);
//    }
//    
//    public void getPerimeter(){
//        y1 = topLeft.getY();
//        y2 = bottomRight.getY();
//        int height = Math.abs(y1 - y2);
//        x1 = topLeft.getX();
//        x2 = bottomRight.getX();
//        int base = Math.abs(x1 - x2);
//        int perimeter = (height + base) * 2;
//        System.out.println("Chu vi của Hình chữ nhật là: " + perimeter);       
//    }
//    
//    public void getArea(){
//        y1 = topLeft.getY();
//        y2 = bottomRight.getY();
//        int height = Math.abs(y1 - y2);
//        x1 = topLeft.getX();
//        x2 = bottomRight.getX();
//        int base = Math.abs(x1 - x2);
//        int area = height * base;
//        System.out.println("Diện tích của Hình chữ nhật là: " + area);        
//    }
//    
//    public void getCenter(){
//        x1 = topLeft.getX();
//        x2 = bottomRight.getX();
//        y1 = topLeft.getY();
//        y2 = bottomRight.getY();
//        
//    }
}
