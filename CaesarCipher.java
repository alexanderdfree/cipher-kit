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
        for (int i = 0; i < code.length()+1; i++) {
            char c = code.charAt(i);
            int realid = (c + offset - 96) % 26;
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

