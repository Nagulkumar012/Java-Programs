import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int temp=a;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=a;
        int sum=0;
        while (temp!=0) {
            sum+=power(temp%10,count);
            temp/=10;
        }
        if(a==sum){
        System.out.println("Armstrong number");}
        else{
            System.out.println("Not");
        }

    }
    public static int power(int base,int expo){
        int res=1,i;
        for(i=1;i<=expo;i++){
            res*=base;

        }
        return res;

    }
}
