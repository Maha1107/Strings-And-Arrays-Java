import java.util.*;
public class LargestString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split("\\s+");
        String longestword="";
        for(String word:words){
            if(word.length()>longestword.length()){
                longestword=word;
            }
        }
        System.out.println(longestword);
    }
}


