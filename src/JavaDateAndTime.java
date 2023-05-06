import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();

        // months start from Jan=0 to Dec=11
        cal.set(year,month-1,day);

        //Approach 1:
        //int i = cal.get(Calendar.DAY_OF_WEEK); Sunday =1 and Saturday = 7
        //String days_of_week[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        //System.out.println("date = " + date + " day of week = "+ i + " dayOfWeek = " + dayOfWeek);

        // Approach 2:
        Date date = cal.getTime();

        // Simple Date Format documentation :
        // Text: For formatting, if the number of pattern letters is 4 or more, the full form is used; otherwise a short or abbreviated form is used if available. For parsing, both forms are accepted, independent of the number of pattern letters.
        SimpleDateFormat sf = new SimpleDateFormat("EEEE");
        return sf.format(date).toUpperCase();
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // \\s+$
        // here 2 effectively regex is \s+$
        // \\ one \ is used to escape the \ in \s+$
        // s means any whitespace character
        // + means one or more occurrence
        // $ means do the matching at the end of line.
        // effectively the regex wants to replace all the trailing spaces with "".
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);

        bufferedReader.close();
    }
}
