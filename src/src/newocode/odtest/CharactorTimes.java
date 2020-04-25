package src.newocode.odtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactorTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

    }

    public static Map times(String str, boolean Ignore) {
        Map result = new HashMap<Character, Integer>();
        if (!Ignore) {
            str = str.toLowerCase();
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.get(ch) != null) {
                int charTimes = (int) result.get(ch) + 1;
                result.put(ch,charTimes);
            }else {
                result.put(ch,1);
            }
        }
        return result;
    }

}
