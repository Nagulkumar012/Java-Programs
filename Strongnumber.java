import java.util.Scanner;
public class Strongnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int temp=a;
    int sum=0;
    while(temp!=0){
        sum=sum+fact(temp%10);
        temp/=10;
    }
    //System.out.println(sum);
    if(a==sum){
        System.out.println("Strong number");
    }
    else{
        System.out.println("Not");
    }
  }  
  public static int fact(int h){
    int fac=1;
    for(int i=1;i<=h;i++){
        fac*=i;
    }
    return fac;
  }
}

