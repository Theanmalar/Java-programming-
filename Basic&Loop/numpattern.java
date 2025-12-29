import java.util.Scanner;
public class numpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        System.out.println();
        System.out.println("Pattern 1 ");//left aligned triangle numbers
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
               System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 2");//right triangle numbers repeating the same
        for(int i=1;i<=N;i++){
            for(int j=i;j==i;j++){
                for(int k=1;k<=j;k++){
                System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    }
}
