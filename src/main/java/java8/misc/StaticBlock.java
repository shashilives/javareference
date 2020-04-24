package java8.misc;

public class StaticBlock {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
    }
}

class A {
    static {
        System.out.println("First");
    }

    {
        System.out.println("Third");
    }
}

class B extends A {
    static {
        System.out.println("Second");
    }

    {
        System.out.println("Fourth");
    }
}

