package BookPractice;


public class LibraryRepository {

    private static BookUser bookuser;

    //도서들의 정보
    private  static  Book[] bookList;

    public void register(BookUser userinfo){
        bookuser = userinfo;
    }


   BookUser findBookUser(){
       return bookuser;
   }
}
