package AJCS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Member {
	private String id;
	private Date goodTill;
	private String name;
	private String postal;
	private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	
	public abstract boolean validate(String id);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getGoodTill() {
		return goodTill;
	}

	public void setGoodTill(Date goodTill) {
		this.goodTill = goodTill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	/*public Member(String id, String name, String postal) throws Exception {
		this.id = id;
		this.goodTill = new Date();
		this.goodTill.setYear(goodTill.getYear()+1);
		this.name = name;
		this.postal = postal;
	}*/

	@Override
	public String toString() {
		return "Member [id=" + id + ", goodTill=" + dateFormat.format(goodTill) + ", name=" + name
				+ ", postal=" + postal + "]";
	}
	
	
	
	
}
