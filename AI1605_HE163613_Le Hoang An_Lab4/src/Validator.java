/**
 *
 * @author edward
 */
import java.util.Scanner;

public class Validator {

    Scanner sc = new Scanner(System.in);

    String CheckTxt(String Mess, String regex) {
        String txt;
        do {
            System.out.print(Mess);
            txt = sc.nextLine();
            if (txt.matches(regex)) {
                break;
            }
            System.out.println("Invalid input, please try again (format: '" + regex + "'");
        } while (true);
        return txt;

//    String Name = CheckTxt("Enter your name: ", "[a-zA-Z]+");
//    String Addr = CheckTxt("Enter your address: ", "[a-zA-Z0-9]*");
//    String Phone = CheckTxt("Enter your phone: ", "(\\+[0-9]{1,2})?[0-9]{8,11}");
//    String Email = CheckTxt("Enter your email: ", "[a-zA-Z]\\w+@\\w+(\\.[a-zA-Z0-9]+){1,3}");
    }

    int CheckInt(String Mess, int Min, int Max) {
        int num;
        do {
            System.out.print(Mess);
            try {
                num = Integer.parseInt(sc.nextLine().trim());
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range, please enter in range: " + Min + " to " + Max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, accept integer number only!");
            }
        } while (true);
        return num;

        /*
        int choice = CheckInt("Enter your choice: ", 1, 3);
        int size = CheckInt("Enter a size of array", 1, 100);
        int element = CheckInt("Enter an integer: ", Integer.MIN_VALUE,
            Integer.MAX_VALUE);           // -2^31 : 2^31 - 1
         */
    }
    
    double CheckDouble(String Mess, double Min, double Max) {
        double num;
        do {
            System.out.print(Mess);
            try {
                num = Double.parseDouble(sc.nextLine().trim());
                if (num >= Min && num < Max) {
                    break;
                }
                System.out.println("Out of range, please enter in range: " + Min + " to " + Max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, accept integer number only!");
            }
        } while (true);
        return num;

        /*
        int choice = CheckInt("Enter your choice: ", 1, 3);
        int size = CheckInt("Enter a size of array", 1, 100);
        int element = CheckInt("Enter an integer: ", Integer.MIN_VALUE,
            Integer.MAX_VALUE);           // -2^31 : 2^31 - 1
         */
    }

}
