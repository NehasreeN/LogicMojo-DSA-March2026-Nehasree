// Problem: Find Missing & Repeating Number
// Platform: HackerRank - LogicMojo DSA March 2026
// Topic: Arrays
// Approach: HashSet to detect repeating, then scan 1..n for missing

import java.util.*;

class Result {
    /*
     * Complete the 'find_missing' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> find_missing(List<Integer> arr) {
        int n = arr.size();
        Set<Integer> set = new HashSet<>();
        int repeating = -1;
        int missing = -1;

        for (int num : arr) {
            if (set.contains(num)) {
                repeating = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
