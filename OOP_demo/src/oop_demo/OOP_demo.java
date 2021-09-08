
class product{
    String id;
    String name;
    double price;
    
    public void inputData(){
        
    }
    
    public void processData(){
        
    }
    
    public void displayData(){
        
    }
}

public class OOP_demo {

    public static void main(String[] args) {
        product p1 = new product();
        // product: teên lớp
        // p1: là tên đối tượng (object)
        // = new product(); là yêu cầu hệ thống cấp phát bộ nhớ cho đối tượng p1
        
        p1.inputData();
        p1.processData();
        p1.displayData();
        
        ptb2 pt2 = new ptb2();
        pt2.inputData(0, 0, 0);
        pt2.displayData();
    }
    
}
