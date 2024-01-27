package patterns;

public class Butterfly {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            butterfly(rows, i);
        }
        for (int i = rows; i >= 1; i--) {
            butterfly(rows, i);
        }
    }

    private static void butterfly(int rows, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        int spaces = 2 * (rows - i);
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
