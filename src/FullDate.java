import java.util.Scanner;

public class FullDate {
    public static void main(String[] args) {

        //Array containing months
        String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner input = new Scanner(System.in);

        int month;
        int day;
        int year;

        //Prompt user to give a value for month between 1 and 12
        do {
            System.out.println("Enter month (mm): ");
            month = input.nextInt();
        } while (month < 1 || month >12 );

        //Prompt user to give a value for day between 1 and 31
        do {
            System.out.println("Enter day (dd): ");
            day = input.nextInt();
        } while (day < 1 || day > 31);

        //Prompt user to give a value for year between 10 and 99
        do {
            System.out.println("Enter year (yy): ");
            year = input.nextInt();
        } while (year < 10 || year > 99);

        //Print full date, January is at monthsArray[0]
        System.out.println("It is " + monthsArray[month-1] + " " + day + "," + " " + "20" + year + ".");


    }
}
