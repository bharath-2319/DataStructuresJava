public class Allocation {
    static int sum(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int students(int[] arr, int pages) {
        int students = 1, pagesStudent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    static int checking(int[] arr, int students) {
        int low = max(arr), high = sum(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int studentscount = students(arr, mid);
            if (studentscount > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int students = 4;

        int answer = checking(arr, students);
        System.out.println(answer);
    }
}
