import java.util.*;
import java.io.*;
import java.lang.*;

public class A_Spell_Check {
    public static final FastReader in = new FastReader();
    public static final FastWriter out = new FastWriter();

    public static void solve() throws Exception {
        /** Solution here */
        var n = in.nextInt();
        String s = in.next();
        if (s.length() != 5) {
            out.println("NO");
        }
        else{
            int i = 0;
            int flag = 0;
            int TCount = 1;
            int iCount = 1;
            int mCount = 1;
            int uCount = 1;
            int rCount = 1;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'T') {
                    TCount--;
                } else if (s.charAt(i) == 'i') {
                    iCount--;
                } else if (s.charAt(i) == 'm') {
                    mCount--;
                } else if (s.charAt(i) == 'u') {
                    uCount--;
                } else if (s.charAt(i) == 'r') {
                    rCount--;
                }
            }
            if (TCount == iCount && iCount == mCount && mCount == uCount && uCount == rCount && rCount == 0) {
                out.println("YES");
            }
            else {
                out.println("NO");
            }
        }
        /** Don't change codes below */
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
