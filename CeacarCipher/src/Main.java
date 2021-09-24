import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        CeasarCipher ccp = new CeasarCipher();
        
        ccp.setKey(7);
        
        System.out.print("Input the message you want to encrypt: ");
        String plaintext = sc.nextLine();

        String ciphertext = ccp.encryptMessage(plaintext);
        
        System.out.println("The message that is encrypted: " + ciphertext);
        
        String encrypted= ccp.decryptMessage(ciphertext);
        System.out.println("The message you want to decrypt: " + encrypted);
    }
    
}
