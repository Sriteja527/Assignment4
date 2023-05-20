import java.util.*;
public class Palindrome{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("enter the number:");
        int n = sc.nextInt(); // 121
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("It is a palindrome:");
        }
        else{
            System.out.println("It is not palindrome:");
        }
    }
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.input();
    }
}