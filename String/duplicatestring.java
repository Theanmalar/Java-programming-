import java.util.Scanner;
public class duplicatestring {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("Duplicate character :  ");
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ')
              continue;
              boolean dup = false;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j) ){
                  dup = true;
                  break;
                }
            }
            if(dup)
            continue;
            int count = 0;
          for(int k =0;k<s.length();k++){
            if(s.charAt(i)==s.charAt(k)){
                count++;
            }
          }
          if(count >1){
            System.out.print(s.charAt(i) +" ");
          }
        }
       
        System.out.println();
        System.out.print("Unique characters : ");
    for(int i =0;i<s.length();i++){
        int count =0;
        for(int j =0;j<s.length();j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
        }
        if(count ==1){
            System.out.print(s.charAt(i) + " ");
        }
    
    }
     System.err.println();
        String res = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
          boolean isdup = false;
          for(int j=0;j<res.length();j++){
            if(res.charAt(j)==c){
                isdup =true;
                break;
            }
          }
        if(!isdup){
            res = res +c;
        }
   } 
    System.out.println("After removing Duplicates : "+res);
}
}
