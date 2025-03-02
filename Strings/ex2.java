package assignments.Strings;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        int st=0;
        int e= ch.length-1;
        while(st<=e)
        {
            char c=ch[e];
            ch[e]=ch[st];
            ch[st]=c;
            st+=1;
            e-=1;
        }
        String ans=new String(ch);
        System.out.println(ans);
    }
}
