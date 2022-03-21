package main;

import adminDepartment.AdminDepartment;
import hrDepartment.HrDepartment;
import techDepartment.TechDepartment;

public class Main {
	public static void main(String args[]) {
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday());
		System.out.println("");

		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayHoliday());
		System.out.println("");

		TechDepartment tech = new TechDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());

	}
}
  