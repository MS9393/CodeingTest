package BOJ.javaAlgo;

import java.io.*;

public class boj20673 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        String result = "";
        if ( A <= 50 && B <= 10 ) {
            result = "White";
        } else if ( B > 30 ) {
            result = "Red";
        } else {
            result = "Yellow";
        }
        System.out.print(result);
        br.close();
    }
}
