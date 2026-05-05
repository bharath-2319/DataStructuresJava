public class LowerBound {

    public int lower(int[] arr, int target) {
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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
        int target = 7;

        LowerBound ll = new LowerBound();
        int answer = ll.lower(arr, target);
        System.out.println(answer + " is the lower bound");
    }
}