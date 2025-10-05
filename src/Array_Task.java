public class Array_Task {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};

        // Part One
        int value = 10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println("Index of " + value + ": " + i);
                break;
            }
        }

        // Part Two
        int index1 = 1, index2 = 4;
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        System.out.print("After swap: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();

        // Part 3
        int[] ascending = numbers.clone();
        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = i + 1; j < ascending.length; j++) {
                if (ascending[i] > ascending[j]) {
                    int t = ascending[i];
                    ascending[i] = ascending[j];
                    ascending[j] = t;
                }
            }
        }

        System.out.print("Ascending order: ");
        for (int num : ascending) System.out.print(num + " ");
        System.out.println();


        int[] descending = ascending.clone();
        for (int i = 0; i < descending.length / 2; i++) {
            int t = descending[i];
            descending[i] = descending[descending.length - 1 - i];
            descending[descending.length - 1 - i] = t;
        }

        System.out.print("Descending order: ");
        for (int num : descending) System.out.print(num + " ");
        System.out.println();

        // Part Four
        int search_value = 15;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search_value) {
                System.out.println("Value " + search_value + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(search_value + " not found");

        // Part 5
        int low = 0, high = ascending.length - 1;
        int target = 15;
        boolean foundBinary = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ascending[mid] == target) {
                System.out.println("Binary search found " + target + " at index " + mid);
                foundBinary = true;
                break;
            } else if (ascending[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!foundBinary) System.out.println(target + " not found in binary search");
    }
}
