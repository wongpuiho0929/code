package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.UndoCommand;

public class UndoFactory implements Factory{

	private ArrayList<Xmember> memberList;
	private Caretaker ct;
	
	@Override
	public Command Create() {
		Command a = new UndoCommand(ct);
		return a;
	}

	@Override
	public void setMemberList(ArrayList<Xmember> MemberList) {
		memberList = MemberList;
	}

	@Override
	public void setUndoList(Caretaker ct) {
		this.ct =ct;
	}

	@Override
	public ArrayList<Xmember> getMemberList() {
		return memberList;
	}
}
