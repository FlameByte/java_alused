import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year");
        }
    }
}
