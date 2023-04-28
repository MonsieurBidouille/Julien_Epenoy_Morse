package main;

import java.util.HashMap;
import java.util.Map;

public class Morse {

    public static String to_string(String txt) {
        String res = "";
        Map<String, String> code = new HashMap<String, String>();
        code.put(".-", "a");code.put("-...", "b");code.put("-.-.", "c");code.put("-..", "d");code.put("-.-..","ç");code.put(".", "e");code.put("..-.", "f");code.put("--.", "g");code.put("....", "h");code.put("..", "i");code.put(".---", "j");code.put("-.-", "k");code.put(".-..", "l");code.put("--", "m");code.put("-.", "n");code.put("---", "o");code.put(".--.", "p");code.put("q", "--.-");code.put(".-.", "r");code.put("...", "s");code.put("-", "t");code.put("..-", "u");code.put("...-", "v");code.put(".--", "w");code.put("-..-", "x");code.put("-.--", "y");code.put("--..", "z");code.put(".----", "1");code.put("..---", "2");code.put("...--", "3");code.put("....-", "4");code.put(".....", "5");code.put("-....", "6");code.put("--...", "7");code.put("---..", "8");code.put("----.", "9");code.put("-----", "0");
        String[] txtarr = txt.split("  ");
        for (int i =0 ; i<txtarr.length;i++){
            String[] wordarr = txtarr[i].split(" ");
            for(int j = 0 ; j <wordarr.length; j++){
                if(code.get(wordarr[j]) != null){
                res += code.get(wordarr[j]);}
            }
            res += " ";
        }
        return res;
    }
}
