package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Choi");
        member.print();
        member.changeData("myId2", "Kim");
        member.print();
    }
}
