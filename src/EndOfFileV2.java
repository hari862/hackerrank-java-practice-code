import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.hackerrank.com/challenges/java-end-of-file?isFullScreen=true
*  */
public class EndOfFileV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        String str;
        while((str = bf.readLine()) != null) {
            System.out.println(i++ + " " + str);
        }
        bf.close();
    }
}
