import java.util.Scanner;

public class Perfect_number {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=0;
    for(int i=1;i<a;i++){
        if(i%2==0){
            b=b+i;
        }
    }
    if(b==a){
        System.out.println("Perfect");
    }
    else{
        System.out.println("Not a perfect number");
    }

 }   
}
