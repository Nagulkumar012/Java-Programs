import java.util.Scanner;

public class Array_left_rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int i;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int safe=arr[0];
        for(i=0;i<=a-2;i++){
            arr[i]=arr[i+1];
        }arr[a-1]=safe;
            for(i=0;i<a;i++){
                System.out.print(arr[i]+" ");
        
    }
}}
