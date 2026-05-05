public class Searching {

    public int[] search(int[] arr, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7, 8 };
        Searching s = new Searching();
        int[] answer = s.search(arr, 6);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i] + " ");
        }
    }
}