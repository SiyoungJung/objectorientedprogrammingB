package exam1020.book;

public class Main {
    public static void main(String[] args) {
        Book[] bk = new Book[3];
        bk[0] = new Book("고등학교 통합사회2", "박윤경", "979-11-7236-283-6");
        bk[1] = new Book("고등학교 공통수학2", "장경윤", "978-98-05-05665-0");
        bk[2] = new Book("고등학교 통합과학2", "심규철", "979-11-7316-018-9");

        for (int i = 0; i < 3; i++){
            System.out.println(bk[i].getTitle());
        }

        for(Book book : bk){
            System.out.println(book.getTitle());
        }
    }
}
