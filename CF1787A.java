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
    public static boolean isPrime(long n) throws Exception {
        if (n % 2 == 0 && n != 2) {
            return false;
        }
        for (int i = 1; i < n/2; i++) {
            if (n % i == 0)
                return false;
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
        long n = pn.nextLong();
        // * x^y*y+y^x*x=n ==> xy(x^(y-1)+y^(x-1))=n
        // ** if n is odd, xy should be odd. This means the 2nd factor in the equation mentioned above is even, making n even, which is contradictory.
        if (n % 2 == 1) {
            so.println(-1);
            return;
        }
        // ** if n is even, x & y that qualify can always been found.
        // ** x & y can be 1 & n/2, as n/2(1+1)=n.
        if (n % 2 == 0) {
            so.print(n / 2);
            so.print(" ");
            so.println(1);
        }
        /* End of solution */
        /* Do NOT change codes below */
    }

    public static void main(String[] args) throws Exception {
        int t = pn.nextInt();
        while (t-- > 0)  {
            solve();
        }
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
