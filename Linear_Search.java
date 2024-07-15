import java.util.Scanner;

public class Linear_Search {
    

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    int i;

    for(i=0;i<a;i++){
        arr[i]=sc.nextInt();
    }
    int b=sc.nextInt();
    for(i=0;i<a;i++){
        if(arr[i]==b){
            break;
        }
    }
    if(i<a){//If i < a, it means that the loop was exited early due to the break statement, which indicates thattarget element b isfound inarray.
        //For example, if the array size a is 5 and the target element b is found at index 2,loop will exit when i is 2, which is less than `a
        System.out.println("Element found at "+i);
    }
    else{
        System.out.println("Element not found");
    }
}
}
