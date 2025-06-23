package C03Inheritance;

// extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는것.
public class C03Inheritance extends Parents {
    public int b = 20;
    public static void main(String[] args) {
        C03Inheritance c1 = new C03Inheritance();
//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
    }
}

class Parents {
    public int a = 20;

    private int c = 20;

    public void m1(){
        System.out.println("부모 클래스 입니다.");
    }
}
