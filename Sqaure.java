public class Sqaure {
    static int finding(int n) {
        int answer = 0;
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid * mid) <= n) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 28;
        int answer = finding(n);
        System.out.println(answer + " ");
    }
}
