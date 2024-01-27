package patterns;

public class Parallelogram {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            int spaceNumber = rows - i;
            for (int j = 1; j <= spaceNumber; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
