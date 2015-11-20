package WLTS;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import adapter.Xmember;

public class ClientCare {
	private Client[] clients;
	private int typeMemberIndex = -1;
	private String[] typeMember = { "VIP", "VIPF" };
	private ArrayList<Xmember> memberList;

	public ClientCare(Client[] clients, ArrayList<Xmember> memberList) {
		this.clients = clients;
		this.memberList = memberList;
	}

	public Client createClient() {
		Scanner kb = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			String statement = kb.nextLine();
			String[] eachStatement = statement.split(";");// separate the user
															// input by ";".
			if (eachStatement.length != 4) {
				System.out.println("Please Enter like \"id;type;name;address\"");
			} else {
				for (int i = 0; i < typeMember.length; i++) {
					if (eachStatement[1].equals(typeMember[i])) {
						typeMemberIndex = i;
					}
				}
				// Find the type in the String [] typeMember.
				if (typeMemberIndex != -1) {
					Client a = clients[typeMemberIndex];
					if (validate(eachStatement[0])) {
						a.setCid(Integer.parseInt(eachStatement[0]));
						a.setFullName(eachStatement[2]);
						Date date = new Date();
						date.setYear(date.getYear() + 1);
						a.setExpiryDate(date);
						a.setHomeAddress(eachStatement[3]);
						return a;
					} else {
						loop = false;
					}
				} else {
					System.out.println("No this type. Please input type like \"VIP\" or \"VIPF\"");
					loop = false;
				}
			}
		}
		return null;

	}

	public Client foundClient(int cid) {
		return null;

	}

	public void amendAddress(int cid) {

	}

	public void extendExpiryDate(int cid) {

	}

	public boolean isExpired(int cid) {
		return false;

	}

	public boolean validate(String id) {
		boolean chk = false;
		char[] temp = id.toCharArray();
		int total = 0;
		for (int i = 0; i < temp.length; i++) {
			total += Integer.parseInt(temp[i] + "");
		}
		if (typeMemberIndex == 0) {
			if (Integer.parseInt(temp[0] + "") == 3) {
				if (total % 6 == 0) {
					chk = true;
				}
			}

		} else if (typeMemberIndex == 1) {

			if (Integer.parseInt(id.substring(0, 3)) == 303) {
				if (total % 6 == 0) {
					chk = true;
				}
			}

		}
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getid().equals(id)) {
				chk = false;
				System.out.println("Already have this record");
				return chk;
			}
		}
		if (!chk) {
			System.out.println("Wrong ID");
			return chk;
		}
		if(temp.length !=9){
			chk =false;
			System.out.println("ID'length must be 9");
			return chk;
		}
		return chk;

	}
}
