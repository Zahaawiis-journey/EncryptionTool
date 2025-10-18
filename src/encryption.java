import java.util.HashMap;

public class encryption {


    public static StringBuilder encryptText(String text) {
        
    HashMap<Character, Integer> hej = Alphabet.getCharacterIntegerHashMap();

    StringBuilder combine = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
        if(hej.containsKey(text.charAt(i))) {
            int encrypt = hej.get(text.charAt(i)) * 3;
            combine.append(encrypt);
        }
    }
        return combine;
    }

    public static int [] getInputAndConvertToNumberBeforeEncrypt(String text) {
        int [] textToNumber = new int[text.length()];
        HashMap<Character, Integer> hej = Alphabet.getCharacterIntegerHashMap();
        for(int i = 0; i < text.length(); i++) {
            if(hej.containsKey(text.charAt(i))) {
                textToNumber[i] = hej.get(text.charAt(i));
            }
        }
        return textToNumber;
    }
    
    public static int[] convertTextToNumberArray(StringBuilder text) {
        String convertText = String.valueOf(text);
        int [] getAllNumbers = new int [convertText.length() / 2];
        for (int i = 0, j = 0; i < convertText.length(); i += 2, j++) {
            getAllNumbers[j] = Integer.parseInt(convertText.substring(i, i + 2));
        }
        return getAllNumbers;
    }

    public static int[] convertArrayEncryptedToOriginNumber(StringBuilder text) {
       int [] getAllNumbers = convertTextToNumberArray(text);
       int [] getAllNumbersConvert = new int[getAllNumbers.length];
       for(int i = 0; i < getAllNumbers.length; i++) {
           int convertNumber = getAllNumbers[i] / 3;
           getAllNumbersConvert[i] = convertNumber;
       }
        return getAllNumbersConvert;
    }

    public static StringBuilder convertNumberToText(StringBuilder text) {
        int [] getNumbers = convertArrayEncryptedToOriginNumber(text);
        HashMap<Character, Integer> map = Alphabet.getCharacterIntegerHashMap();
        StringBuilder decryptText = new StringBuilder();
        for(int i = 0; i < getNumbers.length; i++) {
            String key = String.valueOf(KeyFinder.getKey(map, getNumbers[i]));
            decryptText.append(key);
        }
        return decryptText;
    }
}
