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
        Thread t1 = new MyThread();
        Thread t1 = new MyThread();
        Thread t1 = new MyThread();
    }
}
