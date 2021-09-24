import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = sc.nextLine();
        countVowels count = new countVowels();
        countWords cw = new countWords();
        
        System.out.println("Number of vowels in the string: " + count.ProcessData(str));
        System.out.println("Number of words in the string: " + cw.ProcessData(str));
    }
    
}
