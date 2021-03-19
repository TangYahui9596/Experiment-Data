package Mail;

import java.util.ArrayList;

public class TestMail {

	public static void main(String []args)
	{
		//create the members for topic A
		ArrayList<Member> membersA = new ArrayList<Member>();
		// generate [1,5) int, a random number of subscribers
		//int num = new java.util.Random().nextInt(5)+1;
		int num=3;
		for (int i = 0; i<num; i++)
		{
			membersA.add(new Member());
		}
		
		//create the mailing server for topic A
		MailingServer msA = new MailingServer(new ArrayList<Member>());
		
		for(Member m: membersA)
		{
			msA.register(m);
		}
		
		msA.notifyMembers();

		for(int i=0;i<membersA.size();i++)
		{
			msA.unregister(membersA.get(i));
		}

		
		//create the members for topic B
		ArrayList<Member> membersB = new ArrayList<Member>();
		// generate [1,5) int, a random number of subscribers
		//num = new java.util.Random().nextInt(5)+1;
		num=2;
		for (int i = 0; i<num; i++)
		{
			membersB.add(new Member());
		}
		
		//create the mailing server for topic B
		MailingServer msB = new MailingServer(new ArrayList<Member>());
		
		for(Member m: membersB)
		{
			msB.register(m);
		}
		
		msB.notifyMembers();
		
		for(int i=0;i<membersB.size();i++)
		{
			msB.unregister(membersB.get(i));
		}
		
	}
}
