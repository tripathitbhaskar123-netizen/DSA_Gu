public class Practice1 {
    public static boolean search(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,6};
        int target = 6;
        System.out.println(search(arr, target));
    }
}
