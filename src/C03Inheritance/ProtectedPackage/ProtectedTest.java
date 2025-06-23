package C03Inheritance.ProtectedPackage;
// 같은 패키지내의 클래스가 아닌경우에는 import 필요
// 패키지 바로 하위의 모든 class는 *로 Import 가능.
// 다만, 패키지내의 패키지안의 class는 *로 import불가
import C03Inheritance.C04ProtectedClass;

// class에는 public, default 접근 제어자만 존재
public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest p1 = new ProtectedTest();
//        public접근제어자는 프로젝트 전역에서 접근가능
        p1.st1 = "hello python";
//        패키지가 달라졌으므로 defualt변수는 접근불가
//        p1.st3 = "hello python";
//        상속관계가 있을경우, 패키지가 달라도 protected변수에 접근 가능.
        p1.st4 = "hello python";

        C04ProtectedClass p2 = new C04ProtectedClass();
        p2.
    }
}
