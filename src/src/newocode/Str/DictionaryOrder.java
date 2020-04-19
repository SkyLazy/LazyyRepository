package src.newocode.Str;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 对于输入的字符串组按照字典顺序排列
 */
public class DictionaryOrder {
    public static void main(String[] args) {
        String[] strs = {"cap", "to", "cat", "card", "two", "too", "up", "boat", "boot" };
        List orderList = Arrays.asList(dictionaryOrder(strs,0));
        //List orderList = Arrays.asList(strs);
        //Collections.sort(orderList);
        orderList.forEach((str) -> System.out.println(str));

    }

    public static String[] dictionaryOrder(String[] str, int index) {
        if (str.length == 0) {
            return null;
        }
        //在前面的字符都相同的情況下，按照index位置進行排序
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {
                char chi = str[i].length() < index ? str[i].toUpperCase().charAt(index) : 0;
                char chj = str[i].length() < index ? str[j].toUpperCase().charAt(index) : 0;
                if (chi > chj) {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        //根据已经排好序的字符进行分組
        dictionaryOrder(str,index+1);
        return str;
    }
}
