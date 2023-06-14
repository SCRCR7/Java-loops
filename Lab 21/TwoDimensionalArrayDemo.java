public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        // Create and initialize a two-dimensional array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Demonstrate the methods
        System.out.println("Total: " + getTotal(array));
        System.out.println("Average: " + getAverage(array));
        System.out.println("Row Total: " + getRowTotal(array, 1));
        System.out.println("Column Total: " + getColumnTotal(array, 2));
        System.out.println("Highest in Row: " + getHighestInRow(array, 0));
        System.out.println("Lowest in Row: " + getLowestInRow(array, 2));
    }

    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(int[][] array) {
        int total = getTotal(array);
        int elementsCount = array.length * array[0].length;
        return (double) total / elementsCount;
    }

    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int value : array[row]) {
            total += value;
        }
        return total;
    }

    public static int getColumnTotal(int[][] array, int column) {
        int total = 0;
        for (int[] row : array) {
            total += row[column];
        }
        return total;
    }

    public static int getHighestInRow(int[][] array, int row) {
        int highest = Integer.MIN_VALUE;
        for (int value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowestInRow(int[][] array, int row) {
        int lowest = Integer.MAX_VALUE;
        for (int value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}
