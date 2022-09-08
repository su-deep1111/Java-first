public class ForLoopBreak {
    public static void main(String[] args) {
        for(int i = 40; i<=70; i++){
            if(i==50 || i==51){
                continue;

            }
            System.out.println(i);
        }
    }
}
