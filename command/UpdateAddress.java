package command;

import java.util.ArrayList;
import java.util.Scanner;

import Memento.Caretaker;
import adapter.Xmember;

public class UpdateAddress implements Command {

	private ArrayList<Xmember> memberList;
	private Scanner kb;
	private Caretaker ct;
	private boolean found = false;

	public UpdateAddress(ArrayList<Xmember> memberList, Caretaker ct) {
		this.memberList = memberList;
		this.ct = ct;
	}

	@Override
	public void execute() {
		kb = new Scanner(System.in);
		System.out.println("Enter id");
		String temp = kb.nextLine();
		for (int i = 0; i < memberList.size(); i++) {
			Xmember member = memberList.get(i);
			if (temp.equals(member.getid())) {
				System.out.println("Enter address:");
				String address = kb.nextLine();
				ct.saveMemento(member,"Update address ");
				member.setAddress(address);
				found = true;
				System.out.println("Member address updated.");
				break;
			}
		}
		if (!found) {
			System.out.println("Cannot find any account");
		}

	}

}
