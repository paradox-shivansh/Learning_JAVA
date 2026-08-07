// Loops in java

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int m = sc.nextInt();
        // loops
        for(int i=0; i<10; i++) 
            System.out.println(i+m);
            
            
        // Similarly wile loop, do wile loop
        
        
        // LEARN ABOUT BREAK AND CONTINUE
        // break helps us to stop
        // continue helps to skip  a value
        
        int f = 0;
        while(true){
            if(f == 3){
                f++;
                continue;
            }
            System.out.println(f);
            f++;
            if(f >6){
                break;
            }
        }
            
                
    }
}