package module5;
import java.io.*;


public class ExceptionDemo {
    static void checkedExample() throws IOException {
        FileReader file = new FileReader("test.txt");
    }
    static void uncheckedExample() {
        int a = 10 / 0;   
    }

    public static void main(String[] args) {
        try {
            checkedExample();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        try {
            uncheckedExample();
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }
    }
}