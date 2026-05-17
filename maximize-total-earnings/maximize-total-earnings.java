import java.util.*;

class Main {
    public static int solve(int N, int K, int[] a) {
        int total = 0;
        boolean doubleNext = false;

        for (int i = 0; i < N; i++) {
            total += doubleNext ? a[i] * 2 : a[i];
            doubleNext = ((i + 1) % K == 0);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(solve(n, k, a));
        }
    }
}
