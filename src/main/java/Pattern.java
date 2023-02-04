public class Pattern {

    public static void main(String[] args) {

        // Solid Rectangle
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        // Solid Square
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        // Hollow Rectangle
        for (int i = 0; i < 3; i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                System.out.print("* "); // to print starting *
                for (int j = 0; j < 3; j++) {
                    System.out.print("  "); // to print space
                }
                System.out.print("*\n"); // to print ending *
            }
        }

        System.out.println();

        // Half pyramid
        int numOfRow = 6;
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Inverted Half pyramid
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfRow - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Numeric Half pyramid
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Inverted Numeric Half pyramid
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfRow - row; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Full pyramid
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfRow - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Inverted Full pyramid
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < numOfRow - row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Solid Diamond
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfRow - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < numOfRow - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Hollow Diamond
        for (int row = 0; row < numOfRow; row++) { // First Part
            // for starting spaces
            for (int col = 0; col < numOfRow - row - 1; col++) {
                System.out.print(" ");
            }
            // for stars and spaces
            for (int col = 0; col < 2 * row + 1; col++) {
                if (col == 0 || col == 2 * row) {
                    // for starting star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < numOfRow; row++) { // Second Part
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * numOfRow - 2 * row - 1; col++) {
                if (col == 0 || col == 2 * numOfRow - 2 * row - 2) {
                    // for starting star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //Flipped Solid Diamond
        for (int row = 0; row < numOfRow; row++) { // First Part
            // for starting star
            for (int col = 0; col < numOfRow - row - 1; col++) {
                System.out.print("*");
            }
            // for stars and spaces
            for (int col = 0; col < 2 * row + 1; col++) {
                if (col == 0 || col == 2 * row) {
                    // for starting star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // for ending star
            for (int col = 0; col < numOfRow - row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row < numOfRow; row++) { // Second Part
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < 2 * numOfRow - 2 * row - 1; col++) {
                if (col == 0 || col == 2 * numOfRow - 2 * row - 2) {
                    // for starting star & Ending star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Fancy Pattern
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(row+1);
                // If last car nahi hai to don't print start
                if(col != row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < numOfRow; row++) {
            for (int col = 0; col < numOfRow - row; col++) {
                System.out.print(numOfRow - row);
                // If last car nahi hai to don't print start
                if(col != numOfRow - row -1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

    }
}
