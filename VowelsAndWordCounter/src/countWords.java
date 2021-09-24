
//Yêu cầu 2: nhập vào 1 chuỗi kí tự độ dài không quá 1000 kí tự
        //tiến hành thống kê tần suất xuất hiện của các từ (words), không phân biệt chữ hoa/ chữ thường, và không tính các dấu câu đi kèm

        //ví dụ: Hello Java world. Java is powerful. I love Java so much.
        //thì output là java(3) hello(1) is(1) love(1) much(1) powerful(1) so(1) world(1) 

        //thử tập sắp xếp theo 2 tiêu chí:
        //theo tần suất xuất hiện giảm dần, nếu cùng tần suất thì theo alphabet tăng dần (A-Z)
        //theo thứ tự alphabet của từ theo chiều tăng dần (A-Z)
import java.util.*;

class countWords {
    
    public void countFreq(String str){
        
        Map<String, Integer> map = new TreeMap<>();
        
        // Split the string to find the word
        String arr[] = str.split(" ");
        
        for (int i = 0; i < arr.length; i++){
            
            // check if the array element is in the hash map
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        // iterate over the map
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + "(" + entry.getValue() + ") ");
        }
    }
}
