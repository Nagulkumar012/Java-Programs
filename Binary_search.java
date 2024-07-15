import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int first=0,last=a-1,mid;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        int key=sc.nextInt();
        
        while(first<=last)
        {
            mid=(first+last)/2;
            if(arr[mid]==key){
                break;
            }
            else{
                if(arr[mid]<key){
                    first=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
        }
        if(first<=last){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
        
    }
}
