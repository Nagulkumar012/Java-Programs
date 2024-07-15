import java.util.*;
public class Adamnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//12
        int sqr=square(a);//144
        int rev=reverse(a);//21
        int sqr_rev=square(rev);//441
        int rev_sqr_rev=reverse(sqr_rev);//144
        if(sqr==rev_sqr_rev){
            System.out.println("Adam number");
        }
        else{
            System.out.println("Not a adam number");
        }
    }
    public static int square(int m){
        return m*m;
    }
    public static int reverse(int m){
        int d;
        int temp=0;
        while(m!=0){
            d=m%10;
            temp=temp*10+d;
            m=m/10;
        }
        return temp;
    }
}