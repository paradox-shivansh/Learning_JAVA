
import java.util.Scanner;
class Q1 {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in); 

        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("it is the leap year");
        }else{
            System.out.println("it is not");
        }
    }
}