import java.util.*;
import java.io.*;

public class Rotate {
    // This is where you should write your code
    static class Task {
        int[] getRotatedArray(int n, int d, int[] a) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[((i - d) + n) % n] = a[i];
            }
            return b;
        }

        private void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int[] ans = getRotatedArray(n, d, a);
            for (int i = 0; i < ans.length; i++) {
                out.print(ans[i] + " ");
            }
            out.println();
        }
    }
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Task task = new Task();
        int testNumber = in.nextInt(); // if there is only 1 test case change this to 1
        for (int i = 0; i < testNumber; i++) {
            task.solve(i, in, out);
        }
        out.close();
    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}