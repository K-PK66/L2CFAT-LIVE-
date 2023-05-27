import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static final FastReader penetrate = new FastReader();
    public static final FastWriter squirtOut = new FastWriter();
    public static final FastReader pn = penetrate;
    public static final FastWriter so = squirtOut;
    
    /**
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        atCoderSolve();
    }
    public static boolean isSimilar(String s1, String s2) throws Exception {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == '1' && s2.charAt(i) == 'l') {
                    continue;
                }
                if (s1.charAt(i) == '0' && s2.charAt(i) == 'o') {
                    continue;
                }
                if (s2.charAt(i) == '1' && s1.charAt(i) == 'l') {
                    continue;
                }
                if (s2.charAt(i) == '0' && s1.charAt(i) == 'o') {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    public static void solve() throws Exception{
        /* Tips:
         ** To read int, use "int X = pn.nextInt();".
         ** To read string, use "String s1 = pn.next();".
         ** "s1.charAt(i)" can indicate the i(th) char of the string s1.
         ** To read int array, use "int[] x[]=new int[y]; for...{x[i]=pn.nextInt();}".
         ** To read int array of multiple dimensions, use "int[][] x=new int[a][b];for...for...{x[i][j]=pn.nextInt();}".
         ** Use "so.println("...")" for fast output.
         ** Use "so.println("")" for fast output if you want to print only a new line.
         */
        /* Solution here */
        int N = pn.nextInt();
        String s1 = pn.nextLine();
        String s2 = pn.nextLine();
        so.println(isSimilar(s1, s2) ? "Yes" : "No");
        /* End of solution */
        /* Do NOT change codes below */
    }

    public static void codeforcesSolve() throws Exception {
        int t = pn.nextInt();
        while (t-- > 0) {
            solve();
        }
        so.close();
    }
    
    public static void atCoderSolve() throws Exception {
        solve();
        so.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        /**
         * @return
         */
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
