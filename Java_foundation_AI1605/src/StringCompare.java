public class StringCompare {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1 == s2: "+ (s1 == s2));
        
        String s3 = new String("Hello");
        String s4 = new String ("Hello");
        System.out.println("s3 == s4: "+ (s3 == s4));

    }
}
