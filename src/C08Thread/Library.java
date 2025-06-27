package C08Thread;

public class Library {
    private static int bookCount = 100;

//    synchronized : 메서드 내에서 1개의 스레드만 실행되도록 강제.
    public synchronized static void borrow(){
        if(bookCount>0){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount-=1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출불ㄴ");
        }
    }

    public static int getBookCount() {
        return bookCount;
    }
}
