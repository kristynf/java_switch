import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days do you want the months displayed to contain?: ");
        int days = sc.nextInt();


        switch (days) {
            case 31:
                System.out.println("January, March, May, July, August, October, and December");
                break;
            case 30:
                System.out.println("April, June, September, November");
                break;
            case 28:
                System.out.println("February");
                break;
            case 0:
                System.out.println("Unknown");
                break;

        }
    }
}


