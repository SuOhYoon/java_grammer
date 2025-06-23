package C04Interface;

public class C01Cat implements C04AnimalInterface1, C01AnimalInterface2{
    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }
}
