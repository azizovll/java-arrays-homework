
public class Task4 {
    public static void main(String[] args) throws Exception {

        int array[] = { 4, 7, 2, 4, 9, 7, 1, 2, 8, 4 };
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("Duplicates: ");

        for (int i = 0; i < array.length; i++) {
            int equality = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {
                    equality++;
                }

            }
            boolean repetitionTrue = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    repetitionTrue = true;

                }

            }
            if (equality > 1 && !repetitionTrue) {
                System.out.print(array[i] + " ");

            }

            equality = 0;

        }

    }
}
