package command;

import java.util.ArrayList;


import Memento.Caretaker;
import WLTS.Client;
import WLTS.ClientCare;
import WLTS.VIP;
import WLTS.VIP_Family;
import adapter.ClientAdapter;
import adapter.Xmember;

public class CreateClient implements Command {

	private ArrayList<Xmember> memberList;
	private Caretaker ct;
	
	
	public CreateClient(ArrayList<Xmember> memberList,Caretaker ct) {
		this.memberList = memberList;
		this.ct = ct;
	}
	

	@Override
	public void execute() {
		System.out.println("Enter id;type;name;address:");
		Client [] client = {new VIP(),new VIP_Family()};
		ClientCare m1 = new ClientCare(client,memberList);
		try{
		Client a = m1.createClient();
		// Client convert to Xmember and store into the memberList, and put the action to the Memento.
		Xmember xmem = new ClientAdapter(a);
		ct.saveMember(memberList,xmem.getid(),"Create ");
		memberList.add(xmem);
		System.out.println("New member record created.");
		}catch(Exception ex){
			System.out.println("Please try again");
		}
	}

	

}
