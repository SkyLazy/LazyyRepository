package src.newocode.order;

public class SelectOrder {
    public static int[] selectOrder(int[] arr) {
        int leg = arr.length;
        if (leg < 2) {
            return arr;
        }
        for (int i = 0; i < leg; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < leg; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr, i, index);
        }
        return arr;
    }

    public static void swap(int[] strs, int i, int j) {
        int string = strs[i];
        strs[i] = strs[j];
        strs[j] = string;
    }
}
