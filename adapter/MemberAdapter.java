package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import AJCS.Member;

public class MemberAdapter extends Xmember{
	private Member member;
	private SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
	
	public MemberAdapter(Member member) { this.member = member; }

	@Override
	public String getid() {	return member.getId(); }

	@Override
	public String getType() {
		String s = member.getClass().getName();
		s = s.substring(s.indexOf(".")+1);
		return s;
	}

	@Override
	public String getName() { return member.getName(); }

	@Override
	public String getAddress() { return member.getPostal();	}

	@Override
	public String getExpireDate() {	return date.format(member.getGoodTill()); }

	@Override
	public void setAddress(String address) { member.setPostal(address);	}

	@SuppressWarnings("deprecation")
	@Override
	public void setExpireDate() {
		Date temp =member.getGoodTill();
		temp.setYear(temp.getYear()+1);
		member.setGoodTill(temp);
	}

	@Override
	public void setid(String id) { member.setId(id); }


	@Override
	public void setName(String name) { member.setName(name); }

	@Override
	public void setExpireDate(String eDate) {
		Date temp=null;
		try {
			temp = date.parse(eDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		member.setGoodTill(temp);
	}
}
