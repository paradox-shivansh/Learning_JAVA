// Comparison Operator

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // less than << more than >>, >=, <=
        // show equality == "gives a boolean value"
        // not eaqual != "boolean value"
        
        Scanner sc = new Scanner(System.in);
        
        
        
        // Conditional statement
        boolean isSunUp = sc.nextBoolean();
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("night");
    }
}