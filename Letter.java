import java.util.*;
public class Letter{
    Scanner sc = new Scanner(System.in);
    void input(){
        int vowel = 0;
        int consonant = 0;
        int specialcharacter = 0;
        System.out.println("enter the string:");
        String s = sc.nextLine(); // Sriteja
        int i = 0;
        while(i < s.length()){  // 0 < 7
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){  // s == a
                        vowel++;
            }
            else{
                   consonant++;
            }
            if(s.charAt(i) == '~' || s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$' || s.charAt(i) == '%' || s.charAt(i) == '^' || s.charAt(i) == '&' 
            || s.charAt(i) == '*' || s.charAt(i) == '_' || s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == ',' 
            || s.charAt(i) == '.' || s.charAt(i) == ';' || s.charAt(i) == ':'){
                      specialcharacter++;
            }
            i++;   
        }

        System.out.println("The' vowels present in the string is:"+vowel);
        System.out.println("The consonants present in the string is:"+consonant);
        System.out.println("The special characters in the string is:"+specialcharacter);

        }
    public static void main(String[] args){
        Letter l = new Letter();
        l.input();
    }
}