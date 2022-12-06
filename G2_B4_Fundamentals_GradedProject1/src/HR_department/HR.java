package HR_department;
import Super_Department.SuperDepartment;

public class HR extends SuperDepartment{
	public String departmentName() {
		return ("Hr Depaertment");
	}
	public String getTodaysWork() {
		return ("Fill today's timesheet and mark your attendence");
	}
	public String getWorkDeadline() {
		return ("Complete by EOD");
	}
	public String doActivity() {
		return ("team Lunch");
	}

}
