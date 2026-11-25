import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int array[] = {10, 20, 30, 40, 50};
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

       System.out.print("Enter index to remove: ");
       int remove = scanner.nextInt();

       for (int i = remove; i < (array.length-1 ); i++) {
        array[i]= array[i+1];}

       System.out.print("Modified: ");

        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}
