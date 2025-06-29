package strings;

public class SumOfPairs {
    public static void main(String[] args) {
        int[] arr = {80, 60, 10, 50, 30, 100, 0, 50};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == 100){
                    System.out.println(arr[i]+", "+arr[j]);
                }
            }
        }
    }
}
