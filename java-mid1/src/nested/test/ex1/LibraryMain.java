package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("제목1", "저자1");
        library.addBook("제목2", "저자2");
        library.addBook("제목3", "저자3");
        library.addBook("백엔드 개발자 도전기", "원동인");
        library.addBook("OneMoreThing", "집스");
        library.showBooks();
    }
}
