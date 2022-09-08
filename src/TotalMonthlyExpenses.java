public class TotalMonthlyExpenses {
    public static void main(String[] args) {
        double[] monthlyExpenses = {300, 450, 500};
        double sum = 0;
        for (int i = 0; i < monthlyExpenses.length; i++) {
        sum+=monthlyExpenses[i];
        }
        System.out.println("Total is " +sum );
        double avg = sum / monthlyExpenses.length;
        System.out.println("Avg expenses: " +avg);
    }
}