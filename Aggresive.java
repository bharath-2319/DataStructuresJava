public class Aggresive {

    static boolean isPossible(int[] arr, int cow, int distance) {

        int CowsCount = 1;
        int lastcow = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastcow >= distance) {
                CowsCount++;
                lastcow = arr[i];
            }
        }
        if (CowsCount >= cow) {
            return true;
        }
        return false;
    }

    static int count(int[] arr, int cows) {
        int n = arr.length;
        int low = 1, high = arr[n - 1] - arr[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 4, 7, 9, 10 };
        int cows = 4;

        int answer = count(arr, cows);
        System.out.println(answer + " ");
    }
}
