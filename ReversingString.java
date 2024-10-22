//By using StringBuilder and reverse method
public class ReversingString {
    public static void main (String[] args){
        String S1= "Mahalakshmi";
        String S2= new StringBuilder(S1).reverse().toString();
        System.out.println(S2);
    }
    
}
