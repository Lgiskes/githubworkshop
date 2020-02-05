public class main {
    public static void main(String args[]){
        double a = 1.4;
        double b = 3.9;

        System.out.println(a + " + " + b + " = " + sum(a,b));
        System.out.println(a + " * " + b + " = " + mul(a,b));
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double mul(double a, double b){
        return a * b;
    }
}
