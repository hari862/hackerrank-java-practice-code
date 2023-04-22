import java.util.Scanner;

/*https://www.hackerrank.com/challenges/java-static-initializer-block?isFullScreen=true*/
public class JavaStaticInitializerBlock {

    static {
        Scanner scan = new Scanner(System.in);

        int breadth = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        if (breadth<=0 || height <=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(breadth*height);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}