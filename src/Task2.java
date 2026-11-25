public class Task2 {
    public static void main(String[] args) throws Exception {
        int array[] = {10, 25, 8, 30, 15, 30 };
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        int secondLargest = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < largest) {
                if (found == false || array[i] > secondLargest) {
                    secondLargest = array[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("No second largest distinct number.");
        }
    }
}
