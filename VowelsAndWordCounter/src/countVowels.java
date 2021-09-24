public class countVowels {

    public int ProcessData(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'|| 
                s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count ++;
            }
        }
        return count;
    }
}
