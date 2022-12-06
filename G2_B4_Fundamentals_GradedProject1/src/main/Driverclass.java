package main;
//import Super_Department.SuperDepartment;
import Admin_Department.Admin;
import HR_department.HR;
import Tech_Department.tech;

public class Driverclass {
	public static void main(String[]args) {
		Admin obj1 = new Admin();
		HR obj2 = new HR();
		tech obj3 = new tech();
		
		//Administration Department
		
		System.out.println("Welcome To Admin Department");
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		
		//HR Department
		
		System.out.println("Welcome To HR Department");
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println();
		
		
		//Technology Department
		
		System.out.println("Welcome To Tech Department");
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
		System.out.println();
		
		
		//Code End
		
		
	}
	
}
