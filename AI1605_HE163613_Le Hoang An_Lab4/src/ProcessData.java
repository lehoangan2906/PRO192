
import java.util.*;
import java.text.*;
import java.time.LocalDate;

/**
 *
 * @author edward
 */
public class ProcessData {

    ArrayList<items> list = new ArrayList<>();
    Validator valid = new Validator();
    Scanner sc = new Scanner(System.in);
    
    Buyer by = new Buyer();
    Seller sl = new Seller();
    
    String sellerName, buyerName, sellerAddress, buyerAddress, buyerTaxNum, sellerTaxNum, sellerPhoneNum, sellerCardNum, buyerCom, buyerPayment, buyerCardNum;
    int tax;

    public void addBill() {
        System.out.println(" ");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        String name = valid.CheckTxt("Tên hàng hoá, dịch vụ: ", "[a-zA-Z0-9 ]+");
        String unit = valid.CheckTxt("Đơn vị tính: ", "[a-zA-Z ]+");
        int quantity = valid.CheckInt("Số lượng: ", 1, Integer.MAX_VALUE);
        int price = valid.CheckInt("Đơn giá: ", 0, Integer.MAX_VALUE);
        list.add(new items(index, name, unit, quantity, price));
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

    public void removeItem() {
        System.out.println("Remove item...");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        int pos = searchID(index);
        if (pos < 0) {
            System.err.println("Không tìm thấy!");
            return;
        }
        list.remove(pos);
        System.out.println("Xoá thành công!!!");
    }

    public void updateItem() {
        System.out.println("Update item...");
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

    public void addItem() {
        System.out.println(" ");
        int index = valid.CheckInt("Nhập STT: ", 1, Integer.MAX_VALUE);
        String name = valid.CheckTxt("Tên hàng hoá: ", "[a-zA-Z0-9 ]+");
        String unit = valid.CheckTxt("Đơn vị tính: ", "[a-zA-Z ]+");
        int quantity = valid.CheckInt("Số lượng: ", 1, Integer.MAX_VALUE);
        int price = valid.CheckInt("Giá tiền: ", 0, Integer.MAX_VALUE);
        list.add(new items(index, name, unit, quantity, price));
        System.out.println("Thêm thành công!");
    }
    
    public void Information(){
        
        int tax;
        System.out.println(" ");
        System.out.println("(điền thông tin đầy đủ, không dấu, không chứa các ký tự đặc biệt. Nếu có field nào không có thông tin thì điền Null hoặc 0)");
        System.out.println(" ");
        System.out.println("Thông tin người bán: ");
        System.out.println(" ");
        this.sellerName = valid.CheckTxt("Tên đơn vị bán hàng: ", "[a-zA-Z ]+");
        sl.setName(sellerName);
        this.sellerAddress = valid.CheckTxt("Địa chỉ: ", "[a-zA-Z0-9 ]*");
        sl.setAddress(sellerAddress);
        this.sellerTaxNum = valid.CheckTxt("Mã số thuế: ", "[0-9 ]+");
        sl.setTaxId(sellerTaxNum);
        this.sellerPhoneNum = valid.CheckTxt("Số điện thoại: ",  "(\\+[0-9]{1,2})?[0-9]{8,11}");
        sl.setPhoneNum(sellerPhoneNum);
        this.sellerCardNum = valid.CheckTxt("Số tài khoản: ", "[a-zA-Z0-9 ]+");
        sl.setCardNumber(sellerCardNum);
        System.out.println(" ");
        System.out.println("Thông tin người mua: ");
        System.out.println(" ");
        this.buyerName = valid.CheckTxt("Họ tên người mua hàng: ", "[a-zA-Z ]+");
        by.setName(buyerName);
        this.buyerCom = valid.CheckTxt("Tên đơn vị           : ", "[a-zA-Z ]+");
        by.setCompany(buyerCom);
        this.buyerAddress = valid.CheckTxt("Địa chỉ              : ", "[a-zA-Z0-9 ]*");
        by.setAddress(buyerAddress);
        this.buyerTaxNum = valid.CheckTxt("Mã số thuế           : ", "[0-9 ]+");
        by.setTaxId(buyerTaxNum);
        this.buyerPayment = valid.CheckTxt("Hình thức thanh toán: ", "[a-zA-Z ]+");
        by.setPaymentMethod(buyerPayment);
        this.buyerCardNum = valid.CheckTxt("Số tài khoản       : ", "[a-zA-Z0-9 ]+");
        by.setCardNumber(buyerCardNum);
        System.out.println(" ");
        System.out.println("Thuế VAT (%): ");
        this.tax = sc.nextInt();
        
    }

    public void display() {
        LocalDate date = LocalDate.now();

        System.out.println("Display bill...");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                                          Hoá đơn giá trị gia tăng                             Mẫu số: 01GTKT/002");
        System.out.println("                                                                                               Ký hiệu: LH/19E");
        System.out.println("                                                                                               Số: 0001616");
        System.out.println("                                             Ngày: " + date);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Tên đơn vị bán hàng: " + sl.getName());
        System.out.println("Địa chỉ            : " + sl.getAddress());
        System.out.println("Mã số thuế         : " + sl.getTaxId());
        System.out.println("Số điện thoại      : " + sl.getPhoneNum());
        System.out.println("Số tài khoản       : " + sl.getCardNumber());
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Họ tên người mua hàng: " + by.getName());
        System.out.println("Tên đơn vị           : " + by.getCompany());
        System.out.println("Địa chỉ              : " + by.getAddress());
        System.out.println("Mã số thuế           : " + by.getTaxId());
        System.out.println("Hình thức thanh toán:   " +  by.getPaymentMethod() + "             Số tài khoản       : " + by.getCardNumber());
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%8s|%22s|%25s|%25s|%15s|%15s\n", "STT", "Tên hàng hoá, dịch vụ", "Đơn vị tính", "Số lượng", "Đơn giá", "Thành tiền");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%8s|%22s|%25s|%25s|%15s|%15s\n", "A", "B", "C", "1", "2", "3 = 1 x 2");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum += list.get(i).getPrice() * list.get(i).getQuantity();
        }
        System.out.println("====================================================================================================================");
        System.out.println("                                                Cộng tiền hàng:                                        " + sum + "đ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Thuế suất GTGT:          " + tax + "%                                                                     Thuế: " + (sum/100 * tax) + "đ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                              Tổng tiền thanh toán:                                    " + (sum + (sum/100 * tax)));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("     Người mua hàng                                                                           Người bán hàng    ");
        System.out.println("  (Ký, ghi rõ họ tên)                                                                      (Ký, ghi rõ họ tên)");
        System.out.println(" ");
        System.out.println("                                                                                       Ký bởi:  "+ sl.getName());
        System.out.println("                                                                                       Ký ngày: " + date);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                         (Cần kiểm tra, đối chiếu trước khi lập, giao, nhận hoá đơn)   ");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
}
