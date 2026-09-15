import java.util.Scanner;
class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pow = sc.nextInt();

        while(pow-1>0){
            num = num*num;
            pow--;
        }

        System.out.println(num);
    }
}