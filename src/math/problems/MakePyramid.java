package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */
        int r =8;
        for (int d =0;d<r;d++){
            for(int s =r-1;s>=d;s--){
                System.out.print(" ");
            }
            for (int e =0;e<=d;e++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }



    }
}
