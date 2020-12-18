public class CaesarCipher
{
    public static String Encryptor(String code, int offset2)
    {
        /*Scanner scanXD = new Scanner(System.in);
        System.out.print("What message would you like to decrypt? ");
        String ciphertext = scanXD.nextLine();
        System.out.print("What is the key for the cipher? ");
        Scanner scanXD2 = new Scanner(System.in);*/
        int offset = offset2 % 26;
        String plaintext = "";
        for (int i = 0; i < code.length(); i++) {
            String c1 = code.substring(i, i+1);
            int realid = 0;
            char c = c1.charAt(0);
            if (c <= 'z' && c >= 'a') {
               realid = 97 + (c-97 + offset)%26;
            }
            else if (c <= 'Z' && c >= 'A') {
               realid = 65 + (c-65 + offset)%26;
            }
            char realchar = (char)realid;
            plaintext += realchar;
        }
        return plaintext;
    }
    public static String Decryptor(String code, int offset2)
    {
        /*Scanner scanXD = new Scanner(System.in);
        System.out.print("What message would you like to decrypt? ");
        String ciphertext = scanXD.nextLine();
        System.out.print("What is the key for the cipher? ");
        Scanner scanXD2 = new Scanner(System.in);*/
        int offset = offset2 % 26;
        String plaintext = "";
        for (int i = 0; i < code.length(); i++) {
            String c1 = code.substring(i, i+1);
            int realid = 0;
            char c = c1.charAt(0);
            if (c <= 'z' && c >= 'a') {
               realid = 97 + (26-Math.abs(c-97 - offset)%26);
            }
            else if (c <= 'Z' && c >= 'A') {
               realid = 65 + (26-Math.abs(c-65 - offset)%26);
            }
            char realchar = (char)realid;
            plaintext += realchar;
        }
        return plaintext;
    }

}

