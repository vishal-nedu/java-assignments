package assignments.Strings;

public class ex6 {
    public static void main(String[] args) {
        ex6 e=new ex6();
        System.out.println(ex6.clean("a$#.b"));

    }
    public static String clean(String s)
    {
        while(s.contains(" "))
        {
           s= s.replace(" ","_");
        }
        String ans="";
        boolean b=false;
        if(s.contains("-"))
        {
            b=true;
            int ind=s.indexOf('-');
            for(int i=0;i<s.length();i++)
            {
                if(i==ind)
                {
                    continue;
                }
                else if(i>ind)
                {
                    char ch=Character.toUpperCase(s.charAt(i));
                    ans+=ch;
                }
                else {
                    ans+=s.charAt(i);
                }
            }
        }
        if(b)
        {
            s=ans;
        }

        String ans1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                if(s.charAt(i)=='4')
                {
                    ans1+='a';
                }
                if(s.charAt(i)=='3')
                {
                    ans1+='e';
                }
                if(s.charAt(i)=='0')
                {
                    ans1+='o';
                }
                if(s.charAt(i)=='1')
                {
                    ans1+='l';
                }
                if(s.charAt(i)=='7')
                {
                    ans1+='t';
                }
            } else if (s.charAt(i)=='_')
            {
                ans1+=s.charAt(i);
                continue;

            } else if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i)))
            {
                continue;
            }
            else {
                ans1+=s.charAt(i);
            }
        }
        return ans1;
    }

}
