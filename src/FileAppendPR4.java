//Write a java program to append content to a file that already has content.
import java.io.FileWriter;
public class FileAppendPR4 {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("peekaboo.txt",true);
            myWriter.write("Hi there, I got you. ");
            myWriter.close();
            System.out.println(" Append to file successfully");

        }catch (Exception ex){
            System.out.println("Error has been occurred. ");

        }
    }
}
