import java.io.*;
import java.util.*;

public class Day18{
    // Write your code here.
    String stack="",queue="";
    int top=-1,front=0,rear=0;
    void pushCharacter(char c)
    {
        ++top;
        stack=stack+c;
    }
    void enqueueCharacter(char c)
    {
        queue=queue+c;
        rear++;
    }
    char popCharacter()
    {
        char c=stack.charAt(top);
        top--;
        return c;
    }
    char dequeueCharacter()
    {
        char c=stack.charAt(front);
        front++;
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
