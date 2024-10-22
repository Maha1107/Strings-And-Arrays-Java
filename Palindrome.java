//Reverse method application
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        String s2= new StringBuilder(s1).reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Given String is a palindrome");


        }else{
            System.out.println( "Given String is not a palindrome");
        }

    }
    
}
