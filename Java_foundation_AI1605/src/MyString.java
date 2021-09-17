import java.util.Scanner;

public class MyString {
    String content = " ";

    public MyString() {
    }

    public MyString(String s){
        content = s;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void inputData(){
        //Độ dài nhập vào không quá 10 kí tự
        Scanner sc = new Scanner(System.in);
        // về nhà vết dạng buffer reader class
        int limit = 10;
        System.out.println("Please input a strng (length limit 10 characters.");
        System.out.print("input: ");
        String temp = sc.nextLine();
        if(temp.length() > limit){
            content = temp.substring(0, limit);
            System.out.println("");
        }
    }
    
    public String reverse(){
        // tạo ra chuỗi đảo ngược của chuỗi content (check GeeksforGeeks)
        String result = "";
        StringBuilder ab = new StringBuilder(content);
        result = ab.reverse().toString();
        return result;
        
    }
    
    public boolean checkPalindrome(){
        // so sánh chuỗi
        if(content.equals("")){
            System.err.println("Error: Content string is null");
            return false;
        }
        else{
            String reverseString = reverse(); // tạo ra chuỗi đảo ngược của chuỗi content
//            if (content.equals(reverseString))
//                return true;
//            else 
//                return false;  
            return content.equals(reverseString);
        }
    }
    
    public static void main(String[] args){
        MyString s1 = new MyString("Hello");
        s1 .inputData();
        
        s1.setContent("");
        boolean result = s1.checkPalindrome();
        System.out.println("checkPalindrome() of " + s1.getContent() + " has result: " + result);
        
        s1.setContent("ABBA");
        result = s1.checkPalindrome();
        System.out.println("checkPalindrome() of "+ s1.getContent() + " has result: " + result);
        
        s1.setContent("ABCAB");
        result = s1.checkPalindrome();
        System.out.println("checkPalindrome() of "+ s1.getContent() + " has result: " + result);
        
        s1.setContent("a1b1a");
        result = s1.checkPalindrome();
        System.out.println("checkPalindrome() of "+ s1.getContent() + " has result: " + result);
        
        
    }
    
    
}
