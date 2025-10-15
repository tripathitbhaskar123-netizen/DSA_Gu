public class Q4_MaxMin {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 33, 89, 1};
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
