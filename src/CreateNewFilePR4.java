//Write a java program to create a new file called “peekaboo.txt”.
import java.io.File;
public class CreateNewFilePR4 {
    public static void main(String[] args) {
        try{
            File f = new File("peekaboo.txt");
            if (f.createNewFile()){
                System.out.println("File has been successfully created. ");
            }else{
                System.out.println("File already exists. ");
            }

        } catch (Exception ex){
            System.out.println("An error has been occurred");
        }

    }
}
