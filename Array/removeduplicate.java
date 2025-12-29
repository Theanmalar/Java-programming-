import java.util.Scanner;
public class removeduplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of array : ");
     int n = sc.nextInt();
     System.out.println("Enter the array elements : ");
     int arr[] = new int[n];
     for (int i = 0; i<n; i++) {
         arr[i] = sc.nextInt();
     }
    System.out.print("Array after removing duplicates : ");
     for (int i = 0; i < n; i++) {
        boolean isdup = false;
        for(int j= 0;j<i;j++){
            if(arr[i]==arr[j]){
               isdup = true;
            }
        }
        if(!isdup){
         System.out.print(arr[i]+" ");
    }
    }    
}
}
