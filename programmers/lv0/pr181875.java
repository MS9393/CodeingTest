package programmers.lv0;

public class pr181875 {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++){
            strArr[i] = (i % 2 == 0) ? strArr[i].toLowerCase() 
                : strArr[i].toUpperCase();
        }
        return strArr;
    }
}
