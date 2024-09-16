public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int step = 0;
        while (num > 0) {
            step++;
            if (num % 2 == 0) {
                num = num / 2;
            }
            else {
                num = num - 1;
            }
        }
        System.out.println(step);
    }
}
