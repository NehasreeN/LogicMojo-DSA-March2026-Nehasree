// Problem: Sort an Array of 0, 1, 2 (Dutch National Flag)
// Platform: HackerRank - LogicMojo DSA March 2026
// Topic: Arrays
// Approach: Dutch National Flag algorithm with 3 pointers (low, mid, high)

import java.util.*;

class Result {
    /*
     * Complete the 'sort_an_array' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */
    public static List<Integer> sort_an_array(int n, List<Integer> arr) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
        return arr;
    }
}
