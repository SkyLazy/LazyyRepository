package src.newocode.Str;

import java.util.Arrays;
import java.util.List;

/**
 * 对于输入的字符串组按照字典顺序排列
 */
public class DictionaryOrder {
    public static void main(String[] args) {
        String[] strs = {"cap", "to", "cat", "card", "two", "too", "up", "boot", "boat"};
        dictionaryOrder(strs, 0, strs.length, 0);
        List orderList = Arrays.asList(strs);
        //Collections.sort(orderList);//jdk默认实现
        orderList.forEach((str) -> System.out.println(str));

    }

    /**
     * end:分组的长度
     * index:字典位置(或者说字典长度,即每个字符串在0，index长度进行比较
     **/
    public static void dictionaryOrder(String[] strs, int begin, int end, int index) {
        //若分组只有一条数据,则直接返回
        if (end - begin == 1) return;

        int max = 0;
        for (int i = begin; i < end; i++) {
            max = strs[i].length() > max ? strs[i].length() : max;
        }
        //若分组中的每条数据的长度都小于当前比较位置,则直接返回
        if (index > max) return;

        //对分组中的每条数据，按照当前比较位置进行比较
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
            //若某条数据当前字典位置是该数据的最后一位,则不存在index+1,故取该条数据长度,长度不同,自然不等,从而分组
            int fornt = strs[i - 1].length() < index + 1 ? strs[i - 1].length() : index + 1;
            int last = strs[i].length() < index + 1 ? strs[i].length() : index + 1;
            //boot和boat 在比较bo位后,根据boo!=boa进行分组
            if (!strs[i - 1].substring(0, fornt).equals(strs[i].substring(0, last))) {
                dictionaryOrder(strs, begin, i, index + 1);
                begin = i;
            }
            //若该组不止一条数据，而且在index之后的一位也全都相同,例如 boot和boat在b之后 bo=bo,故需要此条逻辑
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
