public class VowelsFinding {
    public static void main(String[] args) {
        String s1="Mahalakshmi is a good student $$";
        int vowels=0;
        int consonents=0;
        String t1=" ";
        s1.toLowerCase();
        for(char c:s1.toCharArray()){
            if(Character.isLetter(c)){
                if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
                    t1+=c;
                    vowels++;
                }else{
                    consonents++;
                }
            }

        }
        System.out.println("vowels count:"+ vowels );
        System.out.println("Vowels are:"+t1);
        System.out.println("consonents count:"+ consonents);
    }
    
}
