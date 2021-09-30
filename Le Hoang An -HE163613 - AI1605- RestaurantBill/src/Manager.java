
import java.util.*;
import java.text.*;

public class Manager {

    ArrayList<Foodbill> list = new ArrayList<>();
    Validator valid = new Validator();
    Scanner sc = new Scanner(System.in);
    
    String phucvu, thungan, table;
    int cash;

    public Manager() {
//        list.add(new Foodbill(1, "rieu be be", 2, 35000));
//        list.add(new Foodbill(1, "quay 5k", 2, 5000));
//        list.add(new Foodbill(1, "tra da", 1, 3000));
    }
    
    public void addBill() {
        System.out.println(" ");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        String name = valid.CheckTxt("Tên món: ", "[a-zA-Z0-9 ]+");
        int quantity = valid.CheckInt("Số lượng: ", 1, Integer.MAX_VALUE);
        double price = valid.CheckDouble("Giá tiền: ", 1.0, Double.MAX_VALUE);
        list.add(new Foodbill(index, name, quantity, price));
        System.out.println("Thêm thành công!");
    }
    
    public void servingInformation(){
        System.out.print("\nBàn số: ");
        this.table = sc.next();
        Staff st = new Staff();
        this.phucvu = valid.CheckTxt("Phục vụ (không dấu): ", "[a-zA-Z ]+");
        st.setName(phucvu);
        this.thungan = valid.CheckTxt("Thu ngân (không dấu): ", "[a-zA-Z ]+");
        st.setName(thungan);
        this.cash = valid.CheckInt("Tiền khách thanh toán: ", 0, Integer.MAX_VALUE);
    }

    public void display() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E ydyyy.MM.dd 'at' hh:mm:ss a");

        
        System.out.println("Display bill...");
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                   Bún riêu Bề Bề Tiến Huân CS4");
        System.out.println("                 116, Trung Hoà, Cầu Giấy, Hà Nội");
        System.out.println("                      Hotline: 0398.319.319");
        System.out.println(" ");
        System.out.println("===================== Hoá Đơn Thanh Toán ======================");
        System.out.println(" ");
        System.out.println("Ngày: " + ft.format(date));
        System.out.println(" ");
        System.out.println("Bàn: " + table);
        System.out.println("Phục vụ: " + phucvu);
        System.out.println("Thu ngân: " + thungan);
        System.out.println(" ");
        
        System.out.printf("%8s|%20s|%15s|%8s|%8s\n", "stt", "tên món", "số lượng", "đơn giá", "tổng tiền");
        System.out.println("-----------------------------------------------------------------");
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum += list.get(i).getPrice() * list.get(i).getQuantity();
        }
        System.out.println("=================================================================");
        System.out.println("Tổng thanh toán:                                        " + sum + " đ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Tiền mặt:                                               " + cash + " đ");
        System.out.println("Trả lại khách:                                          " + (cash - sum) + " đ");
        System.out.println(" ");
        System.out.println("         Vui lòng mang hoá đơn ra quầy thanh toán!");
        System.out.println("             (Hoá đơn chưa bao gồm thuế GTGT)");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
    }

    public void removeDish() {
        System.out.println("Remove dish...");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        int pos = searchID(index);
        if (pos < 0) {
            System.err.println("Không tìm thấy!");
            return;
        }
        list.remove(pos);
        System.out.println("Xoá thành công!!!");
    }
    
    
    public void updateDish() {
        System.out.println("Update dish...");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        int pos = searchID(index);
        if (pos < 0) {
            System.err.println("Không tìm thấy!");
            return;
        }
        int newquant = valid.CheckInt("Nhập số lượng mới: ", 0, Integer.MAX_VALUE);
        list.get(pos).setQuantity(newquant);
        System.out.println("Cập nhật thành công!!!");
    }
    
    public void addDish() {
        System.out.println(" ");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        String name = valid.CheckTxt("Tên món: ", "[a-zA-Z0-9 ]+");
        int quantity = valid.CheckInt("Số lượng: ", 1, Integer.MAX_VALUE);
        double price = valid.CheckDouble("Giá tiền: ", 1.0, Double.MAX_VALUE);
        list.add(new Foodbill(index, name, quantity, price));
        System.out.println("Thêm thành công!");
    }

    
    public int searchID(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIndex() == index) {
                return i;
            }
        }
        return -1;
    }
    
}
