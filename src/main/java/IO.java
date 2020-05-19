import java.io.*;
import java.util.StringTokenizer;

public class IO {
    PrintWriter pw;
    BufferedReader br;
    StringTokenizer in;

    public IO() {

        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));
    }

    public String nextToken() {
        while (in == null || !in.hasMoreTokens()) {
            try {
                in = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return in.nextToken();
    }

    // prints and flush
    public void printF(String s) {
        pw.print(s);
        pw.flush();
    }

    public void print(String s) {
        pw.print(s);
    }

    public void flush() {
        pw.flush();
    }

    public void close() {
        pw.close();
    }

    public boolean hasMoreTokens() {
        if (in != null && in.hasMoreTokens()) return true;
        else {
            while (in == null || !in.hasMoreTokens()) {
                try {
                    in = new StringTokenizer(br.readLine());
                } catch (NullPointerException | IOException e) {
                    return false;
                }
            }
            return true;
        }
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }
}
