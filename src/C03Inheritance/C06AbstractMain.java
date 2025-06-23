package C03Inheritance;

public class C06AbstractMain {
    public static void main(String[] args) {

    }
}

class AbstractAnimal{
    void makeSound(){
        System.out.println("동물은 소리를 냅니다.");
    }

//    메서드를 선언만하고 구현이 없는 메서드 선언시 abstract키워드 사용.
    abstract void makesound2();
}

class AbstractDog{

}