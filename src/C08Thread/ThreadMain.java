package C08Thread;

public class ThreadMain {
    public static void main(String[] args) {
////        단일스레드 실행
//        for(int i=0;i<1000;i++){
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());

//        멀티스레드 생성
//        방법1. 스레드 클래스 상속방식
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
//        Thread클래스안에 start메서드 내장되어있고, start메서드는 run메서드 호출하면서 스레드 생성.
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("hello world");
//        방법2. Runnalbe을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식

    }
}
