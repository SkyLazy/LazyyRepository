package src.newocode.order;

/**
 * 快速排序
 */
public class FastOrder {
    public static void fastOrder(int[] arr, int low, int high) {
        if (high - low < 1) {
            return;
        }

        int start = low, end = high;
        boolean flag = true;
        int midValue = arr[low];
        while (true) {
            if (flag) {
                //注意=,若不写=，则死循环
                if (arr[high] >= midValue) {
                    high--;
                } else if (arr[high] < midValue) {
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                if (arr[low] <= midValue) {
                    low++;
                } else if (arr[low] > midValue) {
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }

            if (low == high) {
                arr[low] = midValue;
                break;
            }
        }

        fastOrder(arr, start, low - 1);
        fastOrder(arr, high + 1, end);
    }
}
