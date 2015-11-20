package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.CreateMember;

public class CreateMemberFactory implements CreateXMemberFactory {

	private ArrayList<Xmember> MemberList;
	private Caretaker ct;

	@Override
	public Command Create() {
		Command a = new CreateMember(MemberList,ct);
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
}
