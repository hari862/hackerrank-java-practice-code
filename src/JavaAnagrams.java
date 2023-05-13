import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> ma = new HashMap<Character, Integer>();
        Map<Character, Integer> mb = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
            int a1 = 65;
            ma.put((char) (a1 + i), 0);
            mb.put((char) (a1 + i), 0);
        }

//        System.out.println(ma);
//        System.out.println(mb);

        a = a.toUpperCase();
        b = b.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            ma.put(a.charAt(i), ma.get(a.charAt(i)) + 1);
            mb.put(b.charAt(i), mb.get(b.charAt(i)) + 1);
        }

        return ma.equals(mb);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagramsJava8(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagramsJava8(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();

        Arrays.sort(ac);
        Arrays.sort(bc);

        // return Arrays.equals(ac, bc);

        for (int i = 0; i < ac.length; i++)
            if (ac[i] != bc[i]) return false;
        return true;
    }


}

