class Student {
    String name;
    static String college = "SIT";  

    Student(String name) {
        this.name = name;
    }

    static void displayCollege() {  
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Anu");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
        Student.displayCollege();
    }
}