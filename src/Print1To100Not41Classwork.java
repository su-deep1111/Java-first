//Write a Java program to print 1 to 100 but not 41
public class Print1To100Not41Classwork {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i==41){
                continue;

            }
            System.out.println(i);

        }
    }
}
