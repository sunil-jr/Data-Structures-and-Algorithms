package patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <=rows ; i++) {
            diamond(rows, i);
        }
        for (int i = rows; i >=1 ; i--) {
            diamond(rows, i);
        }
    }

    private static void diamond(int rows, int i) {
        for (int j = 1; j <= (rows-i) ; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
