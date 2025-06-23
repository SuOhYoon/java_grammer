package C04Interface;

public class C04InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();

        C01Dog d1 = new C01Dog();
        d1.makeSound();

        C04AnimalInterface1 c2 = new C01Cat();
        c1.makeSound();

        C01Dog d2 = new C01Dog();
        d1.makeSound();
    }

}
