package DataStructuresJava.Arrays;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
    }
}
