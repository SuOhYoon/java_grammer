package C05AnonymousLambda;

public class C01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass m1 = new MemberInnerClass();
        System.out.println(m1.getA());
    }
}

// (일반)내부 클래스
class MemberInnerClass{
    int a;
    MemberInnerClass(){
        this.a = 10;
    }

    int getA(){

    }
}
