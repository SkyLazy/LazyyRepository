package src.sort;

public class FastSort {
    public static void fastSort(int[] arr, int low, int high) {
        if (high - low < 1) {
            return;
        }

        int start = low, end = high;
        int midvalue = arr[low];
        boolean flag = true;
        while (true) {
            if (flag) {
                if (arr[high] >= midvalue) {
                    high--;
                } else {
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                if (arr[low] <= midvalue) {
                    low++;
                } else {
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }
            if (low == high) {
                arr[low] = midvalue;
                break;
            }
        }
        fastSort(arr, start, low - 1);
        fastSort(arr, low + 1, end);
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 6, 2, 4, 7, 2, 8, 56, 34, 2, 7, 5};
        fastSort(a, 0, a.length - 1);
        for(int b : a){
            System.out.println(b);
        }
    }
}
