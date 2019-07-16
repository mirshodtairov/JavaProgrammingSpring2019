import javax.swing.text.StyledEditorKit.BoldAction;

public class Person {
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}
	public String getBirthday() {
		String bday = birthmonth+"/"+birthday+"/"+birthyear;
		
		
		return bday;
		
	}
	public boolean verifySSN(String perssn) {
		if(perssn.equals(ssn)) {
			return true;
		}else {
			return false;
		}
		
	}

}
