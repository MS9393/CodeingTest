package programmers;
public class pr181911_0 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1]);
        }
        return answer;
    }
}