class A {
    static void show() {
        System.out.println("Hello from Class A");
    }
}

class B {
    static void show() {
        System.out.println("Hello from Class B");
    }
}

class Show {
    public static void main(String args[]) {
        A.show();
        B.show();
    }
}
