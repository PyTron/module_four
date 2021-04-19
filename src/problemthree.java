/*
The original US income tax of 1913 was quite simple. The tax was:

1 percent on the first $50,000
2 percent on the amount over $50,000 up to $75,000
3 percent on the amount over $75,000 up to $100,000
4 percent on the amount over $100,000 up to $250,000
5 percent on the amount over $250,000 up to $500,000
6 percent on the amount over $500,000.
There was no separate schedule for single or married taxpayers. 
Write a program that computes the income tax according to this schedule.
*/
import java.util.Scanner;
public class problemthree {
    public static void main(String[] args)throws Exception{
    Scanner percent = new Scanner(System.in);
    System.out.print("Enter an income to calculate the income tax:  $");
    Double income = percent.nextDouble();
    Double workingNum = income;
    Double tax = 0.0;
    while (workingNum > 0){
        if (workingNum > 500000){
            tax = (workingNum - 500000) * .06;
            workingNum = 500000.0;
        }
        else if (workingNum > 250000){
            tax = tax + ((workingNum - 250000) * .05);
            workingNum = 250000.0;
        }
        else if (workingNum > 100000){
            tax = tax + ((workingNum - 100000) * .04);
            workingNum = 100000.0;
        }
        else if (workingNum > 75000){
            tax = tax + ((workingNum - 75000) * .03);
            workingNum = 75000.0;
        }
        else if (workingNum > 50000){
            tax = tax + ((workingNum - 50000) * .02);
            workingNum = 50000.0;
        }
        else{
            tax = tax + ((workingNum * .01));
            workingNum = 0.0;
        }
    }
    tax = Math.round(tax * 100.0) / 100.0;
    System.out.println("You will owe $" + tax + " in taxes on $" + income + " in income.");
    }
    
}
