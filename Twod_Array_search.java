import java.util.*;
public class Twod_Array_search {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, j;
    int a = sc.nextInt();
    int b=sc.nextInt();
    int arr[][]=new int[a][b];
    for(i=0;i<a;i++){
        for(j=0;j<b;j++){
            arr[i][j]=sc.nextInt();
        }
    } 
    int search=sc.nextInt();
    int fla=0;
    for (i = 0; i < a; i++) {
        for (j = 0; j < b; j++) {
            if(search==arr[i][j]){
                fla=1;
                break;
            }}}
if(fla==1){
            System.out.println("Found");}
            else{
                System.out.println("Not");
            }}}




            
