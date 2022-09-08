//Write a java program to add content to “peekaboo.txt”.
import java.io.FileWriter;
public class FileAddNamePR4 {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("peekaboo.txt");
            myWriter.write("Where are you ?? ");
            myWriter.close();
            System.out.println("Successfully written to file. ");

        }catch (Exception ex){
            System.out.println("Error has been occurred. ");

        }

    }
}
