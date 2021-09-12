class HinhTron {
    Point center;
    double radius;
    
    // Method dùng để lấy dữ liệu (center, radius)
    public void inputData(Point c, double r){
        center = c;
        radius = r;
    }
    
    // Method dùng để xử lí dữ liệu
    public void processData(){
        System.out.println("Tọa độ tâm của hình tròn là: " + center);
        
        System.out.println("Bán kính của hình tròn là: " + radius);
        
        double diameter = 2* radius;
        System.out.println("Đường kính của hình tròn là: " + diameter);  
        
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Chu vi của hình tròn là: " + perimeter);
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Diện tích của hình tròn là: " + area);
    }
    
    public void displayData(){
        processData();
    }
    
//    public void getCenter(){
//        Point ct = center;
//        System.out.println("Tọa độ tâm của hình tròn là: " + center);
//    }
//    
//    public void getRadius(){
//        double r = radius;
//        System.out.println("Bán kính của hình tròn là: " + radius);
//    }
//    
//    public void getPerimeter(){
//        double perimeter = 2 * Math.PI * radius;
//        System.out.println("Chu vi của hình tròn là: " + perimeter);
//    }
//    
//    public void getArea(){
//        double area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Diện tích của hình tròn là: " + area);
//    }
//    
//    public void getDiameter(){
//        double diameter = 2* radius;
//        System.out.println("Đường kính của hình tròn là: " + diameter);        
//    }
}
