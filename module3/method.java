package module3;

class OverloadExample {

    
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    
    @Override
    void show() {
        System.out.println("Child method");
    }
}

public class method {
    public static void main(String[] args) {

        
        OverloadExample obj = new OverloadExample();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));

       
        Parent p = new Child();
        p.show();
    }
}
