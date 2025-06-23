package C03Inheritance;

// extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는것.
public class C03Inheritance extends Parents {
    public static void main(String[] args) {
        C03Inheritance
    }
}

class Parents {
    public int a = 20;

    public void m1(){
        System.out.println("부모 클래스 입니다.");
    }
}
