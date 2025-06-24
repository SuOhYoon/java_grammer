package C05AnonymousLambda;

//익명 내부클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명클래스가 만들어짐과 동시에 익명객체가 생성되고 있음.
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {

            }
        }
    }
}

abstract class AbstractAnimal{
    abstract void makeSound1();
    void makeSound2(){

    }
}