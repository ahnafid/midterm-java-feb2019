package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Palindrome palindrome = new Palindrome();
        String pal = "MADAM";
        palindrome.ispalindrome(pal);

    }
    public void ispalindrome (String pali){
        for (int a = 0;a<pali.length()/2;a++){
            if (pali.charAt(a)==pali.charAt(pali.length()-a-1)){
                System.out.println("the word is palindrome");
            }else
                System.out.println("the word is not palindrome");
        }
    }
}
