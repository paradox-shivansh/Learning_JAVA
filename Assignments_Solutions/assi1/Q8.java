import java.util.Scanner;
class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digite=0;
        while(n>0){
            int last=0;
            last = n%10;
            digite = digite*10 + last;
            n = n/10;
        }

        System.out.println(digite);
    }
}