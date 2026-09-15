import java.util.Scanner;
class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int digite = sc.nextInt();
        int count=digite;
        int cnt=0;

        while(count>0){
            count = count/10;
            cnt++;
        }

        if(cnt%2==0){
            int cut=(cnt/2);
            int nd=0;
            while(cut>0){
                nd = nd*10+(digite%10);
                digite = digite/10;
                cut--;
            }
            digite = digite/10;
            if(digite==nd){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }else{
            int cut=(cnt/2);
            int nd=0;
            while(cut>0){
                nd = nd*10+(digite%10);
                digite = digite/10;
                cut--;
            }
            digite = digite/10;
            if(digite==nd){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}