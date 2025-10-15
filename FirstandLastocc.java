public class Practice2 {
    static int firstOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                result = mid;
                r = mid - 1;
            } else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return result;
    }

    static int lastOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                result = mid;
                l = mid + 1;
            } else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,4,4,4,5,5,6,6,6,7,7,7};
        int target = 2;
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
