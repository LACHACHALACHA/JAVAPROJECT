package JoinView;

public class Member {
	private String ID;
	private String PW;
	private String Name;
	private String Addr;
	private String Tel;
	private String Mail;

	public Member(String iD, String pW, String name, String addr, String tel, String mail) {
		ID = iD;
		PW = pW;
		Name = name;
		Addr = addr;
		Tel = tel;
		Mail = mail;

	}

	public String getID() {
		return ID;
	}

	public String getPW() {
		return PW;
	}

	public String getName() {
		return Name;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	@Override
	public String toString() {
		return "ID : " + ID + " PW : " + PW + " Name : " + Name;
	}

}