abstract class A {
abstract void callme();
// concrete methods are still allowed in abstract classes
void callmetoo() {
System.out.println("This is a concrete method.");
   }
}

interface D{
    int y=101;
}

class B extends A implements D {
void callme() {
System.out.println("B's implementation of callme.");
// D.y=100;
System.out.println(D.y);
}
}

public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.callme();
        obj.callmetoo();
    }
}