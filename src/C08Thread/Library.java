package C08Thread;

public class Library {
    private static int bookCount = 100;

    public static void borrow(){
        if(bookCount>0){
            try{

            } catch(InterruptedException e){
                
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
