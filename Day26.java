import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc=new Scanner(System.in);
        int da=sc.nextInt();
        int ma=sc.nextInt();
        int ya=sc.nextInt();
        int de=sc.nextInt();
        int me=sc.nextInt();
        int ye=sc.nextInt();
        int fine=0;
        if(ye<ya){
            System.out.println("10000");
        }
        else if(ye==ya && me<ma){
            fine=500*(ma-me);
            System.out.println(fine);
        }
        else if(ye==ya && me==ma && de<da){
            fine=15*(da-de);
            System.out.println(fine);
        }
        else if(ye==ya && me==ma && de==da) {
            System.out.println(fine);
        }
        else if(ye==ya && me==ma && da<de) {
            System.out.println(fine);
        } 
        else if(ye==ya && ma<me) {
            System.out.println(fine);
        }
        else if(ya<ye) {
            System.out.println(fine);
        }
    }
}


