//Write a Java program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class PositiveNegativeClasswork {
    public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

    }
}
