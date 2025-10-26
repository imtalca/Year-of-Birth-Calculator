import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        int year;
        int yearb;

        System.out.println("Enter your age (as of end of this year): ");
        age = scanner.nextInt();
        System.out.println("Enter the current year: ");
        year = scanner.nextInt();

        yearb = year - age;
        System.out.println("Your year of birth is: " + yearb);
    }
}
