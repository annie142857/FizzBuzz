public class Multiples {
    public static void main(String[] args) {
        int multiplesof3 = 1000 / 3;
        int multiplesof5 = 1000 / 5;
        int multiplesof15 = 1000 / 15;
        int total = multiplesof3 + multiplesof5 - multiplesof15;
        System.out.println(total);

    }
}
