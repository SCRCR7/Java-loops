class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Stu {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John Doe");

        System.out.println("student_1 name: " + student1.getName());
        System.out.println("student_2 name: " + student2.getName());
    }
}
