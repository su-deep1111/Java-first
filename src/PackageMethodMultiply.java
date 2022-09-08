public class PackageMethodMultiply {
    public static void main(String[] args) {
     multi (5,10);
     multi (6,7,9);
    }

    public static void multi(int n1, int n2) {
        int multi = n1*n2;
        System.out.println("The result is " +multi);
    }

    public static void multi(int n1, int n2, int n3) {
        int multi = n1*n2*n3;
        System.out.println("The result is " +multi);}
}

