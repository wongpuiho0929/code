package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.ListCommand;

public class ListFactory implements Factory{

	private Caretaker ct;
	
	@Override
	public Command Create() {
		Command a = new ListCommand(ct);
		return a;
	}

	@Override
	public void setMemberList(ArrayList<Xmember> MemberList) {	}

	@Override
	public void setUndoList(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public ArrayList<Xmember> getMemberList() {
		return null;
	}
}
