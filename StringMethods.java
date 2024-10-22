public class StringMethods {
    public static void main(String [] args){
        String s1="Mahalakshmi Palvadi";
        String s2=new String("Mahalakshmipalvadi");
        String s="is good";
        String t="  hello World  ";
        int Length=s1.length();
        System.out.println(Length);//prints length of string including whitespaces
        System.out.println(s2.length());//Actual length for reference
        System.out.println(s1.charAt(4));
        System.out.println(s1+s);
        System.out.println(s1.concat(s));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(0,4));
        System.out.println(s1.contains("is good"));
        System.out.println(s1.endsWith("di")); 
        System.out.println(s.indexOf("good"));
        System.out.println("Occurence of a for the last time  "+ s1.lastIndexOf("a"));
        System.out.println(t.trim());//removes starting and ending spaces
        System.out.println(s1.replaceAll("a", "aa"));




        
                
        
               
        
        
            }
            
        }


    
    

