package Menu;

import Entities.Address;
import Entities.Book;
import Entities.Magazine;
import Entities.Member;
import Services.BorrowService;
import Services.LibraryService;
import Services.MemberService;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryService libraryService;
    private MemberService memberService;
    private BorrowService borrowService;
    private Scanner scanner = new Scanner(System.in);

    public LibraryMenu(LibraryService lib, MemberService mem, BorrowService bor) {
        this.libraryService = lib;
        this.memberService = mem;
        this.borrowService = bor;
    }

    public void start() {
        while (true) {
            System.out.println("---------------- Library Menu -----------------");
            System.out.println("\n1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. List Available Items");
            System.out.println("4. Search Item");
            System.out.println("5. Add Member");
            System.out.println("6. List Members");
            System.out.println("7. Borrow Item");
            System.out.println("8. Return Item");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    libraryService.addItem(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int mid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter title: ");
                    String mtitle = scanner.nextLine();
                    System.out.print("Enter issue: ");
                    int issue = scanner.nextInt();
                    libraryService.addItem(new Magazine(mid, mtitle, issue));
                    break;

                case 3:
                    libraryService.listAvailableItems();
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = scanner.nextLine();
                    libraryService.searchByTitle(keyword);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int memId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Street: ");
                    String street = scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Postal: ");
                    String postal = scanner.nextLine();

                    Address address = new Address(street, city, postal);
                    memberService.addMember(new Member(memId, name, address));
                    break;

                case 6:
                    memberService.listMembers();
                    break;

                case 7:
                    System.out.print("Member ID: ");
                    int mId = scanner.nextInt();
                    System.out.print("Item ID: ");
                    int iId = scanner.nextInt();
                    borrowService.borrowItem(mId, iId);
                    break;

                case 8:
                    System.out.print("Member ID: ");
                    int rmId = scanner.nextInt();
                    System.out.print("Item ID: ");
                    int riId = scanner.nextInt();
                    borrowService.returnItem(rmId, riId);
                    break;

                case 9:
                    System.out.print("Exiting...");
                    return;
            }
        }
    }
}