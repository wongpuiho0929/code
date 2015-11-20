package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.RedoCommand;

public class RedoFactory implements Factory{

	private Caretaker ct;
	private ArrayList<Xmember> memberList;
	
	@Override
	public Command Create() {
		Command a = new RedoCommand(ct);
		return a;
	}

	@Override
	public void setMemberList(ArrayList<Xmember> MemberList) {
		this.memberList =MemberList;
	}

	@Override
	public void setUndoList(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public ArrayList<Xmember> getMemberList() {
		return memberList;
	}
}
