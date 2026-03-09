package module2;
class Student {
    String name;
    int age;

    
    Student() {
        name = "Unknown";
        age = 0;
    }

    
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class contructor {
    public static void main(String[] args) {

        
        Student s1 = new Student();
        s1.display();

        
        Student s2 = new Student("Rahul", 20);
        s2.display();
    }
}