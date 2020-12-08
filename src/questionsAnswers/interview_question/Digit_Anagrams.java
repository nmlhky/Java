package questionsAnswers.interview_question;


public class Digit_Anagrams {
    public static void main(String[] args) {
        int[] a = {25,35,872,228,53,278,872};
        System.out.println(digitAnagrams(a));
    }

    public static long digitAnagrams(int[] a){

        long count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (areAnagrams(a[i],a[j])) count++;
            }
        }

        return count;
    }

    static void updateFreq(int n, int [] freq)
    {
        // While there are digits
        // left to process
        while (n > 0)
        {
            int digit = n % 10;

            // Update the frequency of
            // the current digit
            freq[digit]++;

            // Remove the last digit
            n /= 10;
        }

    }

    // Function that returns true if a and b
    // are anagarams of each other
    static boolean areAnagrams(int a, int b)
    {

        // To store the frequencies of
        // the digits in a and b
        int [] freqA = new int[10];
        int [] freqB = new int[10];

        // Update the frequency of
        // the digits in a
        updateFreq(a, freqA);

        // Update the frequency of
        // the digits in b
        updateFreq(b, freqB);

        // Match the frequencies of
        // the common digits
        for (int i = 0; i < 10; i++)
        {

            // If frequency differs for any digit
            // then the numbers are not
            // anagrams of each other
            if (freqA[i] != freqB[i])
                return false;
        }
        return true;
    }



}
