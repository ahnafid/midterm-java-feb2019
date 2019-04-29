package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);

        int LowDiffer1 = array1[1]-array1[0];
        for(int t = 2;t!=array1.length;t++){
            LowDiffer1=Math.min(LowDiffer1,array1[t]-array1[t-1]);
        }
        System.out.println("lowest difference in array1 :"+LowDiffer1);

        System.out.println("\n");
        int LowDiff2 = array2[1]-array2[0];
        for(int k = 2;k!=array2.length;k++){
            LowDiff2=Math.min(LowDiff2,array2[k]-array2[k-1]);
        }
        System.out.println("lowest dfference in array2 :"+LowDiff2);
        if(LowDiffer1>LowDiff2){
            System.out.println("lowest difference between both arrays :"+LowDiff2 );
        }else if(LowDiffer1<LowDiff2){
            System.out.println("lowest difference between both arrays :"+LowDiffer1);
        }else if(LowDiffer1==LowDiff2){
            System.out.println("lowest difference between both arrays :"+LowDiffer1);
        }



    }


}
