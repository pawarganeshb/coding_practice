package strings;

public class Pattern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (i % 2 == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) ('A' + i - 1)+" ");
                }
            }
            System.out.println();
        }
    }
}
/*
  5 4 3 2 1
  D C B A
  3 2 1
  C B A
  1

* */