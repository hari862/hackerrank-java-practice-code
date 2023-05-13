import java.io.*;
        import java.util.*;

        //https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String output = checkPalindrome(A)?"Yes":"No";
        System.out.println(output);
    }

    public static boolean checkPalindrome(String s) {
        char[] chArr = s.toCharArray();
        char temp ;

        for(int left=0, right=s.length()-1;left<right;left++, right--){
            temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;
        }
        String reversedString = new String(chArr);

        return reversedString.equals(s);
    }
}



