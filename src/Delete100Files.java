import java.io.File;

public class Delete100Files {
        public static void main(String[] args) {
            for (int i = 1; i<=100; i++){
                deleteFile("my file" +i+ ".txt");
            }
        }
        public static void deleteFile(String filename){
            try{
                File f = new File(filename);
                if(f.delete()){
                    System.out.println("File has been deleted");
                }else{
                    System.out.println("File already deleted");
                }

            }catch (Exception e){
                System.out.println("Error occurred");
            }
        }
    }


