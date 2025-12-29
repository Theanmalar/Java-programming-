import java.util.Scanner;
public class count_sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;
        int count =0;
        while(num!=0){
          sum += num%10;
          count++;
          num /= 10;
        }
        System.out.println("Number of digits : "+count);
        System.out.println("Total sum : "+sum);
    }
}
