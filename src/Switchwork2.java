public class Switchwork2 {
    public static void main(String[] args) {
       String word = "March";
       String inlowercase = word.toLowerCase();

       switch (inlowercase){
           case "january":
               System.out.println("number of month is 1");
               break;
           case "february":
               System.out.println("number of month is 2");
               break;
           case "march":
               System.out.println("number of month is 3");
               break;
           case "april":
               System.out.println("number of month is 4");
               break;
           case "may":
               System.out.println("number of month is 5");
               break;
           case "june":
               System.out.println("number of month is 6");
               break;
           case "july":
               System.out.println("number of month is 7");
               break;
           case "august":
               System.out.println("number of month is 8");
               break;
           case "september":
               System.out.println("number of month is 9");
               break;
           case "october":
               System.out.println("number of month is 10");
               break;
           case "november":
               System.out.println("number of month is 11");
               break;
           case "december":
               System.out.println("number of month is 12");
               break;
           default:
               System.out.println("invalid month");

       }
    }
}
