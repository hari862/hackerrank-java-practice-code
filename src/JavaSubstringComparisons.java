import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //ABCDE len = 5, k = 3, imax = 3 i.e. 5-3+1
        String curr ;
        for(int i=1; i<s.length()-k+1 ; i++) {
            curr = s.substring(i, i+k);
            if(curr.compareTo(smallest)<0) smallest=curr;
            if(curr.compareTo(largest)>0) largest=curr;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}