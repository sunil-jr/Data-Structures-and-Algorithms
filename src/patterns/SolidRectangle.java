package patterns;

public class SolidRectangle {

    /*
     ******
     ******
     ******
     ******
     */
    public static void main(String[] args) {

        int rows = 4;
        int columns = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
