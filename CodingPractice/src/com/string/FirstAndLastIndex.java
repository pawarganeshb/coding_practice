package strings;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,3,3,5,6,75,3};
        int num = 3;
        int firstIndex = -1;
        int lastIdnex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIdnex = i;
            }

        }
        System.out.println(firstIndex+","+lastIdnex);
    }
}
