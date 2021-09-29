
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator valid = new Validator();
        Manager mn = new Manager();

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("Bạn có các lựa chọn sau:");
            System.out.println("\n1. Thêm món");
            System.out.println("2. Xoá món");
            System.out.println("3. Thay đổi số lượng");
            System.out.println("4. Xuất hoá đơn");
            System.out.println("0. exit");
            int choice = valid.CheckInt("Nhập lựa chọn (0 -> 4): ", 0, 4);
            System.out.println(" ");
            switch (choice) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Adding to bill...");
                    int num = valid.CheckInt("Nhập số lượng món: ", 0, Integer.MAX_VALUE);
                    while (num > 0){
                        mn.addBill();
                        num--;
                    }
                    
                    mn.servingInformation();
                    break;
                case 2:
                    mn.removeDish();
                    break;
                case 3:
                    mn.updateDish();
                    break;
                case 4:
                    mn.display();
                    break;

            }

        }
    
    }
}