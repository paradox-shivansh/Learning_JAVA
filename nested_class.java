class nested_class {

    class A {

        int age = 8;

        void display() {
            System.out.println(age);
        }

        class B {

            void calc() {
                System.out.println(age + 10);
            }
        }
    }

    public static void main(String[] args) {

        nested_class outer = new nested_class();

        A obj = outer.new A();

        obj.display();

        A.B obj1 = obj.new B();

        obj1.calc();
    }
}