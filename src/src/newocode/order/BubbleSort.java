package src.newocode.order;

/**
 * 冒泡排序
 * @author xixi
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {

        int leg = arr.length;

        for (int i = 0; i < leg; i++) {
            for (int j = 0; j < leg - i - 1; j++) {
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }


        return arr;
    }
}
