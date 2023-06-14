import java.util.Arrays;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        // Create arrays of girls' and boys' names
        String[] girlsNames = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Harper", "Evelyn",
                "Liam", "Noah", "Oliver", "William", "Elijah", "James", "Benjamin", "Lucas", "Henry", "Alexander"};

        String[] boysNames = {"Oliver", "George", "Harry", "Noah", "Jack", "Jacob", "Leo", "Oscar", "Charlie", "William",
                "Olivia", "Amelia", "Isla", "Ava", "Emily", "Sophia", "Grace", "Mia", "Ella", "Lily"};

        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boy's name (or press Enter to skip): ");
        String boyName = scanner.nextLine();
        System.out.print("Enter a girl's name (or press Enter to skip): ");
        String girlName = scanner.nextLine();

        // Perform sequential search on the girls' names array
        long startTime = System.nanoTime();
        boolean isGirlNamePresent = sequentialSearch(girlsNames, girlName);
        long endTime = System.nanoTime();
        long sequentialSearchTime = endTime - startTime;

        // Perform sequential search on the boys' names array
        startTime = System.nanoTime();
        boolean isBoyNamePresent = sequentialSearch(boysNames, boyName);
        endTime = System.nanoTime();
        sequentialSearchTime += (endTime - startTime);

        // Perform binary search on the girls' names array
        Arrays.sort(girlsNames);
        startTime = System.nanoTime();
        boolean isGirlNamePresentBinary = binarySearch(girlsNames, girlName);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        // Perform binary search on the boys' names array
        Arrays.sort(boysNames);
        startTime = System.nanoTime();
        boolean isBoyNamePresentBinary = binarySearch(boysNames, boyName);
        endTime = System.nanoTime();
        binarySearchTime += (endTime - startTime);

        // Display search results and execution times
        System.out.println("--- Search Results ---");
        if (girlName.isEmpty() && boyName.isEmpty()) {
            System.out.println("No names entered.");
        } else {
            if (!girlName.isEmpty()) {
                System.out.println(girlName + " is" + (isGirlNamePresent ? "" : " not") + " in the girls' names array.");
            }
            if (!boyName.isEmpty()) {
                System.out.println(boyName + " is" + (isBoyNamePresent ? "" : " not") + " in the boys' names array.");
            }
        }

        System.out.println("--- Execution Times ---");
        System.out.println("Sequential Search: " + sequentialSearchTime + " nanoseconds");
        System.out.println("Binary Search: " + binarySearchTime + " nanoseconds");
    }

    // Sequential search algorithm
    public static boolean sequentialSearch(String[] names, String target) {
        for (String name : names) {
            if (name.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    // Binary search algorithm
    public static boolean binarySearch(String[] names, String target) {
        int left = 0;
        int right = names.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = target.compareToIgnoreCase(names[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
