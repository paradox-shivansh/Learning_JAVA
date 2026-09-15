// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // now sc is an object that will be used to take a appropriate input
        
        System.out.println("Input your Age: ");
        // System.out.println("Input your Age: ");
        int age = sc.nextInt(); // taking intiger as an input
        System.out.println(age+1);
        
        System.out.println("Input your Name: ");
        String name = sc.next();
        System.out.println(name+" Srivastava");
        // next function is only ment to take tokens not a whole line, but will print just a single word
        System.out.println("Enter a line : ");
        String line = sc.nextLine();
        System.out.println(line);
        
        
        
    }
}