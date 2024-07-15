import java.util.Scanner;

public class Sort_Bubble {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
         int arr[]=new int[a];
         int i;
          for(i=0;i<a;i++){
        arr[i]=sc.nextInt();
    }
    int pass,temp;
    for(pass=0;pass<=a-2;pass++){
        for(i=0;i<a-1-pass;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }        
        }
    }
    int k=sc.nextInt();
       // for(i=0;i<a;i++){
            System.out.print(arr[k]+" ");
       // }
    
    }
}
