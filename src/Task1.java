public class Task1 {
    public static void main(String[] args) throws Exception {
        int array[] = { 5, -3, 8, -1, 0, 12, -7, 4, 9, -2 };
        int replacement = 0;
        System.out.print("Original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < 0) {
                replacement++;

                array[i] = 0;
            }

        }
        System.out.println();
        System.out.print("Modified: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < 0) {
                replacement++;

                array[i] = 0;

            }
        }
        System.out.println();

        System.out.print("Replacements: " + replacement);
    }
}