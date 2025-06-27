package C08Thread;

public class Library {
    private static int bookCount = 100;

    public static void borrow(){
        if(bookCount>0){
            bookCount-=1;
            System.out.println("대출완료");
        } else {
            
        }
    }

    public static int getBookCount() {
        return bookCount;
    }
}
