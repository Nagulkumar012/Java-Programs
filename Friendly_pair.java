import java.util.*;
public class Friendly_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a3=a;
        int a1=b;
       int sum=0,sum1=0;
        for(int i=1;i<a3;i++){
            if(a3%i==0){
               sum=sum+i;
            System.out.print(i+",");
        }}
        for(int i=1;i<a1;i++){
            if(a1%i==0){
               sum1=sum1+i;
            System.out.print(i+",");
        
        }}
       int d=a/sum;
       int f=a1/sum1;
       if(d==f){
        System.out.println("Friendly");
       }
       else{
        System.out.println("Not");
       }


    }
}
