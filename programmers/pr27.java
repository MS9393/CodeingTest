package programmers;

public class pr27 {
    public static void main(String[] args) {
        String s = "  3people    unFollowed me /";
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        System.out.println(answer);
    }
}