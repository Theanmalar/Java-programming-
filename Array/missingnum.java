public class missingnum {
    public static void main(String args[]){
        int n = 8;
        int arr[]={1,2,3,4,5,6,8};
        int total = n*(n+1)/2; // formula for sum of n terms
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Missing number : "+(total-sum));
    }
}
