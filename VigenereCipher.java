public class VigenereCipher{
   public static String Encryptor(String plaintext, String key){
        String code = "a";
        String keyFull = "";
        for (int i = 0; i < plaintext.length(); i++) {
            int iReset = i-key.length();
            if (i >= key.length()){
               //for loop
               keyFull += key.substring(iReset, iReset+1); 
            }
            else{
               keyFull += key.substring(i, i+1);
            }
        }
        for (int i = 0; i < plaintext.length(); i++) {
            String c1 = plaintext.substring(i, i+1);
            String c11 = keyFull.substring(i, i+1);
            int realid = 0;
            char c = c1.charAt(0);
            char d = c11.charAt(0);
            
            int keyInt = (char)c;
            if (c <= 'z' && c >= 'a') {
               keyInt = (((char)c-97)+((char)d)-97)%26+1;
               realid = 97 + keyInt;
            }
            else if (c <= 'Z' && c >= 'A') {
               keyInt = (((char)c-65)+((char)d)-65)%26+1;
               realid = 65 + keyInt;
            }
            char realchar = (char)realid;
            code += realchar;
        }
        return code;
   }
   public static String Decryptor(String code, String key){
        String plaintext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            String c1 = plaintext.substring(i, i+1);
            String c11 = keyFull.substring(i, i+1);
            int realid = 0;
            char c = c1.charAt(0);
            char d = c11.charAt(0);
            
            int keyInt = (char)c;
            if (c <= 'z' && c >= 'a') {
               keyInt = (((char)c-97)+((char)d)-97)%26+1;
               realid = 97 + keyInt;
            }
            else if (c <= 'Z' && c >= 'A') {
               keyInt = (((char)c-65)+((char)d)-65)%26+1;
               realid = 65 + keyInt;
            }
            char realchar = (char)realid;
            plaintext += realchar;
        }
        return plaintext;
   }
}