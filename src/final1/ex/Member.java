package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id; // final 변수이기 떄문에 값을 초기화하여 재 할당 할 수 없다.
        this.name = name;
    }

    public void print (){
        System.out.println("id =" + id + ", name =" + name);
    }
}
