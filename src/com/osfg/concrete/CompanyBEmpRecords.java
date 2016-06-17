package com.osfg.concrete;

import java.util.ArrayList;
import java.util.List;

import com.osfg.interfaces.CompanyEmpRecords;
import com.osfg.interfaces.Iterator;
import com.osfg.models.Employee;

/**
 * 
 * @author athakur
 *
 */
public class CompanyBEmpRecords implements CompanyEmpRecords {
	private List<Employee> companyEmployees = new ArrayList<>();

	@Override
	public void addEmployee(Employee newEmployee) {
		companyEmployees.add(newEmployee);
	}

	@Override
	public void removeEmployee(Employee oldEmployee) {
		companyEmployees.remove(oldEmployee);
	}

	@Override
	public int getNoOfEmployees() {
		return companyEmployees.size();
	}

	@Override
	public Iterator getIterator() {
		return new CompanyBEmpRecordsIterator();
	}

	private class CompanyBEmpRecordsIterator implements Iterator {

		int currIndex = -1;
		
		@Override
		public boolean hasNext() {
			if(currIndex+1 < companyEmployees.size()) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(currIndex+1 < companyEmployees.size()) {
				return companyEmployees.get(++currIndex);
			}
			else {
				return null;
			}
		}
		
	}

}
