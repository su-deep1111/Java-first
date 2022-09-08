//create 100 files using method
import java.io.File;
public class Make100Files {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            makeFile("my file" +i+ ".txt");
        }
    }
    public static void makeFile(String filename){
        try{
            File f = new File(filename);
            if(f.createNewFile()){
                System.out.println("File has been created");
            }else{
                System.out.println("File already exists");
            }

        }catch (Exception e){
            System.out.println("Error occurred");
        }
    }
}
