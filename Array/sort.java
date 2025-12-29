import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i<n; i++) {
         arr[i] = sc.nextInt();
     }
     for (int i = 0; i < n; i++) {
        for(int j = i+1;j<n;j++){
        if(arr[i]>arr[j]){
           int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        } 
     }
    }
    System.out.print("The sorted array : ");
    for(int var : arr){
        System.out.print(var +" ");
    }
    }
}
