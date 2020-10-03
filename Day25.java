import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25 {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            long n=sc.nextLong();
            int c=0,c1=0;
            if(n<=1000000000)
            {
                if(n>1){
                    for(int k=2;k<n;k++){
                        if(n%k==0){
                            c++;
                            break;
                        }
                    }
                    
                }
                else if(n==1){
                    c=1;
                }
            }
            else
            {
                int a=(int)Math.sqrt(n);
                for(int k=2;k<a;k++){
                    if(n%k==0){
                        c++;
                        break;
                    }
                    
                }
                
            }
            if(c==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}




