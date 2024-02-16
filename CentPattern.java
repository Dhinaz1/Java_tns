public class CentPattern {
    public static void main(String args[]) {
        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}