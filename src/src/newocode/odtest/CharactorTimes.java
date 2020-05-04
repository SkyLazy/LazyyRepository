package src.newocode.odtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xixi
 * @descrition 输出字符串中出现次数最多的字符, 与出现的次数, 字符串**** boolean,boolean可有可无,表示是否大小写敏感
 */
public class CharactorTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] strArray = str.split(" ");

        boolean ignore = strArray[strArray.length - 1].equalsIgnoreCase("false");

        int tlength = strArray.length;
        if (strArray.length > 1 && (strArray[strArray.length - 1].equalsIgnoreCase("false") || strArray[strArray.length - 1].equalsIgnoreCase("true"))) {
            tlength = strArray.length - 1;
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tlength; i++) {
            stringBuffer.append(strArray[i]);
        }

        Map<Character, Integer> result = times(String.valueOf(stringBuffer), ignore);

        int max = 0;
        char ch = 'a';
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > max) {
                //出现次数大者
                max = entry.getValue();
                ch = entry.getKey();
            }
            else if (entry.getValue() == max && entry.getKey() < ch) {
                //出现次数相同但是字符小
                ch = entry.getKey();
            }
        }
        System.out.println(ch + " " + max);

    }

    public static Map times(String str, boolean Ignore) {
        Map result = new HashMap<Character, Integer>(16);
        if (!Ignore) {
            str = str.toLowerCase();
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.get(ch) != null) {
                int charTimes = (int) result.get(ch) + 1;
                result.put(ch, charTimes);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }

}
