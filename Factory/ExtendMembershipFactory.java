package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.ExtendMembership;

public class ExtendMembershipFactory implements Factory{

	private ArrayList<Xmember> MemberList;
	private Caretaker ct;
	@Override
	public Command Create() {
		Command a = new ExtendMembership(MemberList,ct);
		return a;
	}

	@Override
	public void setMemberList(ArrayList<Xmember> MemberList) {
		this.MemberList = MemberList;
	}

	@Override
	public void setUndoList(Caretaker ct) {
		this.ct =ct;
	}

	@Override
	public ArrayList<Xmember> getMemberList() {
		return MemberList;
	}
}
