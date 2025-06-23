package C04Interface;

public class C01Dog implements C04AnimalInterface1, C01AnimalInterface2{
    @Override
    public void makeSound() {
        System.out.println("멍멍멍");
    }
}
