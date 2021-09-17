import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        char[] copyFrom = {'H', 'E', 'l', 'l', 'o'};
        char[] copyTo = new char[3];
        copyTo = copyFrom;
        for (int i = 0; i < copyTo.length; i++){
            System.out.println(i + ":" + copyTo[i]);
            
            // Bản chất khi ta khai báo kiểu string thì nó chính là mang các kí tự
            
            String studentID = "SE1672";
            for (int j = 0; j < studentID.length(); j++){
                System.out.println("character at position " + j + " is " + studentID.charAt(j));
            }
            
            System.out.println("================");
            
            // Biến từ một strinig thành một array
            char[] arrayChar = studentID.toCharArray();
            
            for (int k = 0; k < arrayChar.length; k++){
                System.out.println("character of element " + k + " in array is " + arrayChar[k]);
            }
            
            //  Tạo một class mới tên là MyString
            // trong đó cho phép nguowifi sử dụng gọi đến inputDat() để nhập dữ liieeuj vào từ bàn phím
            // độ dài của chuỗi nhập vào không quá 1k kí tự
            // có phương thức checkPalindrome() trả về true nếu chuỗi đã nhập là đối xứng
            // có phương thức displayData() hiieenr thị nội dung của chuỗi, và kết quả khi gọi hàm checkPalindrome()
          
            
        }
       
    }
}