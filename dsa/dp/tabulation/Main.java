import java.util.*;

//public class Main {
//    static long mod = (long)1e9;
//    public static void main(String[] args) {
//        int[] p = {1,2,3};
//        System.out.println(solve(p));
//    }
//
//    static long solve(int[] p) {
//        int n = p.length;
//        int[] indegree = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            indegree[p[i]]++;
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            if (indegree[i] == 0) {
//                queue.add(i);
//            }
//        }
//        int[] dist = new int[n + 1];
//        while (!queue.isEmpty()) {
//            int u = queue.poll();
//            for (int v = u; v != -1; v = p[v - 1]) {
//                dist[v] = dist[u] + 1;
//                if (--indegree[p[v - 1]] == 0) {
//                    queue.add(p[v - 1]);
//                }
//            }
//        }
//        long res = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                if (dist[i] == dist[j] && dist[p[i - 1]] == dist[p[j - 1]] && p[i - 1] != j && p[j - 1] != i) {
//                    res++;
//                }
//            }
//        }
//        return res % mod;
//    }
//}
//public class Main {
//    static long mod = (long)1e9 + 7;
//    public static void main(String[] args) {
//        int N = 3;
//        int res =calculateStrings(N);
//        System.out.println(res);
//    }
//
//    public static int calculateStrings(int N) {
//
//        if (N <= 0) {
//            return 0;
//        }
//        if (N == 1) {
//            return 3;
//        }
//        long total = modPow(3, N, mod);
//        long withABC = (modPow(3, N-3, mod) * ((N-2) % mod)) % mod;
//        long res = ((total % mod) - (withABC % mod) + mod) % mod;
//        return (int)res;
//    }
//    public static long modPow(long a, long b, long mod) {
//        long res = 1;
//        while (b > 0) {
//            if ((b & 1) == 1) {
//                res = (res * a) % mod;
//            }
//            a = (a * a) % mod;
//            b >>= 1;
//        }
//        return res;
//    }

//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//        String L = scanner.next();
//        String R = scanner.next();
//        int res = countIntegers(K, L, R);
//        System.out.println(res);
//    }
//
//    public static int countIntegers(int K, String L, String R) {
//        long l = Long.parseLong(L);
//        long r = Long.parseLong(R);
//        boolean[] isPrime = sieveOfEratosthenes(K);
//        int total = (int) (r - l + 1);
//        for (int i = 2; i <= K; i++) {
//            if (isPrime[i]) {
//                total -= (int) ((r / i) - (l - 1) / i);
//            }
//        }
//
//        if (isNotDivisible(l, isPrime)) {
//            total++;
//        }
//        return total;
//    }
//
//    public static boolean[] sieveOfEratosthenes(int K) {
//        boolean[] isPrime = new boolean[K + 1];
//        for (int i = 2; i <= K; i++) {
//            isPrime[i] = true;
//        }
//        for (int i = 2; i * i <= K; i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= K; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//        return isPrime;
//    }
//
//    public static boolean isNotDivisible(long num, boolean[] isPrime) {
//        for (int i = 2; i < isPrime.length; i++) {
//            if (isPrime[i] && num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}