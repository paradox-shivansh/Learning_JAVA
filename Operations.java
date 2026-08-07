// OPERTOS IN JAVA
class Main {
    public static void main(String[] args) {
        // Arathmatic [+,-,*./,%]
        int a=1;
        int b=1;
        int c=a+b;
        System.out.println(c);
        // System.out.println(c);
        
        // int d = 2^3;  this doenot work
        // System.out.println(d);
        
        // Uninary Operator
        int numb =2;
        numb++;
        System.out.println(numb);
        
        // numb++ and ++numb is different 
        
        // MATHS CLASS
        // Import Math class
        System.out.println(Math.max(5,6)); // gives the lasrgest number
        
        // random fuction [0.0 , 1]
        System.out.println(Math.random()); // long ki form is used here
        // lets do some explicite casting, multicase
        System.out.println((int)(Math.random())); // but it will alwas give 0 as all values are leass than 1
        System.out.println((int)(Math.random()*100)) ;
        
        
        
        
        
        
    }
}