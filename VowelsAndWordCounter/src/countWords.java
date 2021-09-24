public class countWords {
    public int ProcessData(String s){
        if (s == null || s.isEmpty()){
            return 0;
        }
        
        String[] words = s.split("\\s+");
        
        return words.length;
    }
}
