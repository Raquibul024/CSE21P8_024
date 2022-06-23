package calculator;

public class Calculations {

    void sum(double x, double y) {
        System.out.println("Summation of " + x + " and " + y + " is: " + (x + y));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void sub(double x, double y) {
        System.out.println("Subtraction of " + x + " and " + y + " is: " + (x - y));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void mult(double x, double y) {
        System.out.println("Multiplication of " + x + " and " + y + " is: " + (x * y));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void div(double x, double y) {
        System.out.println("Division of " + x + " and " + y + " is: " + (x / y));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void root(double x) {
        System.out.println("Root value of " + x + " is: " + (Math.sqrt(x)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void mod(double x, double y) {
        System.out.println("Modulas of " + x + " and " + y + " is: " + (x % y));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void max(double x, double y) {
        System.out.println("Maximum value between " + x + " and " + y + " is: " + (Math.max(x, y)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void min(double x, double y) {
        System.out.println("Minimum value between " + x + " and " + y + " is: " + (Math.min(x, y)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void sin(double x) {
        double a = Math.toRadians(x);
        System.out.println("sin" + x + " is: " + (Math.sin(a)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void cos(double x) {
        double a = Math.toRadians(x);
        System.out.println("cos" + x + " is: " + (Math.cos(a)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }
}
