package command;

import java.util.ArrayList;
import java.util.Scanner;
import adapter.*;

public class ShowMember implements Command{

	private ArrayList<Xmember> memberList;
	private Scanner kb;
	
	
	public ShowMember(ArrayList<Xmember> memberList) {
		this.memberList = memberList;
	}

	public void execute() {
		kb = new Scanner(System.in);
		System.out.println("Enter id(*999 to show all)");
		String temp = kb.nextLine();
		System.out.println("\nMember information");
		System.out.println("");
		if(temp.equals("*999")){
			System.out.printf("%-12s %-14s %-20s %-15s %s","Expire Date","ID","Type","Name","Address\n");
			for(int i=0;i<memberList.size();i++){
				Xmember member = memberList.get(i);
				System.out.println(member.toString());
			}
		}else{
			for(int i=0;i<memberList.size();i++){
				Xmember member = memberList.get(i);
				if(temp.equals(member.getid())){
					System.out.println(member.toStringShowAll());
				}
			}
			
		}
		
	}
	
}
