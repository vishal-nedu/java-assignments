package assignments.Strings;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] st=s.split(" ");
        String ans="";
        for(int i=st.length-1;i>=0;i--)
        {
            ans+=st[i];
            ans+=" ";
        }
        System.out.println(ans);
    }
}
