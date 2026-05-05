package Services;

import Entities.LibraryItem;
import Entities.Member;

public class BorrowService {
    private LibraryService libraryService;
    private MemberService memberService;

    public BorrowService(LibraryService lib, MemberService mem) {
        this.libraryService = lib;
        this.memberService = mem;
    }

    public void borrowItem(int memberId, int itemId) {
        Member member = memberService.findMemberById(memberId);
        LibraryItem item = libraryService.findItemById(itemId);

        if (member == null || item == null) {
            System.out.println("Entities.Member or Item not found.");
            return;
        }

        if (!item.isAvailable()) {
            System.out.println("Item already borrowed.");
            return;
        }

        item.borrowItem();
        member.borrowItem(item);
        System.out.println("Item borrowed successfully.");
    }

    public void returnItem(int memberId, int itemId) {
        Member member = memberService.findMemberById(memberId);
        LibraryItem item = libraryService.findItemById(itemId);

        if (member == null || item == null) {
            System.out.println("Entities.Member or Item not found.");
            return;
        }

        item.returnItem();
        member.returnItem(item);
        System.out.println("Item returned successfully.");
    }
}
