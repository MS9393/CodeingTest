package BOJ.javaAlgo;

import java.io.*;

public class boj5522 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for ( int i = 0; i < 5; i++ ) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
        }
        System.out.print(sum);
        br.close();
    }
}