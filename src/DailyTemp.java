import java.util.*;
public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = temperatures.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++ ){
                if(temperatures[j] > temperatures[i]){
                    list.add(temperatures[j] - temperatures[i]) ;
                } else {
                    list.add(0);
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
//        int[] result =
    }
}
