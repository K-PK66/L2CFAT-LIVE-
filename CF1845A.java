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
        int n = pn.nextInt();
        int k = pn.nextInt();
        int x = pn.nextInt();
        int oddCount, evenCount;
        if (k % 2 == 0) {
            oddCount = k / 2;
            evenCount = k / 2;
        }
        else {
            oddCount = (k + 1) / 2;
            evenCount = oddCount - 1;
        }
        if (x % 2 == 0) {
            evenCount--;
        }
        else {
            oddCount--;
        }
        if (n % 2 != 0 && oddCount == 0) {
            so.println("NO");
            return;
        }
        else if (k == 1) {
            so.println("NO");
            return;
        }
        int minOdd = 1, minEven = 0;
        for (int i = 1; i <= k; i += 2) {
            if (i != x) {
                minOdd = i;
                break;
            }
        }
        for (int i = 2; i <= k; i += 2) {
            if (i != x) {
                minEven = i;
                break;
            }
        }
        if (n % minOdd != 0 && n% minEven != 0 && minOdd + minEven > n) {
            so.println("NO");
            return;
        }
        else {
            so.println("YES");
            if (x != 1) {
                so.println(n);
                for (int i = 1; i < n; i++) {
                    so.print("1 ");
                }
                so.println(1);
                return;
            }
            else {
                //if 1 is forbidden, 2 can be used. So would be 3, should k>=3.
                int answer;
                if (n % 2 == 0) {
                    answer = n / 2;
                    so.println(answer);
                    for (int i = 1; i < n / 2; i++) {
                        so.print("2 ");
                    }
                    so.println(2);
                    return;
                }
                else {
                    answer = (n - 1) / 2;
                    so.println(answer);
                    for (int i = 1; i < n / 2; i++) {
                        so.print("2 ");
                    }
                    so.println(3);
                    return;
                }
            }
        }
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
