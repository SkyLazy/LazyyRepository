package src.newocode.Str;

import java.util.*;

public class StrMain {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            List<String> lStr = new ArrayList();
            int tmp=2;
            while(tmp-- > 0){
                lStr.add(in.nextLine());
            }
            List<String> lRStr = new ArrayList();
            lRStr = cut8Str(lStr);
            lRStr.forEach((str)->System.out.println(str));

    }

        public static List cut8Str(List<String> lStr){
            List lresult = new ArrayList();
            for(int i = 0; i < lStr.size(); i++){
                String strT = lStr.get(i);
                int length = strT.length();
                int subLength = length % 8;
                if(subLength != 0){
                    for(int j =0; j<8-subLength; j++){
                        strT = strT + "0";
                    }
                }

                StringBuffer stb = new StringBuffer();

                for(int k = 0; k<strT.length()/8; k++){
                    lresult.add(strT.substring(k*8,(k+1)*8));
                }

            }

            return lresult;
    }
}
