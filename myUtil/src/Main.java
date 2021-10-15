
import java.util.Random;

public class Main {

    // sinh ngau nhien mot so nguyen 
    public static int randInt() {
        Random rand = new Random();

        return rand.nextInt(Integer.MAX_VALUE);
    }s

    // sinh ngau nhien mot so nguyen trong khoang
    public static int randIntInRange(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // sinh ngau nhien mot chat lieu
    public static String getRandomPaintingMaterial() {
        String[] material = {"paper", "wood", "leather", "canvas", "wall"};
        return material[randIntInRange(0, material.length)];
    }
    
    public static String getRandomVaseMaterial() {
        String[] material = {"ceramic", "plastic", "glass", "stone", "wood","plantinum", "gold", "silver", "carbon fiber"};
        return material[randIntInRange(0, material.length)];
    }
    public static String getRandomStatueMaterial() {
        String[] material = {"ceramic", "glass", "stone", "plastic","wood", "plantinum", "gold", "silver", "diamond", "carbon fiber"};
        return material[randIntInRange(0, material.length)];
    }

    public static String getRandomColor() {
        String[] color = {"red", "white", "blue", "yellow", "green", "gold", "navi", "pink", "grey", "silver"};
        return color[randIntInRange(0, color.length)];
    }

    // sinh ngau nhien mot chuoi n ki tu
    public static String randomCharacter(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
    
    public static String[] getRandomWords(int numberOfWords) {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++){
            char[] word = new char[random.nextInt(8) + 3];         // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++){
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }
    
    public static String getRandomWord2(int numberOfWords){
        String randomStrings = "";
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++){
            String word = randomCharacter(randIntInRange(3, 8));     // a word can contains 3 to 8 characters
            randomStrings += word + " ";
        }
        return randomStrings.trim();
    }

    public static String getLastnameFromFullName(String fullname) {
        return fullname.substring(fullname.lastIndexOf(" ") + 1);
    }

    public static String getRandomFirstName() {
        String[] name = {"Nguyen", "Le", "Tran", "Bui", "Pham", "Phan", "Ho", "Vuong", "Trinh", "Dang", "Hoang", "Vu", "Can", "Lai", "Cao"};
        return name[randIntInRange(0, name.length - 1)];
    }

    public static String getRandomLastName() {
        String[] name = {"Long", "Ly", "Hoang", "Hong", "Hanh", "Hang", "Thao", "Anh", "An", "Viet", "Nam", "Phong", "Phuong", "Trong", "Lam"};
        return name[randIntInRange(0, name.length - 1)];
    }	
   
}
