import java.util.Arrays;

public class pr181881 {
    class Solution {
        public int solution(int[] arr) {
            int result = 0;
            while(true){
                int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] >= 50 && arr[i] % 2 == 0){
                        arr[i] = arr[i] / 2;
                    } else if(arr[i] < 50 && arr[i] % 2 != 0){
                        arr[i] = arr[i] * 2 + 1;
                    }
                }
                if(Arrays.equals(arr, temp)){
                    break;
                }
                result++;
            }
            return result;
        }
    }
}
