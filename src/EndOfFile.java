import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-end-of-file?isFullScreen=true
*  */
public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()) {
            System.out.println(i++ + " " + scan.nextLine());
        }
        scan.close();
    }
}
