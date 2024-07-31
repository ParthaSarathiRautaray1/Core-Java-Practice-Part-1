interface IExample {
    void fun1();
}

class A implements IExample {
    public void fun1() {
        System.out.println("Hello from Class A");
    }
}

class B implements IExample {
    public void fun1() {
        System.out.println("Hello from Class B");
    }

    void fun2() {
        System.out.println("Hi");
    }
}

class C extends A{
   
    public void fun1() {
        System.out.println("One from Class C");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        C ob = new C();
        ob.fun1(); 
    }
}
