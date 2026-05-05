public class Exam {

    static int checking(String str, int k) {
        char[] arr = str.toCharArray(); // convert to mutable array
        int count = 0;

        for (int i = 0; i < arr.length - 1 && k > 0; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                arr[i + 1] = arr[i];
                k--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "TTFF";
        int k = 1;

        int answer = checking(str, k);
        System.out.println(answer);
    }
}
