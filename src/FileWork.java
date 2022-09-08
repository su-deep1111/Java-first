import java.util.Scanner;
public class FileWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
        int i = sc.nextInt();
        int square = i * i;
        System.out.println("Square of the number is: " + square);
    }catch (Exception ex){
            System.out.println("Input should be numeric: ");
        }
    }
}
