package day08.poly.book;

import day04.array.StringList;

import static day08.poly.book.RentStatus.*;

public class LibraryRepository {

    //회원 1명
    private static BookUser bookuser;

    //도서들의 정보
    private  static  Book[] bookList;

    static {
        bookList = new Book[]{
          new CookBook("기적의 집밥책", "김해진","청림라이프",true),
          new CookBook("삐뽀삐뽀 119 이유식", "하정훈","유니책방",false),
          new CookBook("오늘은 아무래도 덮밥", "이마이 료","참돌",true),
          new CartoonBook("떨어지면 끝장맨","스에노부케이코","대원씨아이",18),
          new CartoonBook("원펀맨","One","대원씨아이",15),
          new CartoonBook("이세계로 전이했더니 치트를살려 마법사가 되기로했다.","two","대원씨아이",12),
        };
    }
    //유저를 등록하는 기능
    public void register(BookUser userInfo){
        bookuser = userInfo;
    }

    //마이페이지 기능
    /*
    * 여기에 있는 bookUser 정보 리턴
    * */
    BookUser findBookUser(){
        return bookuser;
    }
    //모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList(){
        String[] infoList = new String[bookList.length];
        for (int i = 0; i <infoList.length ; i++) {
            infoList[i] = bookList[i].info();
        }
        return  infoList;
    }

    //검색어를 받으면 해당 검색어를 포함하는 책 정보들을 반환하는 함수
    public String[] searchBookList(String keyword){
        //bookList를 뒤져야함(search)
        StringList list = new StringList();
        for (Book book:bookList) {
            String title = book.getTitle();
            if(title.contains(keyword)){
                //검색어에 걸린 책의 정보 문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    public String[] findbyAuthorName(String authorName) {
        StringList list = new StringList();
        for (Book book:bookList) {
            String Author = book.getAuthor();
            if(Author.equals(authorName)){
                //검색어에 걸린 책의 정보 문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    public String[] findByBookName(String bookName) {
        StringList list = new StringList();
        for (Book book:bookList) {
            String Title = book.getTitle();
            if(Title.equals(bookName)){
                //검색어에 걸린 책의 정보 문자
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    //도서 대여 처리
    public RentStatus rentBook(int rentNum){
        //대여를 원하는 책 추출
        Book wishBook = bookList[rentNum-1];

        //책의 분류에 따라 다른 처리
        if(wishBook instanceof CookBook) {
            CookBook cookBook = (CookBook) wishBook;
            //쿠폰 유무를 확인
            if (cookBook.isCoupon()) {
                bookuser.setCouponCount(bookuser.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            }else{
                return RENT_SUCCESS;
            }
        }else if (wishBook instanceof CartoonBook) {
            CartoonBook cartoonBook = (CartoonBook) wishBook;
                //연령제한을 확인
            if(bookuser.getAge()>=cartoonBook.getAccessAge()){
                //빌릴 수 있는 경우
                return RENT_SUCCESS;
            }else{
                return RENT_FAIL;
            }
        }
        return RENT_FAIL;
    }
}

