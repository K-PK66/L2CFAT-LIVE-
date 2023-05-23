import java.util.*;
import java.io.*;
import java.lang.*;

public class test {
    public static final FastReader in = new FastReader();
    public static final FastWriter out = new FastWriter();

    public static void solve() throws Exception {
        /* Solution here */
        /*
        * Tips:
        ** To read int, use "int X = in.nextInt();".
        ** To read string, use "String s1 = in.next();".
        ** "s1.charAt(i)" can indicate the i(th) char of the string s1.
        **
         */
        int n=in.nextInt();
        String s=in.next();
        int rCount=0;
        int lCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                lCount++;
            }
            else{
                rCount++;
            }
        }
        if(rCount*lCount==0){
            out.println(-1);
        }
        else{
            for(int j=0;j<=s.length()-2;j++){
                if(s.charAt(j)=='R'&&s.charAt(j+1)=='L'){
                    out.println(0);
                    return;
                }
                if(s.charAt(j)=='L'&&s.charAt(j+1)=='R'){
                    out.println(j+1);
                    return;
                }
            }
        }
        /* Do NOT change codes below */
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
