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
        codeForcesSolve();
    }
    
    // Customizing functions

    public static void solve() throws Exception {
        /**
         * Tips:
         * To read an integer, use "int ? = pn.nextInt();".
         * To read a string, use "String s1 = pn.next();".
         * "s1.charAt(i)" can indicate the i(th) char of the string s1.
         * To read an integer array, use
         * "int[] x[]=new int[y]; for...{x[i]=pn.nextInt();}".
         * To read an integer array of multiple dimensions, use
         * "int[][] x=new int[a][b];for...for...{x[i][j]=pn.nextInt();}".
         * Use "so.println("...")" for fast output.
         * Use "so.println("")" for fast output if you want to print only a new line.
         */

        /**
         * Solve the problem here
         */

        // Read input
        int Xa = pn.nextInt();
        int Ya = pn.nextInt();
        int Xb = pn.nextInt();
        int Yb = pn.nextInt();
        int Xc = pn.nextInt();
        int Yc = pn.nextInt();
        int maxXbc, minXbc, maxYbc, minYbc;
        maxXbc = Math.max(Xb, Xc);
        maxYbc = Math.max(Yb, Yc);
        minXbc = Math.min(Xb, Xc);
        minYbc = Math.min(Yb, Yc);
        int answer;
        if (minXbc <= Xa && Xa <= maxXbc) {
            if (Ya > maxYbc) {
                answer = Ya - maxYbc;
            } else if (Ya < minYbc) {
                answer = minYbc - Ya;
            } else
                answer = 0;
        }
        else if (minXbc > Xa) {
            if (Ya > maxYbc) {
                answer = Ya - maxYbc + minXbc - Xa;
            } else if (Ya < minYbc) {
                answer = minYbc - Ya + minXbc - Xa;
            } else
                answer = minXbc - Xa;
        }
        else {
            if (Ya > maxYbc) {
                answer = Ya - maxYbc + Xa - maxXbc;
            } else if (Ya < minYbc) {
                answer = minYbc - Ya + Xa - maxXbc;
            } else
                answer = Xa - maxXbc;
        }
        answer++;
        so.println(answer);
        /**
         * End of solution
         */

        /**
         * Do NOT change code below
         */
    }

    /**
     * Runs the CodeForces solve function.
     *
     * @throws Exception if an error occurs while running the function.
     */
    public static void codeForcesSolve() throws Exception {
        // Get the number of test cases.
        int t = pn.nextInt();
        // For each test case, solve it and output the result.
        while (t-- > 0) {
            solve();
        }

        // Close the output stream.
        so.close();
    }

    /**
     * Solves a single test case for the CodeForces problem.
     *
     * @throws Exception if an error occurs while solving the test case.
     */
    
    /**
     * Runs the AtCoder solve function.
     *
     * @throws Exception if an error occurs while running the function.
     */
    public static void atCoderSolve() throws Exception {
        solve();
        so.close();
    }

    /**
     * Solves a single test case for the AtCoder problem.
     *
     * @throws Exception if an error occurs while solving the test case.
     */

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
