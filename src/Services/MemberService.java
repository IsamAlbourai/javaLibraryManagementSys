package Services;

import Entities.Member;

import java.util.ArrayList;

public class MemberService {
    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMemberById(int id) {
        for (Member m : members) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    public void listMembers() {
        for (Member m : members) {
            System.out.println(m.getDetails());
        }
    }
}
