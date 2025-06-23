package C03Inheritance;

// extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는것.
public class C03Inheritance extends Parents {
    public int b = 20;
    public static void main(String[] args) {
        C03Inheritance c1 = new C03Inheritance();
//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
//        System.out.println(c1.c);
//        메서드 상속
        c1.m1();
        c1.m2();
    }

//    부모 메서드와 재정의(overriding) : 부모 클래스의 메서드명과 자식클래스의 메서드명이 동일한 상황
    @Override 
    public void m1(){
        System.out.println("자식 클래스 입니다.");
    }

    public void m2(){
        System.out.println("자식 클래스의 m2메서드 입니다.");
    }
}

class Parents {
    public int a = 20;
// private 접근제어자는 클래수 내부에서만 접근가. 자식 클래스에서도 접근 불가
    private int c = 20;

    public void m1(){
        System.out.println("부모 클래스 입니다.");
    }
}
