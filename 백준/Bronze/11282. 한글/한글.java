import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print((char)(Integer.parseInt(br.readLine()) + 44031));
        br.close();
    }
}
