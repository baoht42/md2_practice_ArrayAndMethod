

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to search: ");
        String inputName = sc.nextLine();
        boolean isCheck = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)){
                System.out.println("Founded: "+inputName +" in the array");
                isCheck = true;
                break;
            }

            if (!isCheck){
                System.out.println("Not found "+inputName + " in the array");
            }
        }
    }

}

