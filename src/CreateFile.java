//create 10 files using loop (for each loop)
import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        for(int num1:num){
            try {
                File f = new File(num1 + ".txt");
                if (f.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File already exist");

                }
            }catch (Exception ex){
                System.out.println("something went wrong");
            }
        }


    }
}
