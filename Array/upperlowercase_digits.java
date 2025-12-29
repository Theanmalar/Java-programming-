public class upperlowercase_digits {
    public static void main(String[] args) {
        char arr[] = {'1','N','O','n','g'};
        System.out.print("UpperCase letters : ");
        for(int i =0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
         System.out.print("Lowercase letters : ");
        for(int i =0;i<arr.length;i++){
            if(Character.isLowerCase(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
         System.out.println();
          System.out.print("Digits : ");
        for(int i =0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    //to remove space - if(!Character.isSpace(arr[i]))
    }
}
