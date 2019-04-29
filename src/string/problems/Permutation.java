package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Permutation perm = new Permutation();
        String permutationOf = "ABC";
        perm.permutation(permutationOf, 0,permutationOf.length()-1);

    }
    public void permutation (String p,int k, int m){
        if (k==m)
            System.out.println(p);
        else{
            for (int a =k;a<=m;a++){
                p = swap(p,k,a);
                permutation(p,k+1,m);
                p =swap(p,k,a);

            }

        }
    }public String swap (String c,int b,int d){
        char temp;
        char []chararray = c.toCharArray();
        temp = chararray[b];
        chararray[b] = chararray[d];
        chararray[d] = temp;
        return String.valueOf(chararray);
    }
}
