public class RandomWork {
    public static void main(String[] args) {
        int min = 500;
        int max = 800;
        double random=Math.random() * (max - min + 1) + min;
        int number = (int)Math.floor(random);
        System.out.println(number);
    }
}
