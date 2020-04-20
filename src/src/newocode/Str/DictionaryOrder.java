package src.newocode.Str;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 对于输入的字符串组按照字典顺序排列
 */
public class DictionaryOrder {
    public static void main(String[] args) {
        String[] strs = {"cap", "to", "cat", "card", "two", "too", "up", "boot", "boat"};
        dictionaryOrder(strs, 0, strs.length, 0);
        List orderList = Arrays.asList(strs);
        //Collections.sort(orderList);
        orderList.forEach((str) -> System.out.println(str));

    }

    public static void dictionaryOrder(String[] strs, int begin, int end, int index) {
        if (end - begin == 1) return;
        int max = 0;
        for (int i = begin; i < end; i++) {
            max = strs[i].length() > max ? strs[i].length() : max;
        }
        if (index > max) return;
        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                char chi = strs[i].length() > index ? strs[i].charAt(index) : 0;
                char chj = strs[j].length() > index ? strs[j].charAt(index) : 0;
                if (chi > chj) {
                    swap(strs, i, j);
                }
            }
        }

        for (int i = begin + 1; i < end; i++) {
            int fornt = strs[i - 1].length() < index + 1 ? strs[i - 1].length() : index + 1;
            int last = strs[i].length() < index + 1 ? strs[i].length() : index + 1;
            //boat boot 他们bo字段处会相等，会导致不进行下去
            if (!strs[i - 1].substring(0, fornt).equals(strs[i].substring(0, last))) {
                dictionaryOrder(strs, begin, i, index + 1);
                begin = i;
            }
            if (i == end - 1){
                dictionaryOrder(strs, begin, end, index + 1);
            }
        }
    }

    public static void swap(String[] strs, int i, int j) {
        String string = strs[i];
        strs[i] = strs[j];
        strs[j] = string;
    }

}
