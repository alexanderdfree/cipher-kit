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
            char c = c1.charAt(0);
            if (c <= 'z' && c >= 'a') {
               int realid = 97 + (c-97 + offset)%26;
            }
            else if (c <= 'Z' && c >= 'A') {
               int realid = 65 + (c-65 + offset)%26;
            }
            
            char realchar = (char)realid;
            plaintext += realchar;
            
            
            /*if (xd <= 'z' && xd >= 'a') {
                z = (char)(xd-x);
                if (z < 'a') {
                    z = (char)(z + 1 -'a'+ 'z');
                }
                plaintext += z;
            }
            else if (xd <= 'Z' && xd >= 'A'){
                z = (char)(xd-x);
                if (z < 'A') {
                    z = (char)(z + 1 - 'A'+ 'Z');
                }
                plaintext += z;
            }
            else {
               plaintext += xd; 
            }
            gamerz = plaintext;*/
        }
        return plaintext;
    }

}

