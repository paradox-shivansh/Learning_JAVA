import java.util.Scanner;
class Q3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int ans=1;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }

        System.out.println(ans);
    }
}