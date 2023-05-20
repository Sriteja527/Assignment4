import java.util.*;
public class Duplicate{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the string:");
        String s = sc.nextLine(); 
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }

    }
    public static void main(String[] args){
        Duplicate d = new Duplicate();
        d.input();
    }
}