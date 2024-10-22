import java.util.regex.*;
public class Regex {
    public static void main(String[] args){
        Pattern p=Pattern.compile(".x");
        Matcher m=p.matcher("ax");
        boolean b=m.matches();
        System.out.println(b);
        boolean b2=Pattern.matches(".x","ax");
        System.out.println(b2);
        System.out.println(Pattern.matches(".x","@x"));
        System.out.println(Pattern.matches("[abc]","h"));
        System.out.println(Pattern.matches("[^abc]","h"));
        System.out.println(Pattern.matches("[a-zA-S]","T"));
        System.out.println(Pattern.matches("[NM][a-z]{5}","Mouni"));
        System.out.println(Pattern.matches("[xyz]","z"));
        System.out.println(Pattern.matches("[xyz]*",""));
        System.out.println(Pattern.matches("[xyz]+","x"));
        System.out.println(Pattern.matches("//d","1"));
        System.out.println(Pattern.matches("//D","s"));
    }
}
    

