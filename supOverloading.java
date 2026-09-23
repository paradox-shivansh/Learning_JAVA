class Parent{
    Parent(){
        System.out.println("No paramenters");
    }

    Parent(int x){
        // System.out.println("One parameter");
        System.out.println("One parameter" + x);
    }
}

class Child extends Parent{
    Child(){
        super(10);// the sequence of the constructor is first parent class constructor will be called then child class constructor will be called. Because parent class constructor is called first then child class constructor is called. If we don't call the parent class constructor explicitly then the default constructor of the parent class will be called.
        System.out.println("Child class constructor");
    }
}

class supOverloading {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}