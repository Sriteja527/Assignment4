import java.util.*;
public class Anagram{
    Scanner sc = new Scanner(System.in);
    void input(){
        int count = 0;
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<s1.length();i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<s2.length();i++){
            for(int j=i+1;j<s2.length();j++){
                if(arr1[i] > arr1[j]){
                    char swap = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = swap;
                }
            }
        }
        for(int i=0;i<s2.length();i++){
             System.out.println(arr1[i]);
        }
        for(int i=0;i<s1.length();i++){
            if(arr[i] == arr1[i]){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not anagram:");
            }
            break;
        }
       
    }
    public static void main(String[] args){
        Anagram a = new Anagram();
        a.input();
    }
}