import java.util.Scanner;
public class uniqueduplicate {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of array : ");
     int n = sc.nextInt();
     System.out.println("Enter the array elements : ");
     int arr[] = new int[n];
     for (int i = 0; i<n; i++) {
         arr[i] = sc.nextInt();
     }
     System.out.print("Duplicate Elements : ");
     for (int i = 0; i < n; i++) {
         for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                System.out.print(arr[i]+" ");
            }
    }
    }
   System.err.println();
    System.out.print("Unique elements : ");
    for (int i = 0; i < n; i++) {
        boolean isuni = true;
        for(int j= 0;j<n;j++){
            if(i!=j && arr[i]==arr[j]){
               isuni = false;
            }
        }
        if(isuni){
         System.out.print(arr[i]+" ");
    }
    }
}
}
