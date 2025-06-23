package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

//        상속 관계 일떄는 부모클래스의 타입을 자식클래스의 객체의 타입으로 지정하는 것이 가능
        Animal d2 = new Dog();
    }
}

class Animal{
    void sound(){
        System.out.println("동물이 소리를 냅니다");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("야옹");
    }
}