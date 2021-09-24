
//Yêu cầu 1: nhập vào 1 chuỗi kí tự, tiến hành thống kê xem trong chuỗi đó, các nguyên âm xuất hiện với tần suất như thế nào
        //định dạng là a(m) e(n) i(k) o(l) u(x)
        //ví dụ: Ha noi mua thu
        //thì output là a(2) e(0) i(1) o(1) u(2)

public class countVowels {

    public int NumberofVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'|| 
                s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count ++;
            }
        }
        return count;
    }
    
    public void VowelAppearance(String s){
        int count[] = {0, 0, 0, 0, 0};
        for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == 'a'){
                 count[0] += 1;
             }
             else if(s.charAt(i) == 'e'){
                 count[1] += 1;
             }
             else if (s.charAt(i) == 'i'){
                 count[2] += 1;
             }
             else if (s.charAt(i) == 'o'){
                 count[3] += 1;
             }
             else if (s.charAt(i) == 'u'){
                 count[4] += 1;
             }
        }
        System.out.println("a(" + count[0] + ") " + "e(" + count[1] + ") " + "i(" + count[2] + ") " + "o(" + count[3] + ") " + "u(" + count[4] + ")");
    }
}
