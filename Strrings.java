// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        // concatination of two strings 
        String name1 = "aman";
        String name2 = "rajput";
        String name3 = name1 + name2;
        System.out.println(name3);
        
        
        // charAt to fiind charater at a particular place
        // java is a 0 index janguage
        
        
        System.out.println(name1.charAt(1));
        System.out.println(name1.length());
        
        // replace
        // this is not a permanent change is orignal string, rather it makes a copy in another variable and make changes there
        String name4 = name1.replace('a', 'b');
        // in java strings are immutable, maens once a string is created, it cant be changes. to change it you have to store in another string varibale
        System.out.println(name4);
        
        
          // concept of susStrings
          // since the strings are immutaable in java, so we are not only a part og the string, the part is copied to another string and then it is displayed in output
        String name5 = "AMAN and AKKU";
        
        
        System.out.println(name5.substring(0,6));
    }
}