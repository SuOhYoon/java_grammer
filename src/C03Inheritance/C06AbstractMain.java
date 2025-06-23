package C03Inheritance;

public class C06AbstractMain {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makesound2();

//        추상클래스는 구현체없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();
        AbstractAnimal d2 = new AbstractDog();
        d2.makeSound1();
        d2.makeSound2();
    }
}

// 추상메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드를 붙이고, 추상클래스가 됨
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물은 소리를 냅니다.");
    }

//    메서드를 선언만하고 구현이 없는 메서드 선언시 abstract키워드 사용.
    abstract void makesound2();
}

class AbstractDog extends AbstractAnimal{

    @Override
    void makesound2() {
        System.out.println("멍멍");
    }
}