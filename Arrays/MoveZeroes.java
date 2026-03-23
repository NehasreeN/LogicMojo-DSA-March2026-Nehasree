// Problem: Move Zeroes
// Platform: HackerRank - LogicMojo DSA March 2026
// Topic: Arrays
// Approach: Two pointers - swap non-zero elements to front, zeroes settle at end

import java.util.*;

class Result {
    /*
     * Complete the 'move_func' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */
    public static List<Integer> move_func(int n, List<Integer> arr) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != 0) {
                int temp = arr.get(i);
                arr.set(i, arr.get(k));
                arr.set(k, temp);
                k++;
            }
        }
        return arr;
    }
}
