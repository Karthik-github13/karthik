import java.util.Scanner;

public class sub{
    public static void main(String[] args) {
        String cipher="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        String plain = sc.nextLine();
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
    for(int i=0;i<plain.length();i++) {
          char p = plain.charAt(i); 
 if (Character.isLetter(p)) { 
 int j = str1.indexOf(Character.toLowerCase(p)); 
 char e = str2.charAt(j); 
 if (Character.isUpperCase(p)) { 
 e = Character.toUpperCase(e); 
 } 
 cipher = cipher + e; 
 } 
else { 
 cipher = cipher + p; 
 }
 } 
 System.out.println("Cipher text is: " + cipher); 
 } 
}
       
