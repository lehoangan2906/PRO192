import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator valid = new Validator();
        ProcessData pd = new ProcessData();
        
        while (true) {
            System.out.println(" ");
            System.out.println("----------------------------------------");
            System.out.println("Bạn có các lựa chọn sau:");
            System.out.println("\n1. Order hàng hoá");
            System.out.println("2. Xoá hàng hoá");
            System.out.println("3. Bổ sung hàng hoá");
            System.out.println("4. Thay đổi số lượng");
            System.out.println("5. Xuất hoá đơn");
            System.out.println("0. exit");
            int choice = valid.CheckInt("Nhập lựa chọn (0 -> 5): ", 0, 5);
            System.out.println(" ");
            switch (choice) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Adding to bill...");
                    int num = valid.CheckInt("Nhập tổng số loại hàng : ", 0, Integer.MAX_VALUE);
                    while (num > 0){
                        pd.addBill();
                        num--;
                    }
                    pd.Information();
                    break;
                case 2:
                    pd.removeItem();
                    break;
                case 3:
                    pd.addItem();
                    break;
                case 4:
                    pd.updateItem();
                    break;
                case 5:
                    pd.display();
                    break;
            }

        }
    
    }
    
}
