/*
Write a program that reads in the name and salary of an employee. 
Here the salary will denote an hourly wage, such as $9.25. 
Then ask how many hours the employee worked in the past week. Be sure to accept fractional hours. Compute the pay. 
Any overtime work (over 40 hours per week) 
is paid at 150 percent of the regular wage. Print a paycheck for the employee.
*/
import java.util.Scanner;
public class problemtwo {
    public static void main(String[] args)throws Exception{
        Scanner emp = new Scanner(System.in);
        System.out.print("Please enter the employee name:  ");
        String empName = emp.nextLine();
        System.out.print("Please enter the empoyee's hourly rate:  $");
        Double empInc = emp.nextDouble();
        System.out.print("How many hours did the employee work?  ");
        Double empHr = emp.nextDouble();
        Double oTime = empHr - 40.0;
        Double payCheck;
        if (empHr > 40.0){
            payCheck = (Math.round((40.0 * empInc) * 100.0) / 100.0);
            payCheck = payCheck + (Math.round(oTime * empInc * 1.5 * 100.0) / 100.0);
        }
        else
        payCheck = (Math.round((empHr * empInc) * 100.0) / 100.0);
        System.out.println("");
        System.out.print("Pay to the order of: " + empName);
        System.out.print("  $" + payCheck);
        emp.close();

    }
}
