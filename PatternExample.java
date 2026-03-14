public class PatternExample {

    public static void main(String[] args) {

        int rows = 4;
        for (int row = 1; row <= rows; row++) {

            for (int space = row; space < rows; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++) {
                if (star == 1 || star == (2 * row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = rows - 1; row >= 1; row--) {

            for (int space = rows; space > row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row - 1); star++) {
                if (star == 1 || star == (2 * row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
