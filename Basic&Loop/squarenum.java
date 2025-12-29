public class squarenum {
    public static void main(String[] args) {
    int sum =0;
    for(int i=1;i<=10;i++){
        int j= i*i;
        System.out.print(j + " ");
        sum +=j;
    }
    System.err.println();
    System.out.println("Total sum of squares : "+sum);
}
}
