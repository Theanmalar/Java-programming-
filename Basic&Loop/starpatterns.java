import java.util.Scanner;
public class starpatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars : ");
        int N = sc.nextInt();
        System.out.println();
        System.out.println("Pattern 1"); //left aligned  increase pattern upwards
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 2"); //right aligned  increase pattern upwards
        for(int i=1;i<=N;i++){
            for(int k=0;k<N-i;k++){
                System.out.print(" ");//j represents for space
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"  );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 3"); //left aligned  decrease pattern downwards
        for(int i=N;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 4"); //right aligned decrease pattern downwards
        for(int i = N;i>=1;i--){
            for(int j=0;j<N-i;j++){
                System.out.print(" ");//j represents for space
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*" );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 5"); //pyramid pattern upwards
        for(int i=1;i<=N;i++){
            for(int k=0;k<N-i;k++){
                System.out.print(" ");//j represents for space
            }
            for(int j=1;j<=i;j++){
                System.out.print("*" + " " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern 6"); //pyramid pattern downwards
        for(int i = N;i>=1;i--){
            for(int j=0;j<N-i;j++){
                System.out.print(" "); //j represents for space
            }
             for(int k = 1;k<=i;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
