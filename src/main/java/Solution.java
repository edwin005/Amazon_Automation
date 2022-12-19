import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        int [] values = {3,4,5,63,2,-2,3,5,0};
        computeClosestToZero(values);
    }

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int result = 0;
        if(ts.length!=0){
            int [] negative = {};
            int [] positive = {};
            for(int i=0; i< ts.length; i++){
                if(ts[i]>=0){
                    positive[i]= ts[i];
                }else{
                    negative[i] = ts[i];
                }
            }

            int max = Arrays.stream(positive).min().getAsInt();
            int min = Arrays.stream(negative).max().getAsInt();

            if((max+min)>0){
                result = min;
            }else{
                result = max;
            }

        }
        return result;
    }

    /* Ignore and do not change the code above */
}