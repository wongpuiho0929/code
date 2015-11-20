package Factory;

import java.util.ArrayList;
import java.util.Scanner;

import Memento.Caretaker;
import adapter.Xmember;
import command.Command;

public class CreateFactory implements Factory {

	private ArrayList<Xmember> MemberList;
	private Caretaker ct;
	private Scanner kb;

	@Override
	public Command Create() {
		String[] Xfactory = { "CreateClientFactory", "CreateMemberFactory" };
		CreateXMemberFactory[] Xfacts = new CreateXMemberFactory[Xfactory.length];
		String[] CommandIndex = { "wlts", "ajcs" };
		try {
			for (int i = 0; i < Xfacts.length; i++) {
				Xfacts[i] = (CreateXMemberFactory) Class.forName("Factory." + Xfactory[i]).newInstance();
				Xfacts[i].setMemberList(MemberList);
				Xfacts[i].setUndoList(ct);

			}
		} catch (Exception c) {
			c.printStackTrace();
		}
		while (true) {
			kb = new Scanner(System.in);
			System.out.println("Enter Company Code (AJCS/WLTS):");
			String temp = kb.next();
			int index = -1;
			temp = temp.toLowerCase();
			for (int i = 0; i < CommandIndex.length; i++) {
				if (temp.equals(CommandIndex[i])) {
					index = i;
				}
			}
			if (index != -1){
				Command a = Xfacts[index].Create();
				return a;
			}else 
				System.out.println("Please Enter again");
		}
	}

	@Override
	public void setMemberList(ArrayList<Xmember> MemberList) {this.MemberList = MemberList;	}

	@Override
	public void setUndoList(Caretaker ct) {	this.ct = ct; }

	@Override
	public ArrayList<Xmember> getMemberList() {	return MemberList;	}
}
