package C08Thread;

public class Library {
    private static int bookCount = 100;

    public static void borrow(){
        if(bookCount>0){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount-=1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출불가");
        }
    }

    public static int getBookCount() {
        return bookCount;
    }
}
