import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long)1e9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(input[i]) - 1;
        }
        System.out.println(solve(p));
    }

    static long solve(int[] p) {
        int n = p.length;
        int[] inDeg = new int[n];
        for(int i = 0; i < n; i++) {
            inDeg[p[i]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(inDeg[i] == 0) {
                q.add(i);
            }
        }
        int[] dist = new int[n];
        while(!q.isEmpty()) {
            int u = q.poll();
            for(int v = u; v != -1; v = p[v]) {
                dist[v] = dist[u] + 1;
                if(--inDeg[p[v]] == 0) {
                    q.add(p[v]);
                }
            }
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(dist[i] == dist[j] && dist[p[i]] == dist[p[j]]) {
                    res++;
                }
            }
        }
        return res % mod;
    }
}