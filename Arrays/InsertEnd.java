public class InsertEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int value = 10;
        arr[arr.length - 1] = value;
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
