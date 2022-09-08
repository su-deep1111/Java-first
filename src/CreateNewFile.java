import java.io.File;
public class CreateNewFile {
    public static void main(String[] args) {
        File f = new File("hello.csv");
        try{
            if(f.createNewFile()) {
                System.out.println("File has been created ");
            }else{
                System.out.println("File already exists");
            }
        }catch (Exception ex){
            System.out.println("Something went wrong");

        }

    }
}
