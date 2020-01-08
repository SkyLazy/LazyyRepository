package src.sort;

public class BubbleSort {
    public static void bubblesort(int s[]) {
        int lenth = s.length;
        int tmp;
        for(int i=0;i<lenth-1;i++){
            for(int j=0;j<lenth-1;j++){
                if(s[j]>s[j+1]){
                    tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        bubblesort(a);
        for (int b : a) {
            System.out.println(b);
        }
    }
}
