package assignments.Strings;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String[] st=s.split(" ");
        String a="";
        for(int i=0;i<st.length;i++)
        {
            String temp=st[i];
            char ch=Character.toUpperCase(temp.charAt(0));
            String ans=ch+temp.substring(1,temp.length());
            a+=ans+" ";

        }
        System.out.println(a);
    }
}
