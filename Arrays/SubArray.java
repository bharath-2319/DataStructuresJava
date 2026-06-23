package DataStructuresJava.Arrays;

import java.util.*;

public class SubArray {
    static int CoutingSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum = arr[i];
            int target = prefixSum - k;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 0, 1, 2, 0, 1, -1, 3 };
        int k = 3;
        int ans = CoutingSubarray(arr, k);
        System.out.println(ans);
    }
}
