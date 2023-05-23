import java.util.*;
import java.io.*;
import java.lang.*;

public class B_Colourblindness {
    public static final FastReader in = new FastReader();
    public static final FastWriter out = new FastWriter();

    public static void solve() throws Exception {
        /** Solution here */
        int n = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();
        int i = 0;
        int flag=0;
        for (i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            else if ((s1.charAt(i) == 'G' && s2.charAt(i) == 'B') || (s1.charAt(i) == 'B' && s2.charAt(i) == 'G')) {
                continue;
            }
            else {
                flag = 1;
                break;
            }
        }
        /** Don't change codes below */
        if (flag == 1) {
            out.println("NO");
        }
        else {
            out.println("YES");
        }
    }

    public static void main(String[] args) throws Exception {
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
