//compresses a string by counting consecutive identical characters and appending the character followed by its count (if greater than 1) to the output string. //
import java.util.Scanner;
public class CompressesString {
   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");

String input = sc.nextLine();

int count = 1;

char last = input.charAt(0);

StringBuilder output = new StringBuilder();

for(int i = 1; i < input.length(); i++){
    if(input.charAt(i) == last){
    count++;
    }else{
        if(count > 1){
            output.append(""+last+count);
        }else{
            output.append(last);
        }
    count = 1;
    last = input.charAt(i);
    }
}
if(count > 1){
            output.append(""+last+count);
        }else{
            output.append(last);
        }

System.out.println(output.toString());
        
    }
}
    

