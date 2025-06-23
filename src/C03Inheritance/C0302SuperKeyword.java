package C03Inheritance;

public class C0302SuperKeyword extends SuperParents{
    int a = 10;
    public static void main(String[] args) {
        C0302SuperKeyword c2 = new C0302SuperKeyword();
        System.out.println(c2.a);
        c2.display();
    }

    public void display(){
        System.out.println("자식의 변수 : " + a);
        System.out.println("부모의 변수 : " + super.a);
    }
}

class SuperParents{
    int a;
    int b = 20;

    public SuperParents(){
        int c = 20;
    }
}
