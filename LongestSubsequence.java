package Array;

import java.util.Arrays;

public class LongestSubsequence {
    public static void main(String[] args) {
        int a[] = { 1, 2, 0, 4, 5, 8, 9, 11, 11 };
        int longArray = LongestSubsequence.longArray(a);
        System.out.println(longArray);
    }

    private static int longArray(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        
        int n = a.length;
        int longestArrays[] = new int[n];
        Arrays.fill(longestArrays, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && longestArrays[i] < longestArrays[j] + 1) {
                    longestArrays[i] = longestArrays[j] + 1;
                }
            }
        }

        int lms = 0;
        for (int i : longestArrays) {
            lms = Math.max(lms, i);
        }

        return lms;
    }
}
