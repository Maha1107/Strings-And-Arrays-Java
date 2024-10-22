import java.util.Scanner;
import java.lang.*;
public class Strings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:");
        String s1 =sc.nextLine();
        String s2="Dhoni";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Matching");
        }
        else{
            System.out.println("Not Matching");
        }


    }
    
}
