//Write a java program to create 100 files and delete them
import java.io.File;
public class Create100FilesPR4 {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            System.out.println("my case "+ i + ".txt");
            try{
                File f = new File("my case.txt");
                if(f.createNewFile()){
                    System.out.println("File is successfully created ");
                }else{
                    System.out.println("File already exists ");
                }
            }catch (Exception e) {
                System.out.println("An error has occurred. ");
            }
        }
    }
}
