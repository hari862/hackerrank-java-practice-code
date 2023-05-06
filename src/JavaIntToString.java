import java.util.*;
import java.security.*;
    public class JavaIntToString {
        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                in.close();
                String s = n + "";
                // String s = Integer.toString(number);
                // String s = String.valueOf(number);

                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
        }
    }