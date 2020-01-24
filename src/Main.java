import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //days in each month

    }

    Scanner sc = new Scanner(System.in);

//This program with print the months by how many days they contain.

    { System.out.println("How many days do you want the months displayed to contain?: ");
     int  answer = sc.nextInt();



    int month = (answer);
    String monthName;
                switch(month)

    {
        case 31:
            monthName = "January, March, May, July, August, October, and December";
            break;
        case 30:
            monthName = "April, June, September, November";
            break;
        case 28:
            monthName = "February";
            break;
        case 0:
            monthName = "Unknown";
            break;

    }
        System.out.println(monthName);
}