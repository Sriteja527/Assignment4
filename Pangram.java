import java.util.*;
public class Pangram  
{  
static int size = 26;  
static boolean isLetter(char ch)  
{  
if (!Character.isLetter(ch))  
return false;    
return true;  
}   
static boolean containsAllLetters(String str, int len)  
{  
str = str.toLowerCase();   
boolean[] present = new boolean[size];  
for (int i = 0; i < len; i++)   
{   
if (isLetter(str.charAt(i)))   
{  
int letter = str.charAt(i) - 'a';   
present[letter] = true;  
}  
}  
for (int i = 0; i < size; i++)   
{  
if (!present[i])   
return false;  
}  
return true;  
}  
public static void main(String args[])  
{  
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the string:");
String str = sc.nextLine();  
//determines the length of the given string  
int len = str.length();  
//function calling  
if (containsAllLetters(str, len))  
System.out.println("The given string is a pangram string.");  
else  
System.out.println("The given string is not a pangram string.");  
}  
}  