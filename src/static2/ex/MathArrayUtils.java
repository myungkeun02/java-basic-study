package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){
        // 인스턴스 생성을 제한함
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    public static int min(int[] values) {
        int min = values[0];
        for(int value: values) {
            if(min > value) {
                min = value;
            }
        }
        return min;

    }
    public static int max(int[] values) {
        int max = values[0];
        for(int value: values) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }
}
