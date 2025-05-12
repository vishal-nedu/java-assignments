package assignments.Packages.Library.Members;

import java.util.ArrayList;
import java.util.List;

public class Memberobj
{
    List<Member> memberList=new ArrayList<>();
    public void addmember(Member member)
    {
        memberList.add(member);
    }
    public void displayMembers()
    {
        for(Member mem:memberList)
        {
            System.out.println(mem);
        }
    }
}
