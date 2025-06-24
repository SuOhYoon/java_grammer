package C05AnonymousLambda;

//익명 내부클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
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