import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.println("alphabet");
        }else{
            System.out.println("not");
        }
    }
}