import java.util.HashMap;

public class Alphabet {

    public static HashMap<Character, Integer> getCharacterIntegerHashMap() {
    HashMap<Character, Integer> hej = new HashMap<>();
    char [] alfabet = {'+','§','$','_',' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't','u','v', 'w', 'x', 'y','z','æ','ø','å',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T','U','V', 'W', 'X', 'Y','Z','Æ','Ø','Å',
            '!', '"', '#', '€', '%', '&', '/', '(', ')', '=', '?', '`', '´', '*', '^', '¨', '[', ']', '{', '}'};

    for(int i = 0; i < alfabet.length; i++) {
        hej.put(alfabet[i], i);
    }
    return hej;
}

}
