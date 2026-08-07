// learning implecite and explicite casting
class Main {
    public static void main(String[] args) {
        
        // casting mainly used to change datqqa type
        double price = 100.00;
        double finalPrice = price + 18; // implecite casting (doublle > int so java does it automatically; 18 is an integer)
        System.out.println(finalPrice); // it works
        
        int p = 100;
        //int fp = p + 18.0; // this will give error as p is int but 18.0 is a decimal value
        //since bytes in int < double, so changing double to int may lead to some loss so here int can be convert to double
        
        // explicite casting(forcing to change and we dont care about the loss of information) so, double can be adjusted into integer
        
        int fp = p + (int) 18.0;
        System.out.println(fp); // it works (intiger)
        
        // if you put 18.99 then to is will take intiger part only which is 18 and it does not convert it to 19 by rounding off.. please make a note
        
        // CONSTANT VALUES
        // float PI = 3.14F;
        // PI = 1.1F; // it is not constant right now so it can not be changes
        
    
        // final
        final float PI = 3.14F; // now it can not be chaged
        
        
        
        
    }
}