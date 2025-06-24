package C05AnonymousLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공
//        Comparable인터페이스 : compareTo메서드 선언
//        Comparator인터페이스 : compare메서드 선언

//        String클래스에 compareTo메서드 내장
//        String클래스 및 java의 많은 클래스에서 Comparable을 상속하여 compareTo메서드를 구현.
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b)); // 마이너스

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("javascript");
//        String안의 compareTo메서드를 사용해서 정렬이 이뤄짐.
        Collections.sort(myList);
        myList.sort(Comparator.naturalOrder());

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("kim",24);
        Student s2 = new Student("kim",21);
        Student s3 = new Student("kim",35);
        Student s4 = new Student("kim",15);
        Student s5 = new Student("kim",30);
        Collections.sort(studentList);
    }
}
class Student implements Comparator<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}