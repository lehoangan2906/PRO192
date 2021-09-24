class CeasarCipher {
    int key = 13;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
//    formula to get encrypted letter will be :
//
//    e = (x + n) mod 26
//
//    where,
//    n is the number of positions we need to shift plaintext characters
//    x is the place value of original letter
//    e is the place value of encrypted letter
//
//    On the other hand, we will use the below formula to decrypt each letter.
//
//    e = (x - n) mod 26
    
    
//    Pseudo Code:
//    Input : String plaintext
//    Input : An integer between 0 and 25 representing the right shift of the character  or, 
//    an integer between -25 and -1 representing the left shift of the characters. 
//    Traverse each character in the plaintext one at a time
//    Transform the given character depending on encryption or decryption.
//    print the ciphertext.

//    public StringBuffer encrypt(String plaintext){
//        StringBuffer result= new StringBuffer();
// 
//        for (int i=0; i < plaintext.length(); i++){
//            if (Character.isUpperCase(plaintext.charAt(i))){
//                char ch = (char)(((int)plaintext.charAt(i) + key - 65) % 26 + 65);
//                result.append(ch);
//            }
//            else if(Character.isLetter(plaintext.charAt(i)) == false){
//                result.append(plaintext.charAt(i));
//            }
//            else{
//                char ch = (char)(((int)plaintext.charAt(i) + key - 97) % 26 + 97);
//                result.append(ch);
//            }
//        }
//        return result;
//    }
//    
//    public StringBuffer decrypt(String ciphertext){
//        StringBuffer result= new StringBuffer();
// 
//        for (int i=0; i<ciphertext.length(); i++){
//            if (Character.isUpperCase(ciphertext.charAt(i))){
//                char ch = (char)(((int)ciphertext.charAt(i) + (26 - key) - 65) % 26 + 65);
//                result.append(ch);
//            }
//            else if(Character.isLetter(ciphertext.charAt(i)) == false){
//                result.append(ciphertext.charAt(i));
//            }
//            else{
//                char ch = (char)(((int)ciphertext.charAt(i) + (26- key) - 97) % 26 + 97);
//                result.append(ch);
//            }
//        }
//        return result;    
//    }
    
    public String encryptMessage(String plaintext) {
        char[] chars = plaintext.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z')
                chars[i] = (char) ((c - 'A' + key) % 26 + 'A');
            else if (c >= 'a' && c <= 'z')
                chars[i] = (char) ((c - 'a' + key) % 26 + 'a');
        }
        return new String(chars);
    }
    
    public String decryptMessage(String ciphertext) {
        char[] chars = ciphertext.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z')
                chars[i] = (char) ((c - 'A' + (26- key)) % 26 + 'A');
            else if (c >= 'a' && c <= 'z')
                chars[i] = (char) ((c - 'a' + (26 - key)) % 26 + 'a');
        }
        return new String(chars);
    }

}
