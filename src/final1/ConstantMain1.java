package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수" + Constant.MAX_USERS);
        // 상수를 사용하지 않고 그냥 1000이라는 숫자를 대입하게되면 유지 보수할때 1000이라는 값이 어떤 의미를 가지는지 알기 힘들고
//        숫자를 하나 바꿀때 1000을 사용하는 모든 코드를 수정해야한다
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount){
        System.out.println("참여자 수:" + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다");
        } else {
            System.out.println("게임에 참여합니다");
        }
    }
}
