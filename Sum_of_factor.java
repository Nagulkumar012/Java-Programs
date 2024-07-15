import java.util.*;
public class Sum_of_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
       int sum=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                sum=sum+i;
            System.out.println(i);
        
        }}
        System.out.println(sum);
        if(sum==a)
        {
            System.out.println("perfect");
        }
        else if(sum>a){
            System.out.println("Abundant");
        }
        else{
            System.out.println("deficiency");
        }
    }
}
