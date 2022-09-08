public class WhileLoopEven {
    public static void main(String[] args) {
        int n = 80;
        while (n >= 40) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }
}