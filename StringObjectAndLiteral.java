public class StringObjectAndLiteral {
   
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Hello";
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // System.out.println(str1 == str2);
        System.out.println(str2 == s1);
        System.out.println(s1 == s2);//Equals operator checks the address of the strings as s1 and s2 are objects they are stored in heap and have difeerent addresses
        System.out.println(s1.equals(s2));//.equals() method checks only the strings not the address
        System.out.println(str1.equals(s2));
    }
   
      
    


    }
    
    

