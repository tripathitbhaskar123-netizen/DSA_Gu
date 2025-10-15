import java.util.Scanner;

public class Q1_InsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();
        System.out.print("Enter position (0-" + n + "): ");
        int pos = sc.nextInt();

        int[] newArr = new int[n + 1];
        for (int i = 0; i < pos; i++) newArr[i] = arr[i];
        newArr[pos] = x;
        for (int i = pos; i < n; i++) newArr[i + 1] = arr[i];

        System.out.print("After insertion: ");
        for (int val : newArr) System.out.print(val + " ");
        System.out.println();

        System.out.print("Enter position to delete: ");
        int delPos = sc.nextInt();
        int[] delArr = new int[newArr.length - 1];
        for (int i = 0, j = 0; i < newArr.length; i++)
            if (i != delPos) delArr[j++] = newArr[i];

        System.out.print("After deletion: ");
        for (int val : delArr) System.out.print(val + " ");
    }
}
