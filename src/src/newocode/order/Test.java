package src.newocode.order;

public class Test {
    public static void main(String[] args) {
        int[] sortList = {4,3,5,63,2,7,23,7};
        //sortList = BubbleSort.bubbleSort(sortList);
        //sortList = SelectOrder.selectOrder(sortList);
        //sortList = InsertOrder.insertOrder(sortList);
        FastOrder.fastOrder(sortList,0,sortList.length-1);
        for (int obj : sortList){
            System.out.println(obj);
        }
    }
}
