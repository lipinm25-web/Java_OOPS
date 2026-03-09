package module2;
public class overloading {

    
    static int add(int a, int b) {
        return a + b;
    }

    
    static double add(double a, double b) {
        return a + b;
    }

    
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(5, 10));
        System.out.println("Sum (double): " + add(5.5, 2.5));
        System.out.println("Sum (3 ints): " + add(1, 2, 3));
    }
}