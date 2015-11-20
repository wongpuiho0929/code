package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;
import command.ShowMember;

public class ShowMemberFactory implements Factory{
	
	private ArrayList MemberList;

	@Override
	public Command Create() {
		Command a = new ShowMember(MemberList);
		return 	a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
	}

	@Override
	public void setUndoList(Caretaker ct) {	}

	@Override
	public ArrayList<Xmember> getMemberList() {
		return MemberList;
	}
}
