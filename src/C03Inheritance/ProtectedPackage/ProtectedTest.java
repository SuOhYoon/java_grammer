package C03Inheritance.ProtectedPackage;

import C03Inheritance.C04ProtectedClass;

public class ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
//        public접근제어자는 프로젝트 전역에서 접근가능
        p1.st1 = "hello python";
//        패키지가 달라졌으므로 defualt변수는 접근불가

    }
}
