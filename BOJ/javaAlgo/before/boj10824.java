package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj10824 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long AB = Long.parseLong(st.nextToken() + st.nextToken());
        long CD = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.print(AB + CD);
        br.close();
    }
}