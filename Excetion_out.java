

public class Excetion_out {

    public static void method3() {
        System.out.println("In method3");
        int result = 10 / 0;
    }

    public static void method2() {
        System.out.println("In method2");
        method3();
    }

    public static void method1() {
        System.out.println("In method1");

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method1");
        }
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        method1();

        System.out.println("Program finished successfully");
    }
}