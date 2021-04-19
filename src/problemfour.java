/*
Write a program asks the user to enter a month (1 for January, 2 for February, and so on) 
and then prints the number of days in the month. 
For February, print "28 or 29 days".

For example:

Enter a month: 5
30 days

Do not use a separate if/else branch for each month. Use Boolean operators.
*/
import java.util.Arrays;
import java.util.Scanner;
public class problemfour {
    public static void main(String[] args) throws Exception{
        Scanner month = new Scanner(System.in);
        String cal[] = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.print("Enter a month: ");
        int input = month.nextInt();
        Boolean thirty = input == 4 || input == 6 || input ==  9 || input == 11;
        Boolean thirtyOne = input == 1 ||input == 3 ||input == 5 ||input == 7 ||input == 8 || input == 10 ||input == 12;
        if (thirty == true)
            System.out.print("There are 30 days in " + cal[input - 1]);
        else if (thirtyOne == true)
            System.out.println("There are 31 days in " + cal[input - 1]);
        else
            System.out.println("There are 28 or 29 days in " + cal[input - 1]);
    }
    
}
