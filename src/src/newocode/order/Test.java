package src.newocode.order;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] sortList = {4,3,5,63,2,7,23,7};
        sortList = BubbleSort.bubbleSort(sortList);
        for (int obj : sortList){
            System.out.println(obj);
        }
    }
}
