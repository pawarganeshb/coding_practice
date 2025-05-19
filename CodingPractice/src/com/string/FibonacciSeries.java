package strings;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;

        for(int i = 0; i < num ;i++){
            System.out.println(fib(i));
        }

    }
    private  static  int fib(int num){
        if (num <= 0) {
            return num;
        }else {
         return  fib(num - 2) + fib(num - 1);
        }
    }
}
