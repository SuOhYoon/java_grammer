package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();

        C01Dog d1 = new C01Dog();
        d1.makeSound();

//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰 수 있음.
        C01AnimalInterface1 c2 = new C01Cat();
        c1.makeSound();

        C01AnimalInterface1 d2 = new C01Dog();
        d1.makeSound();

//        예시
//        인터페이스의 장점 : 개발의 표준을 지정
//        다형성의 장점 :
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.remove(30);
        list1.add(40);
        list1.get(0);

//        다중구현(상속)
        C01AnimalInterface1 c3 = new C01Cat();
        C01AnimalInterface2 d3 = new C01Dog();
        System.out.println(d3.play("말티푸", "시바견"));

//        다중구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한.
        List<Integer> list = new LinkedList<>();
//        list.get();
        Queue<Integer> queue = new LinkedList<>();
        queue.size();
     }
}
