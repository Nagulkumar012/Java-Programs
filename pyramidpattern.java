import java.util.Scanner;

public class pyramidpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int c;
        int d;

        for (b = 1; b <= a; b++) {
            for (c = 1; c <= a - b; c++) {
                System.out.print("  ");  
            }
            for (d = 1; d <= b * 2 - 1; d++) {
                System.out.print("* ");
            }
            System.out.println();  
        }
        
        for (b = a; b>=1; b--) {
            for (c = 1; c <= a - b; c++) {
                System.out.print("  ");  
            }
            for (d = 1; d <= b * 2 - 1; d++) {
                System.out.print("* ");
            }
            System.out.println();  
        }

        sc.close();  
    }
}
