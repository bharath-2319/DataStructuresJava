package practice;

public class Occurence {
    static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int UpperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] occurences(int[] arr, int target) {
        int n = arr.length;
        int lowerBound = lowerBound(arr, target);
        if (lowerBound == n || arr[lowerBound] != target) {
            return new int[] { -1, -1 };
        }
        return new int[] { lowerBound, UpperBound(arr, target) - 1 };
    }

    public static int[] occurence(int[] arr, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 8 };
        int[] ans = occurences(arr, 7);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
