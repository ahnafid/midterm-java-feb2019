package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram anagram = new Anagram();
        String firstword = "CAT";
        String secondword = "ACT";
        char [] arrarytochararrayA = firstword.toCharArray();
        char [] arraytochararrayB = secondword.toCharArray();
        Arrays.sort(arrarytochararrayA);
        Arrays.sort(arraytochararrayB);
        if(Arrays.equals(arrarytochararrayA,arraytochararrayB)){
            System.out.println("the word are Anangram");
        }else
            System.out.println("the wordare not Anangram");
    }
}
