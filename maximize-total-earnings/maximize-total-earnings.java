import java.util.*;

class Main {
    public static int solve(int N, int K, int[] a) {
        int total = 0;

        for (int i = 0; i < N; i++) {
            if (i > 0 && i % K == 0) {
                total += a[i] * 2;
            } else {
                total += a[i];
            }
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
        sc.close();
    }
}
