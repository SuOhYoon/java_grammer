package C06EtcClass;

public class C03EnumMain {
    public static void main(String[] args) {
        Student s1 = new Student("hong", "1학년");
        Student s2 = new Student("hong2", "firstGrade");
        Student s3 = new Student("hong3", "first_grade");

    }
}

class Student{
    private String name;
    private String classGrade;

    public Student(String name, String classGrade) {
    }
}