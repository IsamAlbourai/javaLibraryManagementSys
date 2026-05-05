import Menu.LibraryMenu;
import Services.BorrowService;
import Services.LibraryService;
import Services.MemberService;

public class Main {
    public static void main(String[] args) {
        LibraryService lib = new LibraryService();
        MemberService mem = new MemberService();
        BorrowService bor = new BorrowService(lib, mem);

        LibraryMenu menu = new LibraryMenu(lib, mem, bor);
        menu.start();
    }
}
