package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;

public interface CreateXMemberFactory {
	public Command Create();
	public void setMemberList(ArrayList<Xmember> MemberList);
	public void setUndoList(Caretaker ct);
}
