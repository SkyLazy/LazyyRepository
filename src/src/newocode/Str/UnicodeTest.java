package src.newocode.Str;

public class UnicodeTest {


    public static void main(String[] args) {
        int b = 'A';
        System.out.println(b);
        System.out.println(SToN("0xC460"));

    }
    public static int SToN(String str){
        str = str.toUpperCase();
        str = str.substring(2,str.length());

        int sum = 0;
        for(int i = str.length()-1; i >= 0 ; i--){
            char ch = str.charAt(i);
            int times = str.length() - i -1;
            int timePlus = 1;
            while(times-- > 0){
                timePlus *= 16;
            }
            if(ch >= 'A' && ch <= 'Z'){
                sum = sum + (ch-'A'+ 10)*timePlus;
            }else{
                sum = sum + (ch-'0')*timePlus;
            }
        }

        return sum;

    }

}
