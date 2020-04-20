package src.newocode.order;

/**
 * 插入排序
 */
public class InsertOrder {
    public static int[] insertOrder(int[] arr) {
        int leg = arr.length;
        if (leg < 2) {
            return arr;
        }
        for (int i = 1; i < leg; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] strs, int i, int j) {
        int string = strs[i];
        strs[i] = strs[j];
        strs[j] = string;
    }
}
