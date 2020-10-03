import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T,l;
        char c;
        String S,S1;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        S=sc.nextLine();
        if(T>=1 && T<=10)
        {
        for(int i=1;i<=T;i++)
        {
            
            S=sc.nextLine();
            l=S.length();
            S1="";
            if(l>=2 && l<=10000)
            {
                for(int j=0;j<=l-1;j++)
                {
                    c=S.charAt(j);
                    if(j%2==0)
                    {
                        System.out.print(c);
                    }
                    else
                    {
                        S1=S1+c;
                    }
                }
                System.out.println(" "+S1);
            }
        }
        }
    }
}


