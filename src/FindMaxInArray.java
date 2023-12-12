import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        sc.nextLine();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("List of Array: ");
        for (int j : array) {
            System.out.println(j + "\t");
        }
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}
