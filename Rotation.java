public class Rotation {
    static int finding(int[] arr) {
        int low = 0, high = arr.length - 1;
        int answer = 0;
        int Rotation = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] < arr[mid]) {
                answer = Math.min(answer, arr[low]);
                high = mid - 1;
                Rotation++;
            } else {
                low = mid + 1;
                answer = Math.min(answer, arr[mid]);
                Rotation++;
            }
        }
        return Rotation;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };

        int ans = finding(arr);
        System.out.println(ans);
    }
}
