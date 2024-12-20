package ch06;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("원동인", "won", "123");
        member.print();
        member.login();
        member.logout();
    }
}
