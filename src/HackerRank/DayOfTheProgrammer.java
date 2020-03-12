package HackerRank;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class DayOfTheProgrammer {
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year == 1918 ){
            return "26.09.1918";
        }else if (((year <= 1917) && (year%4 == 0)) || ((year > 1918) && (year%400 == 0 || ((year%4 == 0) && (year%100 != 0))))){
            String day = "12.09." + year;
            return day;
        } else {
            String day = "13.09." + year;
            return day;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

