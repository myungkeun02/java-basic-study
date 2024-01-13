package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAge = {15, 16, 19, 20};
        int[] studentGrade = {90, 80, 90, 100};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + studentAge[i] + "  성적: " + studentGrade[i]);
        }
    }
}

// 이 코드에서 값을 수정할떄... 만약 학생2를 삭제했을떄 정확히 학생2의 이름, 나이, 성적을 삭제해야한다.
// 사람이 관리하기 상당히 힘든 구조..!