public class Main {

    public static void main(String[] args) {
        
        // Tính các kích thước của hình chữ nhật (có các cạnh song song với các trục tọa độ) dựa vào tọa độ hai điểm cho trước: góc trên bên trái và góc dưới bên phải
        
        System.out.println("Trường hợp 1: hình chữ nhật nằm ở góc phần tư thứ nhất: ");
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.inputData(new Point(3, 7), new Point(13, 3));
        hcn1.displayData();   
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 2: hình chữ nhật nằm ở góc phần tư thứ hai: ");
        HinhChuNhat hcn2 = new HinhChuNhat();        
        hcn2.inputData(new Point(-3, 7), new Point(-13, 3));
        hcn2.displayData();
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 3: hình chữ nhật nằm ở góc phần tư thứ ba: ");
        HinhChuNhat hcn3 = new HinhChuNhat();
        hcn3.inputData(new Point(-3, -7), new Point(-13, -3));
        hcn3.displayData();
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 4: hình chữ nhật nằm ở góc phần tư thứ tư: ");
        HinhChuNhat hcn4 = new HinhChuNhat();        
        hcn4.inputData(new Point(3, -7), new Point(13, -3));
        hcn4.displayData();
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 5: hình chữ nhật nằm giữa góc phần tư thứ nhất và thứ hai: ");
        HinhChuNhat hcn5 = new HinhChuNhat();        
        hcn5.inputData(new Point(-5, 7), new Point(5, 3));
        hcn5.displayData();
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 6: hình chữ nhật nằm giữa góc phần tư thứ ba và thứ tư: ");
        HinhChuNhat hcn6 = new HinhChuNhat();        
        hcn6.inputData(new Point(-5, -7), new Point(5, -3));
        hcn6.displayData();
        
        System.out.println(" ");        
        
        System.out.println("Trường hợp 7: hình chữ nhật nằm giữa 4 góc phần tư: ");
        HinhChuNhat hcn7 = new HinhChuNhat();        
        hcn7.inputData(new Point(-5, 2), new Point(5, -2));
        hcn7.displayData();
     
        System.out.println(" ");
        
        // Tìm các kích thước của hình tròn dựa vào hai thuộc tính cho trước: tọa độ tâm và bán kính.
        
        HinhTron ht02 = new HinhTron();
        ht02.inputData(new Point (0,0), 7.5);
        ht02.displayData();
        
    }
    
}
