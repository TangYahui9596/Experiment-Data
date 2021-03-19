package Mail;

import java.util.List;

import ObserverPattern.Observer;

/**
 * this is the subject
 * @author cliu3
 *
 */
public class MailingServer{
	public List<Member> members;
	public MailingServer(List<Member> members) {
		// TODO Auto-generated constructor stub
		this.members=members;
	}

	public void register(Member member) {
		// TODO Auto-generated method stub
		members.add(member);
		
	}

	public void unregister(Member member) {
		// TODO Auto-generated method stub
		int index = members.indexOf(member);
		members.remove(index);
	}


	public void notifyMembers() {
		// TODO Auto-generated method stub
		for(Member member : members){
			member.update();
		}
	}

}
