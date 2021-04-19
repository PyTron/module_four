/*
Write a program that reads the ages of three persons from the user, 
and decides who is the oldest, and who the youngest person is.
*/
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class problemone {
    public static void main(String[] args) throws Exception {
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter the number of people you would like to test...");
        int testNum = age.nextInt();
        int ageArray[] = new int[testNum];
        for(int i = 0; i < testNum; i++){
            System.out.println("Please enter the age of person " + (i + 1));
            ageArray[i] = age.nextInt();
        }
        int highNum = 0;
        int lowNum = ageArray[0];
        int highArray[] = new int[0];
        int lowArray[] = new int[0];
        for(int i = 0; i < testNum; i++){
            if (ageArray[i] > highNum)
            highNum = ageArray[i];
            else if (ageArray[i] < highNum && ageArray[i] < lowNum)
            lowNum = ageArray[i];
            else{
            }
        }
        for (int i = 0; i < testNum; i++){
            if (ageArray[i] == highNum){
            highArray = Arrays.copyOf(highArray, highArray.length + 1);
            highArray[highArray.length - 1] = i + 1;
            }
            else if (ageArray[i] == lowNum){
                lowArray = Arrays.copyOf(lowArray, lowArray.length + 1);
                lowArray[lowArray.length - 1] = i + 1;
            }
            else{
            }
        }
        System.out.print("there are "+ highArray.length + " persons that are the oldest, they are persons ");
        for (int i = 1; i <= highArray.length; i++){
            if (highArray.length > i) 
            System.out.print(highArray[i - 1] + ", ");
            else if (highArray.length == 1)
            System.out.print(highArray[i-1]);
            else
            System.out.print("and " + highArray[i - 1]);
        }
        System.out.print(".  There are " + lowArray.length + " persons that are the youngest, they are persons ");
        for (int i = 1; i <= lowArray.length; i++){
            if (lowArray.length > i)
            System.out.print(lowArray[i - 1] + ", ");
            else if(lowArray.length == 1)
            System.out.print(lowArray[i-1]);
            else
            System.out.print("and " + lowArray[i - 1] + ".");
        }
        System.out.println("");
        System.out.println("The oldest age was " + highNum + " and the youngest age was " + lowNum + ".");
        age.close();
    }
}
