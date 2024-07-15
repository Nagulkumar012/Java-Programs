import java.util.*;
public class Two_Dimensional_Identical {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int flag=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i!=j){
            if(arr[i][j]!=0){
                flag=1;
                break;}}
                else{
            if(i==j){
                if(arr[i][j]!=1){
                    flag=1;
                    break;
            }   
        }}}
        if(flag==1)
        break;
    }
    if(flag!=1){
        System.out.println("Identical");
    }
    else{
        System.out.println("Not");
    }

}}


