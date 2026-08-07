// EXCEPTION HANDELING
class Main {
    public static void main(String[] args) {
        // exception here we catch them and run the rest of the code
         int[] marks = {97,98,99};
         
         try{
             System.out.println(marks[5]);
         }catch(Exception exception){
             // do something
         }
         
         System.out.println("my name is shivansh");
    }
}