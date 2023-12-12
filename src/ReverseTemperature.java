import java.util.Scanner;

public class ReverseTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;
        do {
            System.out.println("Menu:\n");
            System.out.println("1. C to F ");
            System.out.println("2. F to C ");
            System.out.println("3. Exit");
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the celcius: ");
                    celcius = sc.nextInt();
                    System.out.println(celcius + " Celcius equal to Fahemreit is: " +celciusToFahemreit(celcius));
                    break;
                case 2:
                    System.out.println("Enter the fahemreit: ");
                    fahrenheit = sc.nextInt();
                    System.out.println(fahrenheit + " Fahemreit equal to Celcius is: " +fahemreitToCelcius(fahrenheit));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(choice!=0);
    }
    public static double fahemreitToCelcius(double fahrenheit){
        double celcius = (5.0/9)* (fahrenheit -32);
        return celcius;
    }
    public static double celciusToFahemreit(double celcius){
        double fahemreit = (9.0 / 5) * celcius + 32;;
        return fahemreit;
    }

}


