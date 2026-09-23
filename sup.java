
    class A{
        int x=10;
    }

    class B extends A{
        int x=20;

        void display() {
            System.out.println(x+super.x);
        }


    class sup { 
        public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    }
}

