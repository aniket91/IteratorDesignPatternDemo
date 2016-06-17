package com.osfg.interfaces;

import com.osfg.models.Employee;

public interface CompanyEmpRecords {

	void addEmployee(Employee newEmployee);
	void removeEmployee(Employee oldEmployee);
	int getNoOfEmployees();
	Iterator getIterator();
	
	
}
