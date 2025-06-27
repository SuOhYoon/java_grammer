package C08Thread;

public class ThreadMain {
    public static void main(String[] args) {
//        단일스레드 실행
        for(int i=0;i<1000;i++){
            Library.borrow();
        }
        System.out.println(Library.getBookCount());
    }
}
