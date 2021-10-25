class CeasarCipher {
    int key = 13;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

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
