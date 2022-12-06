package Admin_Department;
import Super_Department.SuperDepartment;

public class Admin extends SuperDepartment{
	public String departmentName() {
		return ("Admin Department");
	}
	public String getTodaysWork() {
		return ("Complete your documents Submissions");
	}
	public String getWorkDeadline() {
		return ("Complete by EOD"); 
	}

}
