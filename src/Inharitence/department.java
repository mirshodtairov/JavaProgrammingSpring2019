package Inharitence;

public class department {
	private int departmentId;
	private String departmentName;

	public department() {
	}

	public department(int departmentID, String departmentName) {
		this.departmentId = departmentID;
		this.departmentName = departmentName;

	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentName(String departmentId) {
		this.departmentName = departmentName;
	}

}
