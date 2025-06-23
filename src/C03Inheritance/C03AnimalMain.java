package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = 
    }
}

class Animal{
    void sound(){
        System.out.println("동물이 소리를 냅니다");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}