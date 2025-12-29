public class casereverse_string {
    public static void main(String[] args) {
        char arr[] = {'N','o','1','b','Y','e'};
        String s = "";
        for(int i =0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i]))
            s+=Character.toLowerCase(arr[i]);
            else
            s+=Character.toUpperCase(arr[i]);
        }                                 //changing case of character and printing all as string
        System.out.print("String from characters : "+s);
    }
}
