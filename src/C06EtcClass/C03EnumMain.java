package C06EtcClass;

public class C03EnumMain {

    static final String c1 = "first_grade";
    static final String c2 = "second_grade";
    static final String c3 = "third_grade";

    public static void main(String[] args) {
//        Student s1 = new Student("hong", "1학년");
//        Student s2 = new Student("hong2", "firstGrade");
//        Student s3 = new Student("hong3", "first_grade");

//        static final을 통해 변수값
//        Student s1 = new Student("hong", c1);
//        Student s2 = new Student("hong2", c2);
//        Student s3 = new Student("hong3", c3);

//        Student s1 = new Student("hong", ClassGrade.c1);
//        Student s2 = new Student("hong2", ClassGrade.c2);
//        Student s3 = new Student("hong3", ClassGrade.c3);

    }
}

class Student{
    private String name;
    private String classGrade;

    public Student(String name, String classGrade) {
    }
}

//class ClassGrade{
//    static final String c1 = "first_grade";
//    static final String c2 = "second_grade";
//    static final String c3 = "third_grade";
//
//}

enum ClassGrade{
    First_Grade, SECOND_GRADE, THIRD_GRADE
}