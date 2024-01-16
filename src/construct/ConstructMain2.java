package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        MemberConstruct member3 = new MemberConstruct("user3", 17);

        MemberConstruct[] members = {member1, member2, member3};


        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }
}

// 같은 생성자 이름으로 전달받는 매개변수를 다르게 만들어도 오버로딩을 통해 자동으로 맞는 생성자를 호출하여 사용한다.