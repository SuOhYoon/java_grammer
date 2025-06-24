package C05AnonymousLambda;

import java.util.*;

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

//        정렬방법 1. Student객체에서 Comparable을 직접 구현한 방식
//        단점 : Student객체를 직접수정해야하므로, 유연성이 떨어짐.
//        Collections.sort에서 Comparable을 구현한 객체를 요구.
        Collections.sort(studentList);
        System.out.println(studentList);

//        정렬방법2. Comparator를 구현한 익명객체를 사용.
//        Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator객체를 요구하기 때문.
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);

        String[] stArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr, Comparator.reverseOrder());
//        글자길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, )
        System.out.println(Arrays.toString(stArr));
    }
}
class Student implements Comparable<Student>{
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

//    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분.
//    두수(또는문자)의 비교의 경우 음수, 0, 양수 세 값중에 하나만 return. 이를 통해 정렬수행.
//    this가 앞에 있으면 오름차순, 뒤에 있으면 내림차순으로 내부적으로 정렬로직 동작.
    @Override
    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
        return this.getAge()-o.getAge();
    }
}