public class reverse{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int i = 0 ,j=arr.length-1,temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];        // reversing without secondary array
            arr[j]=temp;
            i++;
            j--;
        }
        System.err.print("Reversed Array : ");
        for(int var : arr){
            System.out.print(var+" ");
        }
    }
}