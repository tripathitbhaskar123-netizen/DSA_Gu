public class Q11_Divisors {
    public static void main(String[] args) {
        int n = 36;
        System.out.print("Divisors of " + n + ": ");
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
    }
}
