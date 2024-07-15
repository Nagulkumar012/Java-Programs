import java.util.Scanner;

public class Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row, star1, space, star2;

        for (row = 1; row <= num; row++) {
            for (star1 = 1; star1 <= row; star1++) {
                System.out.print("* ");
            }
            for (space = 1; space <= 2 * (num - row); space++) {
                System.out.print("  ");
            }
            for (star2 = 1; star2 <= row; star2++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (row = num; row >= 1; row--) {
            for (star1 = 1; star1 <= row; star1++) {
                System.out.print("* ");
            }
            for (space = 1; space <= 2 * (num - row); space++) {
                System.out.print("  ");
            }
            for (star2 = 1; star2 <= row; star2++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
