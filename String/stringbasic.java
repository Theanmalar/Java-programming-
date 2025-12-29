public class stringbasic{
    public static void main(String args[]){
     String s1 = "Thean";
     String s2 = "Dheebee";
     System.out.println("String 1 length : "+(s1.length()));
     System.out.println(s1.toUpperCase());
     System.out.println(s1.equals(s2));
     System.out.println(s1.concat(s2));
     System.out.println("using loop : ");
      int count=0;
     for(int i =0;i<s1.length();i++){
        char c = s1.charAt(i);
        System.out.println(c);
        Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            count++;
     }
    }
     System.out.println("First Character : "+(s1.charAt(0)));
     System.out.println("Last Character : "+(s1.charAt(s1.length()-1)));
     System.err.println("Number of vowels: "+count);
}
}