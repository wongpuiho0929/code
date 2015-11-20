package Memento;

public class DataCopy {
	private String name,address,date;

	public DataCopy(String name, String address, String date) {
		this.name = name;
		this.address = address;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
